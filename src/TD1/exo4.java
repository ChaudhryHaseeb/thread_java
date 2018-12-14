package TD1;

import java.lang.*;

public class exo4 extends Thread
{

    private int tab [];
    private char c;
    // constructeur
    exo4(int tab[], char c)
    {
        this.tab = tab;
        this.c=c;
    }
    // run
    public void run()
    {
        if(this.c =='a')
        {
            tab[0] = 0 * 1;
            tab[1] = 1 * 1;
            tab[2] = 2 * 1;
        }

        if(this.c =='b')
        {
            tab[3] = 3 * 2;
            tab[4] = 4 * 2;
            tab[5] = 5 * 2;
        }

        if(this.c =='c')
        {
            tab[6] = 6 * 3;
            tab[7] = 7 * 3;
            tab[8] = 8 * 3;
        }

        if(this.c =='d')
        {
            tab[9] = 9 * 4;
            tab[10] = 10 * 4;
            tab[11] = 11 * 4;
        }

        try
        {
            sleep(1000);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    // main
    public static void main(String args[]) throws Exception
    {
        int [] t1;
        t1 = new int[12];
        int i;
        exo4 a = new exo4(t1,'a');
        exo4 b = new exo4(t1,'b');
        exo4 c = new exo4(t1,'c');
        exo4 d = new exo4(t1,'d');

        a.start();
        a.join();
        for(i=0;i<3;i++)
        {
            System.out.println(t1[i]);
        }
        b.start();
        b.join();
        for(i=3;i<6;i++)
        {
            System.out.println(t1[i]);
        }
        c.start();
        c.join();

        for(i=6;i<9;i++)
        {
            System.out.println(t1[i]);
        }

        d.start();
        d.join();
        for(i=9;i<12;i++)
        {
            System.out.println(t1[i]);
        }


    }

}
