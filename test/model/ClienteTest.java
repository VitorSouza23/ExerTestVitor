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
public class ClienteTest {
    private static Cliente cliente;
    public ClienteTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        ClienteTest.cliente = new Cliente("12345", "Flano", "111111111", new Date(), 1000);
    }
    
    @AfterClass
    public static void tearDownClass() {
        ClienteTest.cliente =  null;
    }
    
    @Before
    public void setUp() {
        ClienteTest.cliente.setSaldo(1000);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addSaldo method, of class Cliente.
     */
    @Test
    public void testAddSaldo() {
        System.out.println("* Teste para adicionar Saldo");
        System.out.println("Saldo Original: " + ClienteTest.cliente.getSaldo());
        assertTrue(ClienteTest.cliente.addSaldo(100));
        System.out.println("Novo saldo: " + ClienteTest.cliente.getSaldo());
        assertTrue(ClienteTest.cliente.addSaldo(0));
        System.out.println("Novo saldo: " + ClienteTest.cliente.getSaldo());
        assertTrue(ClienteTest.cliente.addSaldo(3.6));
        System.out.println("Novo slado: " + ClienteTest.cliente.getSaldo());
    }
    @Test(expected = IllegalArgumentException.class)
    public void testAddSaldoComParametrosNegativos() {
        System.out.println("* Teste para adicionar Saldo Negativo");
        ClienteTest.cliente.addSaldo(-10);
    }

    /**
     * Test of subtrairDoSaldo method, of class Cliente.
     */
    @Test
    public void testSubtrairDoSaldo() {
        System.out.println("* Teste para subtrair Saldo");
        System.out.println("Saldo Original: " + ClienteTest.cliente.getSaldo());
        assertTrue(ClienteTest.cliente.subtrairDoSaldo(100));
        System.out.println("Novo saldo: " + ClienteTest.cliente.getSaldo());
        assertTrue(ClienteTest.cliente.subtrairDoSaldo(0));
        System.out.println("Novo saldo: " + ClienteTest.cliente.getSaldo());
        assertTrue(ClienteTest.cliente.subtrairDoSaldo(3.6));
        System.out.println("Novo slado: " + ClienteTest.cliente.getSaldo());
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testSubtrairDoSaldoComNUmeroNegativo(){
        System.out.println("* Teste para subtrair Saldo Negativo");
        ClienteTest.cliente.subtrairDoSaldo(-10);
    }
    
    @Test(expected = Error.class)
    public void testSubtrairValorMaiorQueOSaldoDisponivel(){
        System.out.println("* Teste para subtrair valor maior que Saldo disponível");
        ClienteTest.cliente.subtrairDoSaldo(1100);
    }
    
}
