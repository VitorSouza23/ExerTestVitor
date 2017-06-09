/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.Cliente;
import model.Produto;
import model.Venda;
import model.Vendedor;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aluno
 */
public class ControleVendasTest {
    private static ControleVendas controleVendas;
    public ControleVendasTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        ControleVendasTest.controleVendas = new ControleVendas();
    }
    
    @AfterClass
    public static void tearDownClass() {
        ControleVendasTest.controleVendas = null;
    }
    
    @Before
    public void setUp() {
        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("p1", 1, 10));
        produtos.add(new Produto("p2", 4, 30));
        produtos.add(new Produto("p3", 10, 65));
        Venda venda = new Venda(new Cliente("23423", "c1", "12312", new Date(), 10000), produtos, new Vendedor("admin", "admin", "v1", "234", new Date(), 0));
        ArrayList<Venda> vendas = new ArrayList<>();
        vendas.add(venda);
        ControleVendasTest.controleVendas.setVendas(vendas);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of realizarVenda method, of class ControleVendas.
     */
    @Test
    public void testRealizarVenda() {
        System.out.println("* Teste para realizar Venda");
        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("p4", 2, 114));
        produtos.add(new Produto("p5", 4, 84.69));
        produtos.add(new Produto("p6", 7, 94.2));
        assertTrue(ControleVendasTest.controleVendas.realizarVenda(new Cliente("98789", "c2", "1897", new Date(), 10000), produtos, new Vendedor("admin", "admin", "v2", "345", new Date(), 0)));
    }
    
    @Test
    public void testRealizarVendaSaldoInsuficiente() {
        System.out.println("* Teste para realizar Venda Saldo Insuficiente");
        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("p4", 20, 114));
        produtos.add(new Produto("p5", 48, 84.69));
        produtos.add(new Produto("p6", 71, 94.2));
        assertFalse(ControleVendasTest.controleVendas.realizarVenda(new Cliente("98789", "c2", "1897", new Date(), 100), produtos, new Vendedor("admin", "admin", "v2", "345", new Date(), 0)));
    }
    
    @Test
    public void testRealizarVendaListaDeProdutosVazios() {
        System.out.println("* Teste para realizar Venda Lista de Produtos Vazios");
        ArrayList<Produto> produtos = new ArrayList<>();
        assertFalse(ControleVendasTest.controleVendas.realizarVenda(new Cliente("98789", "c2", "1897", new Date(), 1000), produtos, new Vendedor("admin", "admin", "v2", "345", new Date(), 0)));
    }

    @Test
    public void testRealizarVendaClienteSemCartaoDeCredito() {
        System.out.println("* Teste para realizar Venda com cliente sem cartão de credito");
        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("p4", 2, 114));
        produtos.add(new Produto("p5", 4, 84.69));
        produtos.add(new Produto("p6", 7, 94.2));
        assertFalse(ControleVendasTest.controleVendas.realizarVenda(new Cliente("", "c2", "1897", new Date(), 1000), produtos, new Vendedor("admin", "admin", "v2", "345", new Date(), 0)));
    }
    /**
     * Test of removerVenda method, of class ControleVendas.
     */
    @Test
    public void testRemoverVenda() {
        System.out.println("* Teste para realizar remover Venda");
        assertTrue(ControleVendasTest.controleVendas.removerVenda(ControleVendasTest.controleVendas.getVendas().get(0)));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testRemoverVendaNulla() {
        System.out.println("* Teste para realizar remover Venda nulla");
        ControleVendasTest.controleVendas.removerVenda(null);
    }
    
    @Test(expected = Error.class)
    public void testRemoverVendaListaVazia() {
        System.out.println("* Teste para realizar remover Venda de lista vazia");
        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("p1", 1, 10));
        produtos.add(new Produto("p2", 4, 30));
        produtos.add(new Produto("p3", 10, 65));
        Venda venda = new Venda(new Cliente("23423", "c1", "12312", new Date(), 10000), produtos, new Vendedor("admin", "admin", "v1", "234", new Date(), 0));
        ControleVendasTest.controleVendas.setVendas(new ArrayList<>());
        ControleVendasTest.controleVendas.removerVenda(venda);
    }
}
