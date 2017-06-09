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
public class Vendedor extends AbstractPessoa {

    private String login;
    private String senha;

    public Vendedor() {
        this.login = "";
        this.senha  = "";
    }

    public Vendedor(String login, String senha, String nome, String cpf, Date dataNasc) {
        super(nome, cpf, dataNasc);
        this.login = login;
        this.senha = senha;
    }
    
    

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

}
