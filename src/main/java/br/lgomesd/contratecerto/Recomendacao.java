/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.lgomesd.contratecerto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rosangela
 */
public class Recomendacao {
    
     private int Avaliacao = 0;
     private String Depoimentos;
     private List <Profissional> profissional; 
     
        public Recomendacao () {
           this.profissional = new ArrayList();      
       }
     
    public boolean cadastrar(String Depoimentos, int Avaliacao){
            return false;
       }
     
      public boolean Excluir(String Depoimentos, int Avaliacao){
        if(Depoimentos.isEmpty()){
            return false;
        }
        else {
              System.out.println("Depoimentos" + Avaliacao + " excluída com sucesso!");
            return true;
        }        
        
    }  
      
          @Override
    public String toString() {
        return "Recomendacao{" + "Avalia\u00e7\u00e3o=" + Avaliacao + ", Depoimentos=" + Depoimentos + '}';
    }
    

    /**
     * @return the Avaliação
     */
    public int getAvaliacao() {
        return Avaliacao;
    }

    /**
     * @param Avaliacao the Avaliação to set
     */
    public void setAvaliacao(int Avaliacao) {
        this.Avaliacao = Avaliacao;
    }

    /**
     * @return the Depoimentos
     */
    public String getDepoimentos() {
        return Depoimentos;
    }

    /**
     * @param Depoimentos the Depoimentos to set
     */
    public void setDepoimentos(String Depoimentos) {
        this.Depoimentos = Depoimentos;
    }

 } 