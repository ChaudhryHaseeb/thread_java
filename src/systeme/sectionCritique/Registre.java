package systeme.sectionCritique;

public class Registre
{
    int[] Tab;

    public Registre(int n)
    {
        Tab = new int[n];
    }

    public synchronized int[] litRegistre()
    {
        int[] res = new int[this.Tab.length];

        for (int i = 0; i < res.length; i++)
        {
            res[i] = this.Tab[i];
        }
        return res;
    }

    public synchronized void ecritRegistre(int[] T)
    {
        for (int i = 0; i < Tab.length; i++)
        {
            Tab[i] = T[i];
        }
    }



}
