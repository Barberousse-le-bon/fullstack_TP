package DAO;
import models.Product;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import database.PolyBayDatabase;


public class ProductsDAO {
 


    public ProductsDAO(){
        

    }


    public ArrayList<Product> findAll(){
    	ArrayList<Product> produits=new ArrayList<>();
        
    	
    	try {
    		
    		PolyBayDatabase poly_bay = new PolyBayDatabase();
    		
    		PreparedStatement statement = poly_bay.prepareStatement("SELECT * FROM Product");
    		
    		ResultSet resultat = statement.executeQuery();
    		
    		
    		while(resultat.next()) {
    			
    			
    			final String name = resultat.getString("name");
    			final String owner = resultat.getString("owner");
    			final float bid = resultat.getFloat("bid");
    			final int id = resultat.getInt("id");
    			
    			
    			Product product = new Product(id, name, owner, bid);
    			
    			
    			
    			produits.add(product);
    			
    			
    		}
    		
    	}
    	catch(Exception e) {
    		
    		
    		System.out.print("erreur : ");
    		System.out.println(e);
    	}
    	
    	
    	
    	
    	
    	

    	return produits;
    }
    
    
}
