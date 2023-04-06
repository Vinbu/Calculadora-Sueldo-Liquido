package com.mycompany.main;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Indique su sueldo Bruto: ");
        int salary = teclado.nextInt();
        Scanner teclado1 = new Scanner(System.in);
        System.out.println("¿Posee Fonasa o Isapre?: ");
        String Previsional= teclado1.nextLine();
        Calculator calculator = new Calculator(salary);
        Health health = new Health(Previsional);
        int salaryAfterDiscount = calculator.getSalaryAfterDiscounts();
        int afp = calculator.AfpPercent();
        int cesantia = calculator.CesantiaPercent();
        int salud = health.FonasaPercent();
        System.out.println("Su sueldo líquido es: " + salaryAfterDiscount);
        System.out.println("El descuento de AFP es: " + afp);
        System.out.println("El descuento de seguro de Cesantía es: " + cesantia);
        System.out.println("El descuento de seguro de seguro de Salud es: " + salud);
    }
}