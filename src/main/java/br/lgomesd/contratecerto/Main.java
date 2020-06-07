/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.lgomesd.contratecerto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author lgome
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Especialidade e = new Especialidade();
        /* String nome = "Advogado";
        e.setNome(nome);
        
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ContrateCertoPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
            em.persist(e);
            em.getTransaction().commit(); */
        
        //e.Cadastrar("Advogado");
        //e.Excluir("Nutricionista");
        //e.Cadastrar("Destista");
        //e.Excluir("Destista");
        //e.Cadastrar("Bombeiro");
        //e.Excluir("Bombeiro");
        //e.Excluir("Advogado");
        //List Consultar = e.Consultar();
        //for (int i = 0; i < Consultar.countItems(); i++)
        //    System.out.println(Consultar.getItem(i));
        //System.out.println(Consultar.getItems());
        //e.Consultar();
        
        // Utilizando a classe especialidade
        Especialidade especialidade1 = new Especialidade();
        
        especialidade1.setNome("Advogado");
        
        System.out.println(especialidade1);
        
    }
    
}
