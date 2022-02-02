
package com.mycompany.cantera.taller1;

public class Library {
    //atributos de la clase biblioteca
    protected int idRent;
    private String namePersonRent;
    private String bookTitle;
    private String authorBook;
    private int exemplary;
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
    
    //Este método PRESTAMO se usara realizar el prestamo de un libro 
    //No se puede prestar un libro sino hay algun ejemplar disponible
    //Se pone condicion de arrojar verdadero si se ha podido realizar y falso en caso contrario.
    public boolean loanBook() {
        boolean rent = true;
        if (rentedBooks < exemplary) {
            rentedBooks++;
        } else {
            rent = false;
        }
        return rent;
    }

    //este método DEVOLUCION se usara para la devolución de un libro
    //No se puede devolver un libro que no se haya prestado
    //la idea tambien es que que al devolver un libro se este se reste del acumulado de libros en prestamo
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
