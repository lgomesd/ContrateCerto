/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.lgomesd.contratecerto;

/**
 *
 * @author Rosangela
 */
public class Recomendacao {
    
     private int Avaliação = 0;
     private String Depoimentos;
     private Profissional profissional;

    public boolean cadastrar(String Depoimentos, int Avaliação){
            return false;
       }
     
      public boolean Excluir(String Depoimentos, int Avaliação){
        if(Depoimentos.isEmpty()){
            return false;
        }
        else {
              System.out.println("Depoimentos" + Avaliação + " excluída com sucesso!");
            return true;
        }        
        
    }  
      
          @Override
    public String toString() {
        return "Recomendacao{" + "Avalia\u00e7\u00e3o=" + Avaliação + ", Depoimentos=" + Depoimentos + '}';
    }
    

    /**
     * @return the Avaliação
     */
    public int getAvaliação() {
        return Avaliação;
    }

    /**
     * @param Avaliação the Avaliação to set
     */
    public void setAvaliação(int Avaliação) {
        this.Avaliação = Avaliação;
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