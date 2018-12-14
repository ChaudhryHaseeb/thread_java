package TD2;

public class TraceOperation
{

    int nbr;
    int nbv;
    String nom;
    private char [] ope;
    int dernier;

    public TraceOperation(String nom)
    {
        this.nom = nom;
        dernier = 0;
        ope = new char[5];
    }

    public synchronized void  traceVersement()
    {
        dernier=(dernier+1)%5;
        ope[dernier]='v';
        nbv++;
    }

    public synchronized void traceRetrait()
    {
        dernier=(dernier+1)%5;
        ope[dernier]='r';
        nbr++;
    }

    public char[] getOpe()
    {
        return ope;
    }

    @Override
    public String toString()
    {
        return "TraceOperation{" + "nbr=" + nbr + ", nbv=" + nbv + ", nom='" + nom + '\'' + '}';
    }
}
