
package com.mycompany.cantera.taller1;
/**
 * representa una clase biblioteca con sus atributos y metodos
 * @author jhojan hoyos
 */
public class Library {
    /**
     * representa el id unico para un prestamo de un libro
     */
    protected int idRent;
    /**
     * representa el dato de la persona que alquila un libro
     */
    private String namePersonRent;
    /**
     * representa el titulo del libro
     */
    private String bookTitle;
    /**
     * representa el nombre del autor del libro
     */
    private String authorBook;
    /**
     * representa los ejemplares correpondientes a un libro
     */
    private int exemplary;
    /**
     * representa los libros rentados a un usuario
     */
    private int rentedBooks;
    
    //Métodos get/set de los atributos

    public int getIdRent() {
        return idRent;
    }

    public void setIdRent(int idRent) {
        this.idRent = idRent;
    }

    public String getNamePersonRent() {
        return namePersonRent;
    }

    public void setNamePersonRent(String namePersonRent) {
        this.namePersonRent = namePersonRent;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthorBook() {
        return authorBook;
    }

    public void setAuthorBook(String authorBook) {
        this.authorBook = authorBook;
    }

    public int getExemplary() {
        return exemplary;
    }

    public void setExemplary(int exemplary) {
        this.exemplary = exemplary;
    }

    public int getRentedBooks() {
        return rentedBooks;
    }

    public void setRentedBooks(int rentedBooks) {
        this.rentedBooks = rentedBooks;
    }
    
   /**
    * realiza el prestamo de un libro, validadando si hay existencias
    * @return el libro a prestamo
    */
    public boolean loanBook() {
        boolean rent = true;
        if (rentedBooks < exemplary) {
            rentedBooks++;
        } else {
            rent = false;
        }
        return rent;
    }

    /**
     * realiza la devolucion de un libro prestado,validadando que dicho libro exista en prestamos y lo resta del total de libros prestados
     * @return la devolucion del libro
     */
    public boolean returnBook() {
        boolean booksReturned = true;
        if (rentedBooks == 0) {
            booksReturned = false;
        } else {
            rentedBooks--;
        }
        return booksReturned;
    }
}
