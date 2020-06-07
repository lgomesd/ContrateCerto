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
public class Profissional {
    
       private String nomecompleto = "";
       private String Endereco= "";
       private String email;
       private int CPF = 0;
       private int telefone;
       private int numeroCertificado = 0;
       
       
       public boolean cadastrar(String nomecompleto, String endereco, String email, int CPF, int telefone,int numeroCertificado){
           return false;
       }
     
      public boolean Excluir(String nomecompleto, String endereco, String email, int CPF, int telefone,int numeroCertificado){
        if(nomecompleto.isEmpty()){
            return false;
        }
        else {
              System.out.println("Especialidade " + nomecompleto + " excluído com sucesso!");
            return true;
        }        
        
    }
  
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + this.CPF;
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
        final Profissional other = (Profissional) obj;
        if (this.CPF != other.CPF) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Profissional{" + "nomecompleto=" + nomecompleto + ", Endereco=" + Endereco + ", email=" + email + ", CPF=" + CPF + ", telefone=" + telefone + ", numeroCertificado=" + numeroCertificado + '}';
    }

    /**
     * @return the nomecompleto
     */
    public String getNomecompleto() {
        return nomecompleto;
    }

    /**
     * @param nomecompleto the nomecompleto to set
     */
    public void setNomecompleto(String nomecompleto) {
        this.nomecompleto = nomecompleto;
    }

    /**
     * @return the Endereco
     */
    public String getEndereco() {
        return Endereco;
    }

    /**
     * @param Endereco the Endereco to set
     */
    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the CPF
     */
    public int getCPF() {
        return CPF;
    }

    /**
     * @param CPF the CPF to set
     */
    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    /**
     * @return the telefone
     */
    public int getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the numeroCertificado
     */
    public int getNumeroCertificado() {
        return numeroCertificado;
    }

    /**
     * @param numeroCertificado the numeroCertificado to set
     */
    public void setNumeroCertificado(int numeroCertificado) {
        this.numeroCertificado = numeroCertificado;
    }

    
}
