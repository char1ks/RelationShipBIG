package org.example;

import org.example.Model.characters;
import org.example.Model.clients;
import org.example.Model.price;
import org.example.Model.products;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) {
        Configuration configuration=new Configuration()
                .addAnnotatedClass(characters.class)
                .addAnnotatedClass(clients.class)
                .addAnnotatedClass(price.class)
                .addAnnotatedClass(products.class);
        SessionFactory sessionFactory=configuration.buildSessionFactory();
        Session session=sessionFactory.getCurrentSession();
        try{
            session.beginTransaction();
            clients clients=new clients("Alex");
            products products=new products(clients,"Coca-Cola");
            characters characters=new characters("Zero",products);
            price price=new price(4560,products);
            clients.setProducts(new ArrayList<>(Collections.singletonList(products)));
            products.setCharacters(characters);
            products.setPrice(price);
            session.save(clients);
            session.getTransaction().commit();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
