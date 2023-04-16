package com.mycompany.main;

import java.util.Scanner;

class Health {
    private String previsional;
    private int salary;
    private int Health;

    public Health(String previsional, int salary) {
        this.previsional = previsional;
        this.salary = salary;

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

    public int getHealth() {
        return (int) this.Health;
    }
}