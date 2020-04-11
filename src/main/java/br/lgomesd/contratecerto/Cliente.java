package br.lgomesd.contratecerto;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Adriano Animus
 */
public class Cliente {

    private String nome;
    private String endereco;
    private int cpf;
    private Date dataNascimento;
    
    
    public boolean cadastrar(String nome, String endereco, int cpf, Date dataNascimento){
        return false;
        
    }
    public boolean excluir(String nome, String endereco, int cpf, Date dataNascimento){
        if(nome.isEmpty()){
            return false;
        }else{
            System.out.println(" Cadastro " + nome + " excluido! ");
        return true;
    }
    }
        
       

    public Cliente(String nome, String endereco, int cpf, Date dataNascimento) {
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.cpf;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (this.cpf != other.cpf) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", endereco=" + endereco + ", cpf=" + cpf + ", dataNascimento=" + dataNascimento + '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

}
