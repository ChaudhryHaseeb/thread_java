package TD2;

public class ThreadRetrait extends Thread
{
    Compte monCompte;

    public ThreadRetrait(Compte monCompte)
    {
        this.monCompte = monCompte;
    }

    public void run()
    {
        for(int i=0;i<5000;i++)
        {
            monCompte.retrait(11.0);
        }
    }
}


