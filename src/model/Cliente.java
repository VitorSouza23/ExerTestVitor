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
private double saldo;

    public Cliente() {
        this.cartaoDeCredito  = "";
        this.saldo = 0;
    }

    public Cliente(String cartaoDeCredito, String nome, String cpf, Date dataNasc, double saldo) {
        super(nome, cpf, dataNasc);
        this.cartaoDeCredito = cartaoDeCredito;
        this.saldo = saldo;
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

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public boolean addSaldo(double valor){
        if(valor < 0){
            throw new IllegalArgumentException("Parametro não pode ser negativo!");
        }
        this.saldo += valor;
        return true;
    }
    
    public boolean subtrairDoSaldo(double valor){
        if(valor < 0){
            throw new IllegalArgumentException("Parametro não pode ser negativo!");
        }
        
        if(this.saldo - valor < 0){
            throw new Error("Saldo insuficiente!");
        }
        this.saldo -= valor;
        return true;
    }
    
}
