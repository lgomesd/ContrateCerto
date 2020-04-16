/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.lgomesd.contratecerto;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Leonardo Gomes Duarte - RA 12105384
 * Classe para cadastro, exclusão e consulta de Especialidades Profissionais
 */
public class Especialidade {
    
    private static final String USERNAME="root";
    private static final String PASSWORD="";
    private static final String CONN_STRING="jdbc:mysql://localhost:3306/projetointegrador";
    private final PreparedStatement pstmt = null;
    private final ResultSet rs = null;
    
    private String nome;
    private String SQL;
    private final List<Profissional> profissional = new ArrayList<>();
     
    private void Conexao(String SQL){
        
        Connection con;
        
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
            Statement stmt = (Statement) con.createStatement();
            stmt.execute(SQL);
        } catch (SQLException | ClassNotFoundException e){
            System.err.println(e);
                System.out.println("entrei aqui 2");// handle the error
    }
    }
    /**
     * Recebe uma String nome para cadastro no banco de dados
     * @param nome
     * @return true or false
     */    
    public Boolean Cadastrar(String nome){
        if(nome.isEmpty()){
            System.out.println("Nome não pode ser vazio");
            return false;
        }
        else {
            SQL = "INSERT INTO projetointegrador.especialidades(nome) VALUE ('"+nome+"')";
            Conexao(SQL);
            return true;
        }
        
    }
    /**
     * Recebe uma String nome para realizar a exclusão no banco de dados
     * @param nome
     * @return true or false
     */
    public Boolean Excluir(String nome){
        if(nome.isEmpty()){
            System.out.println("Nome não pode ser vazio");
            return false;
        }
        else {
            SQL = "DELETE FROM projetointegrador.especialidades WHERE nome='"+nome+"'";
            Conexao(SQL);
            System.out.println("Especialidade " + nome + " excluído com sucesso!");
            return true;
        }        
        
    }
    /**
     * Lista todas as especialidades cadastradas no banco de dados
     */
    public void Consultar(){
        //List lst = new List(50, false);        

                Connection con;
        
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
            Statement stmt = (Statement) con.createStatement();
            SQL = "SELECT nome FROM projetointegrador.especialidades";
            ResultSet rs = stmt.executeQuery(SQL);
            while (rs.next()){
                String resultado = rs.getString("nome");
                System.out.println(resultado);
                //lst.add(rs.getString(nome));
                
            }
        } catch (SQLException | ClassNotFoundException e){
            System.err.println(e);
                System.out.println("entrei aqui 2");// debugando
    }
               
        //return lst;
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
