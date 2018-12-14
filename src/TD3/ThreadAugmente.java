package TD3;

public class ThreadAugmente extends Thread
{
    Nombre nombre;

    public ThreadAugmente(Nombre nombre) {
        this.nombre = nombre;
    }

    public void run()
    {
        while (!isInterrupted())
        {

            try
            {
                nombre.augmente();
                sleep(50);
            }
            catch (InterruptedException e)
            {
                System.out.println("Fin");
                Thread.currentThread().interrupt();
            }
        }

    }
}
