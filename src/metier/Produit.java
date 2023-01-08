package metier;

public class Produit {
    private int id;
    private String nom;
    private String marque;
    private double prix;

    private String description;

    private long nombreStock;

    public Produit(int id, String nom, String marque, double prix, String description, long nombreStock) {
        this.id = id;
        this.nom = nom;
        this.marque = marque;
        this.prix = prix;
        this.description = description;
        this.nombreStock = nombreStock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getNombreStock() {
        return nombreStock;
    }

    @Override
    public String toString() {
        return "Id : " + this.id +
                " Nom :" + this.nom +
                ", Marque :" + this.marque +
                ", Prix :" + this.prix +
                ", Description :" + this.description +
                ", Nombre de stock :" + this.nombreStock ;
    }

}
