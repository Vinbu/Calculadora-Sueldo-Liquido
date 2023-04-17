package com.mycompany.main;

/**
 * La siguiente clase se encarga de definir los parámetros a utlizar, para
 * realizar los debidos cálculos para obtener el Sueldo Líquido.
 */
class Calculator {
    private float salary;
    private float afp;
    private float cesantia;
    private float health;
    private float finalsalary;

    /**
     * @param salary1 Sueldo Bruto ingresado por el usuario.
     * @param health  Valor del descuento del Seguro de Salud
     * @param afp     Valor del descuento por AFP
     */
    public Calculator(float salary1, int health, int afp) {
        this.salary = salary1;
        this.health = health;
        this.afp = afp;
        this.cesantia = (float) (0.006 * this.salary);
        this.finalsalary = (this.salary) - (this.afp + this.cesantia + this.health);
    }

    /**
     * Método que permite obtener el Sueldo Líquido después de todos los
     * debidos descuentos.
     *
     * @return Salario Final
     */
    public int getSalaryAfterDiscounts() {
        return (int) this.finalsalary;
    }

    /**
     * Método que permite obtener el descuento del Seguro de Cesantía después
     * de su debido cálculo.
     *
     * @return Descuento cesantía
     */
    public int CesantiaPercent() {
        return (int) this.cesantia;
    }
}