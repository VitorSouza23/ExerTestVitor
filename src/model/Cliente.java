/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import abstracts.AbstractPessoa;
import java.util.Date;

/**
 *
 * @author Aluno
 */
public class Cliente extends AbstractPessoa{
private String cartaoDeCredito;

    public Cliente() {
        this.cartaoDeCredito  = "";
    }

    public Cliente(String cartaoDeCredito, String nome, String cpf, Date dataNasc) {
        super(nome, cpf, dataNasc);
        this.cartaoDeCredito = cartaoDeCredito;
    }
    
    /**
     * @return the cartaoDeCredito
     */
    public String getCartaoDeCredito() {
        return cartaoDeCredito;
    }

    /**
     * @param cartaoDeCredito the cartaoDeCredito to set
     */
    public void setCartaoDeCredito(String cartaoDeCredito) {
        this.cartaoDeCredito = cartaoDeCredito;
    }
    
}
