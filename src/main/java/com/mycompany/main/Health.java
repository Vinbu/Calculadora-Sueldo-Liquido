package com.mycompany.main;
import java.util.Scanner;
class Health{
    private String previsional;
    private int salary;
    private int Fonasa;
    private int Isapre;

public Health(String previsional){
    Init1(previsional);
}
  public final void Init1(String previsonal){
      this.previsional = previsonal;
      
      while(!previsional.equalsIgnoreCase("Fonasa")){
          System.out.println("Lo que ha ingresado no es válido, por favor indique si posee Fonasa o Isapre:");
          Scanner teclado2 = new Scanner(System.in);
          previsional = teclado2.nextLine();
          
          if (previsional.equalsIgnoreCase("Fonasa")){
          this.Fonasa = (int)(this.salary * 0.07);
          break;}
          
          else if(previsional.equals("Isapre")){
          Scanner teclado = new Scanner(System.in);
          System.out.println("Indique su cotización en UF: ");
          float UF = teclado.nextFloat();
          this.Isapre = (int)(this.salary* UF);}
          }}
  
    public int FonasaPercent(){
        return(int) this.Fonasa;
    }
}