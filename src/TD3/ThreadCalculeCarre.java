package TD3;

public class ThreadCalculeCarre extends Thread
{

    Nombre nombre;

    public ThreadCalculeCarre(Nombre nombre)
    {
        this.nombre = nombre;
    }

    /*public void run()
    {
        while (!isInterrupted())
        {
            try
            {
                nombre.calculeCarre();
                Thread.sleep(100);
            }
            catch (InterruptedException e)
            {
                System.out.println("Fin");
                Thread.currentThread().interrupt();
            }
        }
    }*/
}
