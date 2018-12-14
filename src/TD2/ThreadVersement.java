package TD2;

public class ThreadVersement extends Thread
{
    Compte monCompte;

    public ThreadVersement(Compte monCompte)
    {
        this.monCompte = monCompte;
    }

    public void run()
    {
        for(int i=0;i<5000;i++)
        {
            monCompte.versement(10.0);
        }
    }
}


