package com.mycompany.main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Indique su sueldo Bruto: ");
        int salary = teclado.nextInt();

        System.out.println("¿Posee Gratificación? (Si / No)");
        String gratify = teclado.next();
        Gratify gratify1 = new Gratify(gratify,salary);
        int gratify_percent = gratify1.getGratify();

        Scanner teclado2 = new Scanner(System.in);
        System.out.println("¿Posee Fonasa o Isapre?: ");
        String Previsional = teclado2.nextLine();


        Health health = new Health(Previsional, salary);
        int Health = health.getHealth();

        System.out.println("Ingrese su AFP: ");
        String AFP = teclado.next();
        AFP_Percent afp = new AFP_Percent(salary, AFP);
        int afp_client = afp.getAFP_Client();

        Calculator calculator = new Calculator(salary, Health, afp_client,gratify_percent);


        int salaryAfterDiscount = calculator.getSalaryAfterDiscounts();
        int cesantia = calculator.CesantiaPercent();
        System.out.println("Su sueldo líquido es: " + salaryAfterDiscount);
        System.out.println("El descuento de AFP es: " + afp_client);
        System.out.println("El descuento de seguro de Cesantía es: " + cesantia);
        System.out.println("El descuento de seguro de seguro de Salud es: " + Health);
    }
}