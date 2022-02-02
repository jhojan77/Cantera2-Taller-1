
package com.mycompany.cantera.taller1;


public class Employee {
  //atributos de clase empleado
    private String dni;
    private int age;
    private String nombre;
    private double salary;
    private int overtime;
    private double overtimeValue;
    protected double payrollAccount;

    //Métodos get/set de los atributos
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getOvertime() {
        return overtime;
    }

    public void setOvertime(int overtime) {
        this.overtime = overtime;
    }

    public double getOvertimeValue() {
        return overtimeValue;
    }

    public void setOvertimeValue(double overtimeValue) {
      this.overtimeValue = overtimeValue;
    }

    public double getPayrollAccount() {
        return payrollAccount;
    }

    public void setPayrollAccount(double payrollAccount) {
        this.payrollAccount = payrollAccount;
    }
   
    //metodo para calcular el pago total por horas extras trabajadas
    public double calculateOvertimeAmount(){
        return overtime * overtimeValue;
    }
    
     //metodo para calcular el sueldo total, asi: salario + horas extras del trabajador
    public double calculateNetSalary(){
        return salary + calculateOvertimeAmount();
    }
    
}

