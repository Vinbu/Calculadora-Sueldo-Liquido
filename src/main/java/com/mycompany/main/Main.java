package com.mycompany.main;

import java.util.Scanner;

/** Calculo de Sueldo Base a Líquido 
 * La siguiente clase tiene propósito obtener los datos necesarios para calcular
 * el Sueldo Líquido a partir del Sueldo Base y ciertos descuentos o 
 * bonificaciones tales como; Afp, Seguro de Cesantía, Seguro de Salud y
 * Gratificaciones. 
 * 
 * Para ello se crean distintasinstancias para cada una de las
 * clases necesarias. 
 * 
 * Por último se muestra el monto de cada uno de los descuentos y en el Sueldo 
 * Líquido.
 * 
 * @author Vincent Bustamante y Dante Quezada
 * @version 1.8
 */
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Indique su Sueldo Base: ");
        float salary = teclado.nextFloat();
        while(salary<=0){
            System.out.println("El monto ingresado no es válido, ingrese otro valor: ");
            salary = teclado.nextFloat();
        }

        System.out.println("¿Posee Gratificación? (Si / No)");
        String gratify = teclado.next();
        Gratify gratify1 = new Gratify(gratify);
        int gratify_percent = (int) gratify1.getGratify();
        
        float salary1 = gratify_percent + salary;

        Scanner teclado2 = new Scanner(System.in);
        System.out.println("¿Posee Fonasa o Isapre?: ");
        String Previsional = teclado2.nextLine();


        Health health = new Health(Previsional, salary1);
        int Health = health.getHealth();

        System.out.println("Ingrese su AFP: ");
        String AFP = teclado.next();
        AFP_Percent afp = new AFP_Percent(salary1, AFP);
        int afp_client = afp.getAFP_Client();

        Calculator calculator = new Calculator(salary1, Health, afp_client);


        int salaryAfterDiscount = calculator.getSalaryAfterDiscounts();
        int cesantia = calculator.CesantiaPercent();
        System.out.println("Su sueldo líquido es: " + salaryAfterDiscount);
        System.out.println("El descuento de AFP es: " + afp_client);
        System.out.println("El descuento de Seguro de Cesantía es: " + cesantia);
        System.out.println("El descuento de su Seguro de Salud es: " + Health);
    }
}