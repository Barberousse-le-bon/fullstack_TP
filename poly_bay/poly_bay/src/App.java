import java.util.ArrayList;

import DAO.ProductsDAO;
import controllers.ProductsController;
import models.Product;
import webserver.WebServer;
import webserver.WebServerContext;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");



        
        


        
    


        WebServer webServer = new WebServer();
        webServer.listen(8080);

        webServer.getRouter().get("/products", (WebServerContext context)-> ProductsController.findAll(context));


    }
}
