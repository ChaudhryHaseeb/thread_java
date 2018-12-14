package systeme.sectionCritique;

public class Prog1
{

    public static void main(String args[]) throws InterruptedException
    {
        Registre R = new Registre(10);
        MyThread Th1 = new MyThread(R);
        MyThread Th2 = new MyThread(R);
        Th1.start(); // démarrage des threads Th2.start();
        Th2.start();
        Th2.join();
        Th1.join(); // attente de la terminaison des threads Th2.join();
        int[] T = R.litRegistre();
        System.out.println( "Valeur finale du systeme ");
        for (int i = 0; i<T.length; i++)
        {
            System.out.println(T[i]);
        }
    }

}
