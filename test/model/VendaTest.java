/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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
public class VendaTest {
    private static Venda venda;
    public VendaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("p1", 10, 10));
        produtos.add(new Produto("p2", 40, 30));
        produtos.add(new Produto("p3", 100, 65));
        VendaTest.venda = new Venda(new Cliente("23423", "c1", "12312", new Date(), 1000), produtos, new Vendedor("admin", "admin", "v1", "234", new Date(), 0));
    }
    
    @AfterClass
    public static void tearDownClass() {
        VendaTest.venda = null;
    }
    
    @Before
    public void setUp() {
        
    }
    
    @After
    public void tearDown() {
    }

    
    @Test
    public void testCalcularValorDaVenda() {
        System.out.println("* Teste para calcular o valor da Venda");
        assertEquals(7800, VendaTest.venda.calcularValorDaVenda(), 0);
        VendaTest.venda.getProdutos().add(new Produto("p4", 20, 20));
        assertEquals(8200, VendaTest.venda.calcularValorDaVenda(), 0);
        VendaTest.venda.getProdutos().remove(0);
        assertEquals(8100, VendaTest.venda.calcularValorDaVenda(), 0);
    }
    
}
