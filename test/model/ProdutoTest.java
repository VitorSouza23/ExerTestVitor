/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

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
public class ProdutoTest {
    private static Produto produto;
    public ProdutoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        ProdutoTest.produto = new Produto("p1", 10, 100);
    }
    
    @AfterClass
    public static void tearDownClass() {
        ProdutoTest.produto = null;
    }
    
    @Before
    public void setUp() {
        ProdutoTest.produto.setQuantidade(10);
        ProdutoTest.produto.setValor(100);
    }
    
    @After
    public void tearDown() {
    }

    
    /**
     * Test of setQuantidade method, of class Produto.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSetQuantidadeNegativa() {
        System.out.println("* Teste para atribuir uma qunatidade negativa");
        ProdutoTest.produto.setQuantidade(-1);
    }


    /**
     * Test of setValor method, of class Produto.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSetValor() {
        System.out.println("* Teste para atribuir um valor negativo");
        ProdutoTest.produto.setValor(-1);
    }

    /**
     * Test of calularValorFinal method, of class Produto.
     */
    @Test
    public void testCalularValorFinal() {
        System.out.println("* Teste para calculo de valor final");
        ProdutoTest.produto.setQuantidade(2);
        ProdutoTest.produto.setValor(2);
        assertEquals(4, ProdutoTest.produto.calularValorFinal(), 0);
        ProdutoTest.produto.setQuantidade(10);
        ProdutoTest.produto.setValor(248);
        assertEquals(2480, ProdutoTest.produto.calularValorFinal(), 0);
        
    }
    
}
