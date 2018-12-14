package TD2;

import java.util.Scanner;

public class Main
{
    public static void main(String args[]) throws InterruptedException
    {

        System.out.println("Ecrire le solde");
        Scanner sc = new Scanner(System.in);
        double solde = sc.nextDouble();
        Compte c1 = new Compte("Haseeb", "Chaudhry", solde);

        System.out.println(c1.solde);

        TraceOperation trace = new TraceOperation("historique");
        ThreadAleatoire tha = new ThreadAleatoire(c1,trace);
        ThreadAleatoire tha2 = new ThreadAleatoire(c1,trace);

        tha.start();
        tha2.start();
        tha.join();
        tha2.join();

        System.out.println(c1.solde);
        System.out.println(trace.toString());

        for(int i=0;i<trace.getOpe().length;i++)
        {
            System.out.println(trace.getOpe()[i]);
        }

    }
}
