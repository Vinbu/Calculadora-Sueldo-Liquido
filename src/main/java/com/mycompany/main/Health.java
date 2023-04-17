package com.mycompany.main;

import java.util.Scanner;

/**
 * La siguiente clase se encarga de obtener el monto del Seguro de Salud
 * de acuerdo a dos posibles respuestas iniciales: "Fonasa o Isapre"
 */

class Health {
    private String previsional;
    private float salary;
    private int Health;


    /**
     * @param previsional Respuesta del usuario a si posee "Fonasa" o "Isapre"
     * @param salary1     Sueldo Base y Gratificación
     */
    public Health(String previsional, float salary1) {
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
            while (UF <= 0) {
                System.out.println("El valor ingresado no es válido, ingrese otro monto: ");
                UF = teclado.nextFloat();
            }

            this.Health = (int) (UF * 35000);
        }
    }

    public int getHealth() {
        return (int) this.Health;
    }
}