package com.mycompany.main;

import java.util.Scanner;

class Health {
    private String previsional;
    private int salary;
    private int Health;

    /**Obtiene el valor del Seguro de Salud
     * La siguiente clase se encarga de obtener el monto del Seguro de Salud
     * de acuerdo a dos posibles respuestas iniciales: "Fonasa o Isapre"
     * 
     * Nota 1: Se presupone que el usuario puede ingresar una respuesta no
     * deseada por lo que se le limita a dos opciones, "Fonasa o Isapre", y en 
     * el caso que ingrese algo no deseado se le vuelve a preguntar.
     * 
     * Nota 2: Si la respuesta fue "Fonasa" se procede a realizar un cálculo
     * automático, ya que el porcentaje de descuento de Fonasa es fijo, es un
     * 7% con respecto al Sueldo Base y la Gratificación.
     * 
     * Nota 3: Si la respuesta del usuario fue "Isapre" se procede a preguntar
     * cual es el monto en UF de su previsión, por lo que se realiza un 
     * cálculo de acuerdo a una constante que corresponde al valor aproximado
     * de la UF.
     * 
     * @param previsional Respuesta del usuario a si posee "Fonasa" o "Isapre"
     * @param salary1 Sueldo Base y Gratificación
     */
    public Health(String previsional, int salary1) {
        this.previsional = previsional;
        this.salary = salary1;

        while ((!previsional.equalsIgnoreCase("Fonasa")) && (!previsional.equalsIgnoreCase("Isapre"))) {
            System.out.println("Lo que ha ingresado no es válido, por favor indique si posee Fonasa o Isapre:");
            Scanner teclado = new Scanner(System.in);
            previsional = teclado.nextLine();
        }

        if (previsional.equalsIgnoreCase("Fonasa")) {
            this.Health = (int) (this.salary * 0.07);
        }

        if (previsional.equalsIgnoreCase("Isapre")) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Indique su cotización en UF: ");
            float UF = teclado.nextFloat();
            this.Health = (int) (UF * 35000);
        }
    }

    /**
     * Metodo que retorna el monto del Seguro de Salud de acuerdo a las 
     * respuestas dadas.
     * @return Retorna el monto del Seguro de Salud
     */
    public int getHealth() {
        return (int) this.Health;
    }
}