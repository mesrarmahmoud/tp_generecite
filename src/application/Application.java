package application;

import metier.MetierProduitImp;
import metier.Produit;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        int id;
        String nom;
        String marque;
        double prix;
        String description;
        long nbrStock;

        Scanner lectClavier = new Scanner (System.in);
        MetierProduitImp metier = new MetierProduitImp<>();

        while (true) {
            System.out.println("------------Taper un numero ----------------");
            System.out.println("\n");
            System.out.println("1 - Afficher la liste des produits.");
            System.out.println("2 - Rechercher un produit par son id.");
            System.out.println("3 - Ajouter un nouveau produit dans la liste.");
            System.out.println("4 - Supprimer un produit par id.");
            System.out.println("5 - Afficher la liste des produits");
            System.out.println("\n");
            System.out.println("------------------------------------------");

            String rep = lectClavier.nextLine ();
            if (rep.equals("1"))
                System.out.println(metier.getAll());
            if (rep.equals("2")) {
                System.out.println("Entrer le id du produit.");
                int i = lectClavier.nextInt();
                System.out.println(metier.findById(i));
            }

            if (rep.equals("3")) {

                 System.out.println("Entrer le id ");
                 id = lectClavier.nextInt();

                System.out.println("Entrer le Nom ");
                nom = lectClavier.nextLine();
                lectClavier.nextLine();
                //lectClavier.close();

                System.out.println("Entrer la marque");
                marque = lectClavier.nextLine();

                System.out.println("Entrer le prix");
                prix = lectClavier.nextDouble();

                System.out.println("Entrer la description");
                description = lectClavier.nextLine();
                lectClavier.nextLine();

                System.out.println("Entrer le nombre de stock");
                nbrStock = lectClavier.nextLong();

                metier.add(new Produit(id , nom , marque, prix , description, nbrStock ));
            }

            if(rep.equals("4")){
                System.out.println("Entrer l'id de produit à supprimer");
                id = lectClavier.nextInt();
                metier.delete(id);
            }

            if(rep.equals("5"))
                System.exit (0);
        }
    }
}
