import java.util.ArrayList;

import DAO.ProductsDAO;
import models.Product;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");



        
        
        ProductsDAO dao = new ProductsDAO();

        ArrayList<Product> produits = dao.findAll();

        System.out.println(produits);
        
        System.out.println("Hello, Worl2!");

    }
}
