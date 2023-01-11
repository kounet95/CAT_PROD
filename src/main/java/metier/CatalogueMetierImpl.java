package metier;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.Produit;
import dao.SingletonConnection;

public class  CatalogueMetierImpl implements IcatalogueMetier{

	@Override
	public void addProduit(Produit p) {
		// TODO Auto-generated method stub
		Connection conn= SingletonConnection.getconnection();
		try {
			String sql = "INSERT INTO produits(ref_prod, designation, prix, Quantite) VALUES(?, ?, ?, ?)";
		  PreparedStatement ps = conn.prepareStatement(sql);
		  ps.setString(1, p.getReferrnce());
		  ps.setString(2, p.getDesignation());
		  ps.setDouble(3, p.getPrix());
		  ps.setInt(4, p.getQuantite());
		  ps.executeUpdate();
		  ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public List<Produit> listProduit() {
	List<Produit> prods = new ArrayList<Produit>();
	Connection conn= SingletonConnection.getconnection();
	
	
	try {
		String sql = "SELECT * FROM produits";
		PreparedStatement ps =conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			Produit p = new Produit();
			p.setReferrnce(rs.getString("ref_prod"));
			p.setDesignation(rs.getString("designation"));
			p.setPrix(rs.getDouble("prix"));
			p.setQuantite(rs.getInt("quantite"));
			ps.close();
			
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
		return prods;
	}

	@Override
	public List<Produit> produitsParMc(String mc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Produit getProduit(String ref) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateProduit(Produit p) {
		
		
	}

	@Override
	public void deleteProduit(String ref) {
		// TODO Auto-generated method stub
		
	}

}
