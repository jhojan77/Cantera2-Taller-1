
package taller1;
/**
 * representa una clase peliculas con sus atributos y un metodo para evaluar la aceptacion por el publico
 * @author jhojan hoyos
 */
public class Movie {
    /**
     * representa el nombre de la pelicula
     */
    private String filmName;
     /**
     * representa el nombre del director la pelicula
     */
    private String director;
     /**
     * representa el genero al que esta asociado la pelicula
     */
    private String gender;
     /**
     * representa la duracion de la pelicula
     */
    private int duration;
     /**
     * representa el año de produccion de la pelicula
     */
    private int year;
     /**
     * representa el nivel de aceptacion por el publico de la pelicula
     */
    private double calification;

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getCalification() {
        return calification;
    }

    public void setCalification(double calification) {
        this.calification = calification;
    }
    
   /**
    * condicional para escoger la opcion pasada por el usuario
    * @return devuelve el parametro correspondientea la opcion digitada
    */
    public String calculateFilmRating() {
        
        if (calification >= 0 && calification <= 2) { 
            return "Muy mala";
        } 
        else if (calification > 2 && calification <= 5) { 
            return "Mala";
        } 
        else if (calification > 5 && calification <= 7) { 
            return "Regular";
        }
        else if (calification > 7 && calification <= 8) { 
            return "Buena";
        }
        else if (calification > 8 && calification <= 10){ 
            return "Excelente";
        }
        else {
            return "Ingrese una valoración válida entre 0 y 10";
        }
     }
  }
        