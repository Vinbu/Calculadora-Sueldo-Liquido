package com.mycompany.main;

class Gratify {
    private float gratify = 0.25F;
    private float client_gratify;

    public Gratify(String gratify, int salary) {
        while (!gratify.equalsIgnoreCase("Si") && (!gratify.equalsIgnoreCase("No"))) {

            System.out.println("La gratificacion ingresada no es valida, por favor ingresar Si o No ");
        }

        if (gratify.equalsIgnoreCase("Si")) {
            this.client_gratify = salary * this.gratify;
        }
        else if (gratify.equalsIgnoreCase("No")) {
            this.client_gratify = 0;
        }
    }

    public int getGratify() {

        return (int) this.client_gratify;
    }
}
