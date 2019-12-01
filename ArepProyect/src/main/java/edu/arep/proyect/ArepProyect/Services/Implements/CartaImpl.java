package edu.arep.proyect.ArepProyect.Services.Implements;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import edu.arep.proyect.ArepProyect.Config.DBConfig;
import edu.arep.proyect.ArepProyect.DATA.DataCard;
import edu.arep.proyect.ArepProyect.Modelo.CartaDespido;
import edu.arep.proyect.ArepProyect.Services.CartaService;

@Component
public class CartaImpl implements CartaService {

    @Autowired
    DataCard database;

    private ApplicationContext applicationContext = new AnnotationConfigApplicationContext(DBConfig.class);
    private MongoOperations mongoOperation = (MongoOperations) applicationContext.getBean("mongoTemplate");

    @Override
    public List<CartaDespido> getAllCards() {
        Query query = new Query();
        return mongoOperation.find(query, CartaDespido.class);
    }

    @Override
    public List<CartaDespido> getAllCardsByCompany(String name) {
        Query query = new Query();
        query.addCriteria(Criteria.where("compañia").is(name));
        return mongoOperation.find(query, CartaDespido.class);
    }

    @Override
    public void createCard(CartaDespido card) {
        database.save(new CartaDespido(card.getCedula(),card.getCompañia(),card.getNombre(),card.getFechaDespido(),card.getDescripcion(),card.getPuntuacion()));
    }

    @Override
    public void updateCard(CartaDespido card) {
        // TODO Auto-generated method stub

    }

    @Override
    public void deleteCard(CartaDespido card) {
        Query query = new Query();
        query.addCriteria(Criteria.where("cedula").is(card.getCedula()));
        query.addCriteria(Criteria.where("compañia").is(card.getCompañia()));
        mongoOperation.remove(query, CartaDespido.class);

    }

    @Override
    public List<CartaDespido> getCartaDespidoByDocument(String documento) {
        Query query = new Query();
        query.addCriteria(Criteria.where("cedula").is(documento));
        return mongoOperation.find(query, CartaDespido.class);
    }

    
}