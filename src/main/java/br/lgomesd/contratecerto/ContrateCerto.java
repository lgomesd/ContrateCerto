/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.lgomesd.contratecerto;

import java.util.Scanner;

/**
 *
 * @author Charliston Rodrigo
 */
public class ContrateCerto {
    
   private static String nome;
   private static String nomeConvenio;
   private static int telefone;                      // COLOCAR NO PROGRAMA PRINCIPAL
   private static int numeroCarteira;
   private static int numeroCarteirinha;
    
    public static void main(String[] args) {
       
        Scanner ler = new Scanner(System.in);     // COLOCAR NO PROGRAMA PRINCIPAL SE PRECISAR E NAO TIVER
        
        Convenio v = new Convenio();                 // COLOCAR NO PROGRAMA PRINCIPAL
        ConvenioMetodos obj = new ConvenioMetodos();  // COLOCAR NO PROGRAMA PRINCIPAL
            
        int operacao = 0;
        char op = ' ';
        
        obj.criarLista();  // COLOCAR NO PROGRAMA PRINCIPAL
        
        int opcao = 0;
        
        System.out.println(" 2 - Convenio_Cadastro ");
        System.out.println(" 3 - Convenio_Consulta ");
        System.out.println(" 4 - Validar");
        
        System.out.println("  ");
        opcao = ler.nextInt();
        System.out.println(" ");
        
        if(opcao == 2){
         
            
                obj.Cadastro(nome, nomeConvenio, telefone, numeroCarteira);    // COLOCAR NO PRINCIPAL
           
        }
        
        System.out.println("Deseja atualizar conveniados ? Se sim teclar (3), para sair teclar qualquer tecla e enter novamente ");
        
        operacao = ler.nextInt();
        if(operacao == 3){
            
            
            obj.atualizar();    // COLOCAR NO PRINCIPAL
            
        }
      
        
        System.out.println("Deseja consultar conveniados ? Se sim teclar (4), para sair teclar qualquer tecla e enter novamente ");
        
        operacao = ler.nextInt();
        if(operacao == 4){
            
            
            obj.Consultar();    // COLOCAR NO PRINCIPAL
            
        }
      
    }

}
