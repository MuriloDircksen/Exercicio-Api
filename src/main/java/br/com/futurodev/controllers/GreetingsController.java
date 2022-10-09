package br.com.futurodev.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * A sample greetings controller to return greeting text
 */
@RestController
public class GreetingsController {
    /**
     *
     * @param name the name to greet
     * @return greeting text
     */
    @RequestMapping(value = "/mostrarnome/{name}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String greetingText(@PathVariable String name) {
        return "Olá " + name +
                " estamos começando nosso trabalho com SpringBoot!";
    }
    @RequestMapping(value = "/calculo/{numero1}/{numero2}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String calculaMedia(@PathVariable("numero1") String numero1,@PathVariable("numero2") String numero2) {
        Double n1 = Double.parseDouble(numero1);
        Double n2 = Double.parseDouble(numero2);
        double media = (n1+n2)/2;

        return "Olá, numeros informados são 1°: " + numero1 +
                ", 2°: "+numero2+" com media de "+media+"!";
    }
}
