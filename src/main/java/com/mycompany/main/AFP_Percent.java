package com.mycompany.main;

import java.util.Arrays;
import java.util.Scanner;

class AFP_Percent{
    private float AFP_Cap = 0.10144F;
    private float AFP_Cup = 0.10144F;
    private float AFP_Hab = 0.10127F;
    private float AFP_Mod = 0.10058F;
    private float AFP_PlV = 0.10116F;
    private float AFP_Pro = 0.10145F;
    private float AFP_Uno = 0.10069F;
    private int AFP_Client;

    public AFP_Percent(int salary,String AFP){
        float AFP_Cap = this.AFP_Cap * salary;
        float AFP_Cup = this.AFP_Cup * salary;
        float AFP_Hab = this.AFP_Hab * salary;
        float AFP_Mod = this.AFP_Mod * salary;
        float AFP_PlV = this.AFP_PlV * salary;
        float AFP_Pro = this.AFP_Pro * salary;
        float AFP_Uno = this.AFP_Uno * salary ;

        String afps[] ={"Capital","Cuprum","Habitat","Modelo","Planvital","Provida","Uno"};

        //while((!AFP.equalsIgnoreCase(Arrays.toString(afps)))){
        //while (!AFP.equalsIgnoreCase(afps) ){
        //while(!afps.contains(AFP))
        while(AFP == ""){ //falta revisar cómo comparar una lista con un string
            System.out.println("Ingrese una AFP correcta, intente nuevamente.");
            Scanner teclado = new Scanner(System.in);
            AFP = teclado.nextLine();
        }
        if (AFP.equalsIgnoreCase("Capital")){
            AFP_Client = (int) AFP_Cap;
        }
        else if (AFP.equalsIgnoreCase("Cuprum")) {
            AFP_Client = (int) AFP_Cup;
        }
        else if (AFP.equalsIgnoreCase("Habitat")) {
            AFP_Client = (int) AFP_Hab;
        }
        else if (AFP.equalsIgnoreCase("Modelo")) {
            AFP_Client = (int) AFP_Mod;
        }
        else if (AFP.equalsIgnoreCase("Planvital")) {
            AFP_Client = (int) AFP_PlV;
        }
        else if (AFP.equalsIgnoreCase("Provida")) {
            AFP_Client = (int) AFP_Pro;
        }
        else if (AFP.equalsIgnoreCase("Uno")) {
            AFP_Client = (int) AFP_Uno;
        }
    }
    public int getAFP_Client(){
        return AFP_Client;
    }

}