package com.mycompany.main;

import java.util.Arrays;
import java.util.Scanner;

class AFP_Percent {
    private float AFP_Cap = 0.10144F;
    private float AFP_Cup = 0.10144F;
    private float AFP_Hab = 0.10127F;
    private float AFP_Mod = 0.10058F;
    private float AFP_PlV = 0.10116F;
    private float AFP_Pro = 0.10145F;
    private float AFP_Uno = 0.10069F;
    private int AFP_Client;

    /**Obtiene el valor de la AFP
     * La siguiente clase se encarga de obtener el monto de descuento de la AFP
     * del usuario de acuerdo a lo ingresado y a las AfP existentes en Chile.
     * 
     * Nota 1: Inicialmente se almacenan cada uno de los posibles resultados
     * de acuerdo a lo ingresado por el usuario.
     * 
     * Nota 2: Se crea una lista con cada una de las AFP existentes para
     * compararla con la respuesta del usuario, ya que se presupone que pueda
     * ingresar algo no deseado.
     * 
     * Nota 3: Cuando la respuesta de usuario coincide con alguna AFP de la
     * lista se procede a guardar el valor correspondiente a esa AFP,
     * extrayéndolo de una de las posibles respuestas anteriormente 
     * almacenadas.
     * @param salary1 Salario Base Y Gratificación
     * @param AFP Respuesta del usuario en formato String
     */
    public AFP_Percent(int salary1, String AFP) {
        float AFP_Cap = this.AFP_Cap * salary1;
        float AFP_Cup = this.AFP_Cup * salary1;
        float AFP_Hab = this.AFP_Hab * salary1;
        float AFP_Mod = this.AFP_Mod * salary1;
        float AFP_PlV = this.AFP_PlV * salary1;
        float AFP_Pro = this.AFP_Pro * salary1;
        float AFP_Uno = this.AFP_Uno * salary1;

        String afps[] = {"Capital", "Cuprum", "Habitat", "Modelo", "Planvital", "Provida", "Uno"};

        boolean validAFP = false;
        Scanner teclado = new Scanner(System.in);


        while (!validAFP) {

            for (int i = 0; i < afps.length; i++) {
                if (AFP.equalsIgnoreCase(afps[i])) {
                    validAFP = true;
                    break;

                }
            }
            if (!validAFP) {
                System.out.println("AFP no válida, intente nuevamente.");
                AFP = teclado.nextLine();
            }
        }


        if (AFP.equalsIgnoreCase("Capital")) {
            AFP_Client = (int) AFP_Cap;
        } else if (AFP.equalsIgnoreCase("Cuprum")) {
            AFP_Client = (int) AFP_Cup;
        } else if (AFP.equalsIgnoreCase("Habitat")) {
            AFP_Client = (int) AFP_Hab;
        } else if (AFP.equalsIgnoreCase("Modelo")) {
            AFP_Client = (int) AFP_Mod;
        } else if (AFP.equalsIgnoreCase("Planvital")) {
            AFP_Client = (int) AFP_PlV;
        } else if (AFP.equalsIgnoreCase("Provida")) {
            AFP_Client = (int) AFP_Pro;
        } else if (AFP.equalsIgnoreCase("Uno")) {
            AFP_Client = (int) AFP_Uno;
        }
    }

    /**
     * Metodo que retorna el monto de descuento de la AFP seleccionada
     * @return Retornar monto AFP
     */
    public int getAFP_Client() {
        return AFP_Client;
    }

}