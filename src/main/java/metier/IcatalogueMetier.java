package metier;

import java.util.List;

import dao.Produit;

public interface IcatalogueMetier {
 public void addProduit(Produit p);
 public List<Produit> listProduit();
 public List<Produit> produitsParMc (String mc );
 public Produit getProduit(String ref );
 public void updateProduit (Produit p);
 public void deleteProduit(String ref);
}
