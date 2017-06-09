/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.Cliente;
import model.Produto;
import model.Venda;
import model.Vendedor;

/**
 *
 * @author Aluno
 */
public class ControleVendas {
    private List<Venda> vendas;

    public ControleVendas() {
        this.vendas = new ArrayList<>();
    }
    
    public boolean realizarVenda(Cliente cliente, List<Produto> produtos, Vendedor vendedor){
        if(cliente == null || produtos == null || vendedor == null){
            throw new IllegalArgumentException("Parametros inválidos!");
        }
        
        if(produtos.isEmpty()){
            return false;
        }
        
        if(cliente.getCartaoDeCredito().isEmpty()){
            return false;
        }
        
       return  this.vendas.add(new Venda(cliente, produtos, vendedor));
    }
    
}
