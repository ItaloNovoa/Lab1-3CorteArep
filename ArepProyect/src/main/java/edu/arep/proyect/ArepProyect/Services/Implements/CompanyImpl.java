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
import edu.arep.proyect.ArepProyect.DATA.DataCompany;
import edu.arep.proyect.ArepProyect.Modelo.Company;
import edu.arep.proyect.ArepProyect.Services.CompanyService;

@Component
public class CompanyImpl implements CompanyService {

    @Autowired
    DataCompany database;

    private ApplicationContext applicationContext = new AnnotationConfigApplicationContext(DBConfig.class);
    private MongoOperations mongoOperation = (MongoOperations) applicationContext.getBean("mongoTemplate");

    @Override
    public List<Company> getCompanies() {
        Query query = new Query();
        return mongoOperation.find(query, Company.class);
    }

    @Override
    public Company getCompanyByName(String name) {
        Query query = new Query();
        query.addCriteria(Criteria.where("nameCompany").is(name));
        return mongoOperation.findOne(query, Company.class);
    }

    @Override
    public void createCompany(Company company) {
        database.save(new Company(company.getRut(),company.getNameCompany(),company.getFechaResgistro(),company.getTipoEmpresa()));

    }

    @Override
    public void updateCompany(Company company) {
        Query query = new Query();
        query.addCriteria(Criteria.where("rut").is(company.getRut()));
        Company company2 = mongoOperation.findOne(query, Company.class);
        company2.setNameCompany(company.getNameCompany());
        company2.setFechaResgistro(company.getFechaResgistro());
        company2.setTipoEmpresa(company.getTipoEmpresa());
        mongoOperation.save(company2);
        
    }

    @Override
    public void deleteCompany(Company company) {
        // TODO Auto-generated method stub

    }
    
    
}