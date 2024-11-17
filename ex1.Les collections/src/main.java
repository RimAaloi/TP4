import java.util.ArrayList;
import java.util.Scanner;

class Produit {
    private long id;
    private String nom;
    private double prix;

    public Produit(long id, String nom, double prix) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
    }
    public long getId() {
        return id;
    }
    public String getNom() {
        return nom;
    }
    public double getPrix() {
        return prix;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }
    @Override
    public String toString() {
        return "Produit{id=" + id + ", nom='" + nom + "', prix=" + prix + "}";
    }
}

public class main {
    public static void main(String[] args) {
        ArrayList<Produit> produits = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        produits.add(new Produit(1, "Produit A", 10.99));
        produits.add(new Produit(2, "Produit B", 15.50));
        produits.add(new Produit(3, "Produit C", 7.75));

        System.out.println("Liste des produits :");
        for (Produit produit : produits) {
            System.out.println(produit);
        }

        System.out.print("\nEntrez l'indice du produit à supprimer: ");
        int index = scanner.nextInt();
        if (index >= 0 && index < produits.size()) {
            produits.remove(index);
        } else {
            System.out.println("Indice invalide !");
        }
        System.out.println("Liste des produits après suppression :");
        for (Produit produit : produits) {
            System.out.println(produit);
        }
        System.out.print("\nEntrez l'indice du produit à modifier : ");
        int indexUpdate = scanner.nextInt();
        if (indexUpdate >= 0 && indexUpdate < produits.size()) {
            System.out.print("Entrez le nouveau nom : ");
            String newNom = scanner.next();
            System.out.print("Entrez le nouveau prix : ");
            double newPrix = scanner.nextDouble();
            produits.get(indexUpdate).setNom(newNom);
            produits.get(indexUpdate).setPrix(newPrix);
        } else {
            System.out.println("Indice invalide !");
        }


        System.out.println("Liste des produits après modification :");
        for (Produit produit : produits) {
            System.out.println(produit);
        }

        System.out.print("\nEntrez le nom du produit à rechercher : ");
        String nomRecherche = scanner.next();
        boolean found = false;
        for (Produit produit : produits) {
            if (produit.getNom().equalsIgnoreCase(nomRecherche)) {
                System.out.println("Produit trouvé : " + produit);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Produit non trouvé.");
        }

        scanner.close();
    }
}