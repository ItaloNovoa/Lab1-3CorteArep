package edu.arep.proyect.ArepProyect.DATA;

import org.springframework.data.mongodb.repository.MongoRepository;

import edu.arep.proyect.ArepProyect.Modelo.Company;

public interface DataCompany extends MongoRepository<Company, String> {

    
}