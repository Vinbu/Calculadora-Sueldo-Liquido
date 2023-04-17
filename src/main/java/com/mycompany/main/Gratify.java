package com.mycompany.main;

import java.util.Scanner;
/**
 * Obtiene el valor de la Gratificación
 * La siguiente clase se encarga de obtener la Gratificación a partir de la
 * respuesta inicial del usuario, de acuerdo a si fue "Si" o "No".
 * <p>
 * Nota 1: Se presupone que el usuario pueda ingresar una respuesta no
 * deseada por lo que se le vuelve a preguntar si posee gratificación.
 *
 */
class Gratify {
    private float gratify_percent = 1;


    /**
     * Obtiene el valor de la Gratificación
     * La siguiente clase se encarga de obtener la Gratificación a partir de la
     * respuesta inicial del usuario, de acuerdo a si fue "Si" o "No".
     * <p>
     * Nota 1: Se presupone que el usuario pueda ingresar una respuesta no
     * deseada por lo que se le vuelve a preguntar si posee gratificación.
     *
     * @param gratify: Respuesta del usuario a la posesión de Gratificación
     *                 (Si/No)
     */

    public Gratify(String gratify) {
        Scanner teclado = new Scanner(System.in);

        while ((!gratify.equalsIgnoreCase("Si")) && (!gratify.equalsIgnoreCase("No"))) {

            System.out.println("La respuesta ingresada no es valida, por favor ingresar Si o No ");
            gratify = teclado.next();
        }

        if (gratify.equalsIgnoreCase("Si")) {
            gratify_percent = 0.25f;
        } else if (gratify.equalsIgnoreCase("No")) {
        }
    }

    /**
     * Método que retorna el valor de la Gratifición de acuerdo a las respuestas
     * anteriores
     *
     * @return Retorna la Gratificación
     */
    public float getGratify_percent() {

        return gratify_percent;
    }
}