package edu.arep.proyect.ArepProyect.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.arep.proyect.ArepProyect.Modelo.Company;

@Service
public interface CompanyService {

    List<Company> getCompanies();
    Company getCompanyByName(String name);
    void createCompany(Company company);
    void updateCompany(Company company);    
    void deleteCompany(Company company);
    
}