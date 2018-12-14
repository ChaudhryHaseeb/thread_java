package TD3;


public class Nombre
{
    private int n;
    private int carre;
    private int aug;

    public Nombre()
    {
        this.n = 0;
        this.carre = n*n;
        aug=0;
    }

    public synchronized void afficherN()
    {
        while(aug ==3)
        {
            try
            {
                wait();
            }
            catch (InterruptedException e)
            {
                //e.printStackTrace();
                System.out.println("fin");
            }
        }
        aug ++;
        System.out.println("Le nombre est " + this.n + " et son carré est: " + this.carre);
        notifyAll();
    }

    public synchronized void augmente()
    {
        while(aug != 3)
        {
            try
            {
                wait();
            }
            catch (InterruptedException e)
            {
                //e.printStackTrace();
                System.out.println("fin");
            }
        }
        this.n++;
        this.carre = n*n;
        aug = 0;
        notifyAll();
    }

    /*public synchronized void calculeCarre()
    {
        while(aug != 1)
        {
            try
            {
                wait();
            }
            catch (InterruptedException e)
            {
                //e.printStackTrace();
                System.out.println("fin");
            }
        }
        this.carre = n*n;
        aug = 2;
        notifyAll();
    }*/
}
