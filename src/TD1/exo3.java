package TD1;

import java.lang.*;

public class exo3 extends Thread
{

    private String vers;
    // constructeur
    exo3(String vers)
    {
        this.vers = vers;
    }
    // run
    public void run()
    {
        System.out.println(vers);
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
    public static void main(String args[]) throws Exception {
        exo3 latache = new exo3("Et, d'abord, sache");
        exo3 latach = new exo3("Que le monde où tu vis est un monde effrayant");
        exo3 latac = new exo3("Devant qui le songeur, sous l'infini ployant,");
        exo3 lata = new exo3("Lève les bras au ciel et recule terrible.\n");
        latache.start();
        latache.join();
        latach.start();
        latach.join();
        latac.start();
        latac.join();
        lata.start();
        lata.join();
    }

}
