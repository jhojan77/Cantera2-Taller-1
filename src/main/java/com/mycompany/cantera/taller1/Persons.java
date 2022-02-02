
package com.mycompany.cantera.taller1;

import java.util.Date;


public class Persons {
     //atributos de clase empleado
    private String name;
    private String lastName1 ;
    private String lastName2;
    private Date dateBirth;
    private Float height;
    protected int age;
    
    
   //Métodos get/set de los atributos
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName1() {
        return lastName1;
    }

    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }

    public String getLastName2() {
        return lastName2;
    }

    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }

    public Date getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
}
