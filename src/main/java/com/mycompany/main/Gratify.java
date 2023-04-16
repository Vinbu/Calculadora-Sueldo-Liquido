package com.mycompany.main;
import java.util.Scanner;

class Gratify {
    private float gratify;
    private float client_gratify;

    public Gratify(String gratify, int salary) {
        Scanner teclado = new Scanner(System.in);
        
        while ((!gratify.equalsIgnoreCase("Si")) && (!gratify.equalsIgnoreCase("No"))) {

            System.out.println("La gratificacion ingresada no es valida, por favor ingresar Si o No ");
            gratify = teclado.next();
        }

        if (gratify.equalsIgnoreCase("Si")) {
            
            System.out.println("¿Cuál es el monto de su gratificación?: ");
            this.gratify= teclado.nextInt();
            this.client_gratify = this.gratify;
            
        }
        else if (gratify.equalsIgnoreCase("No")) {
            this.client_gratify = 0;
        }
    }

    public int getGratify() {

        return (int) this.client_gratify;
    }
}