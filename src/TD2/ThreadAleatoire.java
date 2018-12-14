package TD2;

import com.sun.corba.se.impl.orbutil.concurrent.Sync;

public class ThreadAleatoire extends Thread
{
    Compte c;
    TraceOperation trace;

    public ThreadAleatoire(Compte c, TraceOperation tr)
    {
        this.c = c;
        this.trace = tr;
    }

    public void run()
    {
        for(int i=0;i<10000;i++)
        {
            double a = Math.random();
            double s = (Math.random() + 1) * 100;
            if (a <= 0.7) {
                synchronized (c) {
                    synchronized (trace) {
                        c.versement(s);
                        trace.traceVersement();
                    }
                }
            }
            else
                {
                synchronized (c)
                {
                    synchronized (trace)
                    {
                        c.retrait(s);
                        trace.traceRetrait();
                    }
                }
            }
        }
    }
}
