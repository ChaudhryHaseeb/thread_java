package TD1;

import java.lang.*;

public class monThreadImplements implements Runnable
{
        private char c;
        public Thread T;

        // constructeur
        monThreadImplements(char c)
        {
            this.c=c;
            T=new Thread(this);
        }

        // run
        public void run()
        {
            System.out.println("Je suis "+ T.getId() + " caractere est " + c);
            try { Thread.sleep(5000);} catch (Exception e){e.printStackTrace();};
        }

        // main
        public static void main(String args[]) throws Exception
        {
            monThreadImplements latache = new monThreadImplements('d');
            latache.T.start();
            try { Thread.sleep(10000);} catch (Exception e){e.printStackTrace();};
        }
}
