/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.lgomesd.contratecerto;

import java.awt.List;
import java.sql.*;

/**
 *
 * @author lgome
 */
public class Especialidade {
    
    private static final String USERNAME="root";
    private static final String PASSWORD="";
    private static final String CONN_STRING="jdbc:mysql://localhost:3306/contratecerto";
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;
    
    private String nome;
    private String SQL;
    //private List<Profissional> profissional = new ArrayList<>();

    @Override
    public String toString() {
        return "Especialidade{" + "pstmt=" + pstmt + ", rs=" + rs + ", nome=" + getNome() + '}';
    }
    
    
        
    private void Conexao(String SQL){
        
        Connection con = null;
        
        
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
    
    public List Consultar(){
        List lst = new List(50, false);        

                Connection con = null;
        
        
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
               
        return lst;
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
    
}
