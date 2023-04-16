package com.mycompany.main;
class Calculator{
    private float salary;
    private float afp;
    private float cesantia;
    private float health;
    private float finalsalary;

    /**Define los parámetros de la clase actual y realiza los cálculos
     * La siguiente clase se encarga de definir los parámetros a utlizar, para 
     * realizar los debidos cálculos para obtener el Sueldo Líquido.
     * 
     * Nota 1: El seguro de cesantía es un porcentaje fijo para cualquier 
     * persona, por lo tanto se calcula como el 3% del Sueldo Base con 
     * Gratificación.
     * 
     * Nota 2: La gratificación es una bonifición que se suma al Sueldo Bruto ya
     * que es una bonificación, mientras que los descuentos como el de AFP, 
     * Seguro de Cesantía y Seguro de Salud se le descuentan al Sueldo Bruto 
     * junto con la Gratificación
     * 
     * @param salary Sueldo Bruto ingresado por el usuario.
     * @param health Valor del descuento del Seguro de Salud
     * @param afp Valor del descuento por AFP
     * @param gratify Valor de la Gratificación ingresada por el usuario.
     */
    public Calculator(float salary1,int health,int afp){
        this.salary = salary1;
        this.health = health;
        this.afp = afp;
        this.cesantia = (float) (0.03*this.salary);
        this.finalsalary = (this.salary) -(this.afp + this.cesantia + this.health);
    }
    
    /**
     * Método que permite obtener el Sueldo Líquido después de todos los
     * debidos descuentos.
     * @return Salario Final
     */
    public int getSalaryAfterDiscounts(){
        return (int) this.finalsalary;
    }
    
    /**
     * Método que permite obtener el descuento del Seguro de Cesantía después
     * de su debido cálculo.
     * @return Descuento cesantía
     */
    public int CesantiaPercent(){
        return (int) this.cesantia;
    }
}