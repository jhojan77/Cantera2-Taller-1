
package com.mycompany.cantera.taller1;
/**
 * representa una clase frutas con sus atributos y metodos
 * @author jhojan hoyos
 */
import java.util.ArrayList;
 
public class Fruits {
    /**
     * representa el nombre de la fruta
     */
    public String name;
    /**
     * representa un ArrayList de objetos del atributo color
     */
    private ArrayList<String> color;
     /**
     * representa el peso de la fruta
     */
    private Float averageWeigth;

    
    //Métodos get/set de los atributos
    public ArrayList<String> getColor() {
        return color;
    }

    public void setColor(ArrayList<String> color) {
        this.color = color;
    }

    public Float getAverageWeigth() {
        return averageWeigth;
    }

    public void setAverageWeigth(Float averageWeigth) {
        this.averageWeigth = averageWeigth;
    }
    
}
