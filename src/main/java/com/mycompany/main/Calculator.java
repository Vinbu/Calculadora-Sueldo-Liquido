package com.mycompany.main;
class Calculator{
    private int salary;
    private float afp;
    private float cesantia;
    private float health;
    private float finalsalary;
   
    public Calculator(int salary){
        Init(salary);
    }
    public final void Init(int salary){
        this.salary = salary;
        this.afp = (float) (0.1*salary);
        this.cesantia = (float) (0.03*salary);
        this.finalsalary = this.salary-(this.afp + this.cesantia + this.health);
    }
    public int getSalaryAfterDiscounts(){
        return (int) this.finalsalary;
    }
    public int AfpPercent(){
        return (int) this.afp;
    }
    public int CesantiaPercent(){
        return (int) this.cesantia;
}}  
