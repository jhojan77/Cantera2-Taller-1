
package com.mycompany.cantera.taller1;
/**
 * representa una clase cuenta bancaria con sus atributos y metodos
 * @author jhojan hoyos
 */

public class BankAccount {
    /**
     * representa el numero de cuenta bancaria de un usuario
     */
    private int accountNumber;
    /**
     * representa el tipo de cuenta(ahorros/corriente)
     */
    private int typeAccount;
    /**
     * representa el estado de una cuenta
     */
    protected Boolean activated;

    //Métodos get/set de los atributos
    public int getAccountNumber() {
        return accountNumber;
    }

      public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
      
     public int getTypeAccount() {
        return typeAccount;
    }

    public void setTypeAccount(int typeAccount) {
        this.typeAccount = typeAccount;
    }
    
    public Boolean getActivated() {
        return activated;
    }

    public void setActivated(Boolean activated) {
        this.activated = activated;
    }
    

    
    
    
}
