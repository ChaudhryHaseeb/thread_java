package TD1;

import java.lang.*;

public class monThread extends Thread
{
    private char c;
    // constructeur
    monThread(char c)
    {
        this.c=c; }
    // run
    public void run(){
        System.out.println("caractere est " + c);
        try
        {
            sleep(5000);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    // main
    public static void main(String args[]) throws Exception {
        monThread latache = new monThread('d');
        latache.start();
        Thread.sleep(10000);
    }
}