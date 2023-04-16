package com.mycompany.main;
import java.util.Scanner;

class Gratify {
    private float gratify;

    /**Obtiene el valor de la Gratificación
     * La siguiente clase se encarga de obtener la Gratificación a partir de la
     * respuesta inicial del usuario, de acuerdo a si fue "Si" o "No".
     * 
     * Nota 1: Se presupone que el usuario pueda ingresar una respuesta no
     * deseada por lo que se le vuelve a preguntar si posee gratificación.
     * 
     * Nota 2: En el caso de que la respuesta sea "No" se define una
     * Gratificación de monto 0.
     * 
     * @param gratify: Respuesta del usuario a la posesión de Gratificación
     * (Si/No)
     */
    public Gratify(String gratify) {
        Scanner teclado = new Scanner(System.in);
        
        while ((!gratify.equalsIgnoreCase("Si")) && (!gratify.equalsIgnoreCase("No"))) {

            System.out.println("La respuesta ingresada no es valida, por favor ingresar Si o No ");
            gratify = teclado.next();
        }

        if (gratify.equalsIgnoreCase("Si")) {
            
            System.out.println("¿Cuál es el monto de su gratificación?: ");
            this.gratify= teclado.nextInt();
            
        }
        else if (gratify.equalsIgnoreCase("No")) {
            this.gratify = 0;
        }
    }

    /**
     * Método que retorna el valor de la Gratifición de acuerdo a las respuestas
     * anteriores
     * @return Retorna la Gratificación
     */
    public int getGratify() {

        return (int) this.gratify;
    }
}