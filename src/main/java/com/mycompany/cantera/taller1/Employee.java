
package com.mycompany.cantera.taller1;

/**
 * representa una clase empleado con sus atributos y metodos
 * @author jhojan hoyos
 */
public class Employee {
  /**
     * representa el id unico para un empleado
     */
    private String dni;
    /**
     * representa la edad de un empleado
     */
    private int age;
    /**
     * representa el nombre del empleado
     */
    private String nombre;
    /**
     * representa el salario mensual de un empleado
     */
    private double salary;
    /**
     * representa las horas extras trabajadas por un empleado
     */
    private int overtime;
    /**
     * representa el valor total de la hora extra 
     */
    private double overtimeValue;
    /**
     * representa la cuenta unica de nomina del empleado
     */
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
   
    /**
     * calcula el valor total a pagar a un empleado por sus horas extras trabajadas
     * @return Total neto a pagar #horas extras * valor de hora extra
     */
    public double calculateOvertimeAmount(){
        return overtime * overtimeValue;
    }
    
     /**
      * calcula el salario total mensual de un empleado
      * @return salario neto mensual
      */
    public double calculateNetSalary(){
        return salary + calculateOvertimeAmount();
    }
    
}

