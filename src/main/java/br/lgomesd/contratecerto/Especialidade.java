/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.lgomesd.contratecerto;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Leonardo Gomes Duarte - RA 12105384
 * Classe que define as Especialidades Profissionais
 * A Classe que manipula os objetos desta classe é a EspecialidadeUIGerenciar.java
 */
@Entity

public class Especialidade {
    
    //private EntityManager em;
    
/**
 * Define algumas anotações para manupulação do banco de dados.
 */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_especialidade")
/**
 * Define a variável ID
 */
    private Integer id;
/**
 * Define alguns parâmetros da coluna nome no banco de dados
 */
    @Column(name = "nom_nome", nullable = false, unique = true, length = 100)
/**
 * Define variável nome
 */
    private String nome;
    
    //private final List<Profissional> profissional = new ArrayList<>();

/**
 * Método construtor vazio
 */        
    public Especialidade() {
    }
        
    /**
     * Recebe uma String nome para cadastro no banco de dados
     * @param nome
     * @return true or false
     */    
    /* public Boolean Cadastrar(String nome){
        if(nome.isEmpty()){
            System.out.println("Nome não pode ser vazio");
            return false;
        }
        else {
            
            em.getTransaction().begin();
            em.persist(nome);
            em.getTransaction().commit();
            return true;
        }
        
    } */
    /**
     * Recebe uma String nome para realizar a exclusão no banco de dados
     * @param nome
     * @return true or false
     */
    /*public Boolean Excluir(String nome){
        if(nome.isEmpty()){
            System.out.println("Nome não pode ser vazio");
            return false;
        }
        else {
            em.getTransaction().begin();
            em.remove(nome);
            em.getTransaction().commit();
            System.out.println("Especialidade " + nome + " excluído com sucesso!");
            return true;
        }        
        
    } */
    /**
     * Lista todas as especialidades cadastradas no banco de dados
     * @return 
     */
    /* public List<String> Consultar(){
        //List lst = new List(50, false);        

            TypedQuery<String> query;
        query = em.createQuery(
                "SELECT nom_nome FROM contrate_certo.especialidade", String.class);
            List<String> results = query.getResultList();

        return results;
        } */
/**
 * Define métodos gets, setters, hascode, toString, equals
 * @return 
 */
    public Integer getId() {
        return id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Especialidade{" + "nome=" + nome + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.nome);
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
        final Especialidade other = (Especialidade) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }


    
}
