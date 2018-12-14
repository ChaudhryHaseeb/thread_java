package TD3;

import java.io.IOException;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Main
{

    public static void main(String args[]) throws InterruptedException, IOException {

        Nombre n = new Nombre();
        ThreadAfficher ta = new ThreadAfficher(n);
        ThreadAugmente taug = new ThreadAugmente(n);
        //ThreadCalculeCarre tcc = new ThreadCalculeCarre(n);

        ta.start();
        taug.start();
        //tcc.start();

        System.out.println("Ecrire un nombre");
        Scanner sc = new Scanner(System.in);

        if(sc.hasNext())
        {
            ta.interrupt();
            taug.interrupt();
            //tcc.interrupt();
            sc.close();
        }
        ta.join();
        taug.join();
        //tcc.join();

    }
}
