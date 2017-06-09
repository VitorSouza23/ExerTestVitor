/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
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
public class VendedorTest {
    private static Vendedor vendedor;
    public VendedorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        VendedorTest.vendedor = new Vendedor("admin", "admin", "vendedor", "234234", new Date(), 0);
    }
    
    @AfterClass
    public static void tearDownClass() {
        VendedorTest.vendedor = null;
    }
    
    @Before
    public void setUp() {
        VendedorTest.vendedor.setQtdVendasRealizadas(0);
    }
    
    @After
    public void tearDown() {
    }

  
    @Test
    public void testIncrementarQuantidadeDeVendas() {
        System.out.println("* Teste para incrementar quantidade de vendas");
        VendedorTest.vendedor.incrementarQuantidadeDeVendas();
        VendedorTest.vendedor.incrementarQuantidadeDeVendas();
        VendedorTest.vendedor.incrementarQuantidadeDeVendas();
        VendedorTest.vendedor.incrementarQuantidadeDeVendas();
        VendedorTest.vendedor.incrementarQuantidadeDeVendas();
        VendedorTest.vendedor.incrementarQuantidadeDeVendas();
        VendedorTest.vendedor.incrementarQuantidadeDeVendas();
        assertEquals(7, VendedorTest.vendedor.getQtdVendasRealizadas());
    }
    
}
