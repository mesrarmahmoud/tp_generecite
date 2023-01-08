package metier;

import java.util.ArrayList;
import java.util.List;

public class MetierProduitImp<T> implements IMetier<T> {
    List<Produit> listProduits = new ArrayList<>();

    public MetierProduitImp() {
    }

    @Override
    public void add(T o) {
        listProduits.add((Produit) o);
    }

    @Override
    public List getAll() {
        //System.out.println("test Me");
        return listProduits; }

    @Override
    public void delete(long id) {
        for(Produit produit : listProduits){
            if( produit.getId() == id ) {
                listProduits.remove(produit);
            }
        }
    }

    @Override
    public T findById(long id) {
        Produit produitToFind = null;
        for(Produit produit : listProduits){

            if( produit.getId() == id ) {
                listProduits.remove(produit);
                produitToFind = produit;
                break;
            }
        }
        return (T) produitToFind;
    }
}
