package edu.arep.proyect.ArepProyect.Services;

import java.util.List;



import org.springframework.stereotype.Service;

import edu.arep.proyect.ArepProyect.Modelo.CartaDespido;

@Service
public interface CartaService {

    List<CartaDespido> getAllCards();
    List<CartaDespido> getAllCardsByCompany(String name);
    List<CartaDespido> getCartaDespidoByDocument(String documento);
    void createCard(CartaDespido card);
    void updateCard(CartaDespido card);
    void deleteCard(CartaDespido card);
}