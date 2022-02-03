
package com.mycompany.cantera.taller1;

import java.util.Date;

/**
 * representa una clase personas con sus atributos y metodos
 * @author jhojan hoyos
 */
public class Persons {
     /**
     * representa el nombre del usuario
     */
    private String name;
    /**
     * representa el primer apellido del usuario
     */
    private String lastName1 ;
    /**
     * representa el segundo apellido del usuario
     */
    private String lastName2;
    /**
     * representa la fecha de cumpleaños del usuario
     */
    private Date dateBirth;
    /**
     * representa la altura del usuario
     */
    private Float height;
    /**
     * representa la edad del usuario
     */
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
