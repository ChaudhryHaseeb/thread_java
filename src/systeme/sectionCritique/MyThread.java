package systeme.sectionCritique;

public class MyThread extends Thread
{
    Registre leRegistre;

    MyThread(Registre R)
    {
        leRegistre = R;
    }


    public void run()
    {
        int Tableau[];
        for (int turn=0; turn<1000000; turn++)
        {
            synchronized (leRegistre) {
                Tableau = leRegistre.litRegistre();
                for (int i = 0; i < Tableau.length; i++) {
                    Tableau[i]++;
                }
                leRegistre.ecritRegistre(Tableau);
            }
        }
    }
}
