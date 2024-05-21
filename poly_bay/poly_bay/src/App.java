import java.sql.Statement;

import database.PolyBayDatabase;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");



        PolyBayDatabase poly_bay = new PolyBayDatabase();
        
        poly_bay.connect()
        
        Statement statement = poly_bay.createStatement();






    }
}
