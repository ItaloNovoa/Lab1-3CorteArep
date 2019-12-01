package edu.arep.proyect.ArepProyect.Modelo;

import java.util.Date;

import org.hibernate.validator.constraints.UniqueElements;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Company {

    @Id
    private String rut;

    @UniqueElements
    private String nameCompany;
    
    private Date fechaResgistro;
    private String tipoEmpresa;

    public Company() {
    }

    public Company(String rut, @UniqueElements String nameCompany, Date fechaResgistro, String tipoEmpresa) {
        this.rut = rut;
        this.nameCompany = nameCompany;
        this.fechaResgistro = fechaResgistro;
        this.tipoEmpresa = tipoEmpresa;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public Date getFechaResgistro() {
        return fechaResgistro;
    }

    public void setFechaResgistro(Date fechaResgistro) {
        this.fechaResgistro = fechaResgistro;
    }

    public String getTipoEmpresa() {
        return tipoEmpresa;
    }

    public void setTipoEmpresa(String tipoEmpresa) {
        this.tipoEmpresa = tipoEmpresa;
    }

    @Override
    public String toString() {
        return "Company [fechaResgistro=" + fechaResgistro + ", nameCompany=" + nameCompany + ", rut=" + rut
                + ", tipoEmpresa=" + tipoEmpresa + "]";
    }   
       
}