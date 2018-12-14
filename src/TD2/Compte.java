package TD2;

public class Compte
{
    String nom;
    String prenom;
    double solde;

    public Compte(String nom, String prenom, double solde)
    {
        this.nom = nom;
        this.prenom = prenom;
        this.solde = solde;
    }

    public synchronized void versement(double montant)
    {
        solde += montant;
    }

    public synchronized void retrait(double montant)
    {
        solde -= montant;
    }


}


//TD2 Question 2

//Je mets les verous au niveau de la signature de la fonction car je veux proteger unniquement une opération.