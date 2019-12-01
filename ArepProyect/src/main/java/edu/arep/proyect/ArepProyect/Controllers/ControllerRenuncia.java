package edu.arep.proyect.ArepProyect.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.arep.proyect.ArepProyect.Modelo.CartaDespido;
import edu.arep.proyect.ArepProyect.Services.CartaService;

@Controller
public class ControllerRenuncia {

    @Autowired
    CartaService cartaService;


    @RequestMapping(value = "Carta", method = RequestMethod.GET)
    public ResponseEntity<?> getCartaByCompany() {
        try {

            return new ResponseEntity<>(cartaService.getAllCards(), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("error", HttpStatus.NOT_FOUND);

        }
    }

    @RequestMapping(value = "Carta/Company/{name}", method = RequestMethod.GET)
    public ResponseEntity<?> getCartaByCompany(@PathVariable("name") String companyName) {
        try {

            return new ResponseEntity<>(cartaService.getAllCardsByCompany(companyName), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("error", HttpStatus.NOT_FOUND);

        }
    }


    @RequestMapping(value = "Carta/{document}", method = RequestMethod.GET)
    public ResponseEntity<?> getCartaByDocument(@PathVariable("document") String document) {
        try {

            return new ResponseEntity<>(cartaService.getCartaDespidoByDocument(document), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("error", HttpStatus.NOT_FOUND);

        }
    }

    @RequestMapping(value = "Carta", method = RequestMethod.POST)
    public ResponseEntity<?> CreateCard(@RequestBody CartaDespido card) {
        try {
            cartaService.createCard(card);
            return new ResponseEntity<>("creado", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("error", HttpStatus.NOT_FOUND);

        }
    }

    @RequestMapping(value = "Carta", method = RequestMethod.PUT)
    public ResponseEntity<?> updateCard(@RequestBody CartaDespido card) {
        try {
            cartaService.updateCard(card);
            return new ResponseEntity<>("la implementacion de este metodo no es necesaria", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("error", HttpStatus.NOT_FOUND);

        }
    }

    @RequestMapping(value = "Carta", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteCard(@RequestBody CartaDespido card) {
        try {
            cartaService.deleteCard(card);
            return new ResponseEntity<>("borrado", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("error", HttpStatus.NOT_FOUND);

        }
    }
}