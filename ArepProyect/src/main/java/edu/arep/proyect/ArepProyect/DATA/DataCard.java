package edu.arep.proyect.ArepProyect.DATA;

import org.springframework.data.mongodb.repository.MongoRepository;

import edu.arep.proyect.ArepProyect.Modelo.CartaDespido;

public interface DataCard extends MongoRepository<CartaDespido,String>{

    

}