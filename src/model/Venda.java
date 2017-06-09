/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class Venda {

    private Cliente cliente;
    private List<Produto> produtos;
    private Vendedor vendedor;

    public Venda() {
        this.cliente = null;
        this.produtos = new ArrayList<>();
        this.vendedor = null;
    }

    public Venda(Cliente cliente, List<Produto> produtos, Vendedor vendedor) {
        this.cliente = cliente;
        this.produtos = produtos;
        this.vendedor = vendedor;
    }
    
    

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the produtos
     */
    public List<Produto> getProdutos() {
        return produtos;
    }

    /**
     * @param produtos the produtos to set
     */
    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    /**
     * @return the vendedor
     */
    public Vendedor getVendedor() {
        return vendedor;
    }

    /**
     * @param vendedor the vendedor to set
     */
    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
    
    public double calcularValorDaVenda(){ 
        if(this.produtos.isEmpty()){
            throw new Error("Lista de produtos vazia");
        }
        
        if(this.cliente == null || this.vendedor == null){
             throw new Error("Componentes da compra vazios");
        }
        
        double valorVenda = 0;
        for(Produto produto : this.produtos){
            valorVenda += produto.calularValorFinal();
        }
        return valorVenda;
    }

}
