package com.mycompany.main;
class Calculator{
    private int salary;
    private float afp;
    private float cesantia;
    private float health;
    private int gratify;
    private float finalsalary;

    public Calculator(int salary,int health,int afp,int gratify){
        this.salary = salary;
        this.health = health;
        this.gratify = gratify;
        this.afp = afp;
        this.cesantia = (float) (0.03*salary);
        this.finalsalary = (this.salary + this.gratify) -(this.afp + this.cesantia + this.health);
    }
    public int getSalaryAfterDiscounts(){
        return (int) this.finalsalary;
    }
    public int CesantiaPercent(){
        return (int) this.cesantia;
    }
}