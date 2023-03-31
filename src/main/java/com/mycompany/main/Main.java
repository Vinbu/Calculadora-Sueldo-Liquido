package com.mycompany.main;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Indique su sueldo Bruto: ");
        int salary = teclado.nextInt();
        Calculator calculator = new Calculator(salary);
        int salaryAfterDiscount = calculator.getSalaryAfterDiscounts();
        int afp = calculator.AfpPercent();
        int cesantia = calculator.CesantiaPercent();
        int health = calculator.HealthPercent();
        System.out.println("Su sueldo líquido es: " + salaryAfterDiscount);
        System.out.println("El descuento de AFP es: " + afp);
        System.out.println("El descuento de seguro de Cesantía es: " + cesantia);
        System.out.println("El descuento de seguro de Salud es: " + health);
    }
}