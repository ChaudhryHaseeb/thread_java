package TD3;

public class ThreadAfficher extends Thread {

    Nombre nombre;

    public ThreadAfficher(Nombre nombre) {
        this.nombre = nombre;
    }

    public void run() {
        while (!isInterrupted())
        {
            try
            {
                nombre.afficherN();
                Thread.sleep(150);
            }
            catch (InterruptedException e)
            {
                System.out.println("Fin");
                Thread.currentThread().interrupt();
            }
        }
    }
}
