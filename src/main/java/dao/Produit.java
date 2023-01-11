package dao;

public class Produit {
  private String referrnce;
  private String designation;
  private double prix;
  private int quantite ;
  
  
public Produit() {
	super();
	// TODO Auto-generated constructor stub
}


public Produit(String referrnce, String designation, double prix, int quantite) {
	super();
	this.referrnce = referrnce;
	this.designation = designation;
	this.prix = prix;
	this.quantite = quantite;
}


public String getReferrnce() {
	return referrnce;
}


public void setReferrnce(String referrnce) {
	this.referrnce = referrnce;
}


public String getDesignation() {
	return designation;
}


public void setDesignation(String designation) {
	this.designation = designation;
}


public double getPrix() {
	return prix;
}


public void setPrix(double prix) {
	this.prix = prix;
}


public int getQuantite() {
	return quantite;
}


public void setQuantite(int quantite) {
	this.quantite = quantite;
}

}
