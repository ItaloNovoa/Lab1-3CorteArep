package edu.arep.proyect.ArepProyect.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.arep.proyect.ArepProyect.Modelo.Company;
import edu.arep.proyect.ArepProyect.Services.CompanyService;

@Controller
public class CompanyController{
    
    @Autowired
    private CompanyService companyService;


    @RequestMapping(value = "Company/{name}", method = RequestMethod.GET)
    public ResponseEntity<?> getCompanyById(@PathVariable("name") String companyName) {
        try {

            return new ResponseEntity<>(companyService.getCompanyByName(companyName), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("error", HttpStatus.NOT_FOUND);

        }
    }

    @RequestMapping(value = "Company", method = RequestMethod.POST)
    public ResponseEntity<?> createCompany(@RequestBody Company company) {
        try {
            companyService.createCompany(company);
            return new ResponseEntity<>("Creado", HttpStatus.CREATED);         
        } catch (Exception e) {
            return new ResponseEntity<>("error", HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "Company", method = RequestMethod.PUT)
    public ResponseEntity<?> updateCompany(@RequestBody Company company) {
        try {
            companyService.createCompany(company);
            return new ResponseEntity<>("Creado", HttpStatus.CREATED);         
        } catch (Exception e) {
            return new ResponseEntity<>("error", HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "Company", method = RequestMethod.GET)
    public ResponseEntity<?> getCompanies() {
        try {
            return new ResponseEntity<>(companyService.getCompanies(), HttpStatus.CREATED);        
        } catch (Exception e) {
            return new ResponseEntity<>("error", HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "Company", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteCompany(@RequestBody Company company) {
        try {
            companyService.deleteCompany(company);
            return new ResponseEntity<>("Creado", HttpStatus.CREATED);         
        } catch (Exception e) {
            return new ResponseEntity<>("error", HttpStatus.NOT_FOUND);
        }
    }
    
}