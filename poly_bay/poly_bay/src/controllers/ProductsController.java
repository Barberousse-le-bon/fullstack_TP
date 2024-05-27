package controllers;

import java.util.ArrayList;

import DAO.ProductsDAO;
import models.Product;
import webserver.WebServerContext;

public class ProductsController {

    public static ArrayList<Product> findAll(WebServerContext context){

        ProductsDAO product = new ProductsDAO();
        ArrayList<Product> products = product.findAll(context);
        System.out.println(products);
        //context.getResponse().ok("Tous les produits");
        context.getResponse().json(products);


        return products;
    }
}