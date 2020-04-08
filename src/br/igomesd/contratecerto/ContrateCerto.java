
package br.igomesd.contratecerto;

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
        System.out.println(" Informe a opção desejada ; ");
        
        System.out.println(" Cliente ");
        
        System.out.println(" 2 - Convenio_Cadastro ");
        System.out.println(" 3 - Convenio_Consulta ");
        
        System.out.println(" especialidades ");
        System.out.println(" Servicos ");
        System.out.println(" Profissionais ");
        System.out.println(" Pagamento ");
        System.out.println(" Usuarios ");
        System.out.println(" Recomendação ");
        System.out.println(" Sair do programa ");
        
        System.out.println("  ");
        opcao = ler.nextInt();
        System.out.println(" ");
        
        if(opcao == 2){
          /*  
            while(op!= 'S'){
       /*         
                System.out.println("Cadastro : ");
                
                System.out.println("");
                ler.nextLine();
                System.out.print(" Informe o nome do cliente : ");
                String nome = ler.nextLine();
                System.out.println(" ");
                
                System.out.print(" Informe o nome do convenio : ");
                String nomeConvenio = ler.nextLine();
                System.out.println(" ");
                
                System.out.print(" Informe o numero de telefone do cliente : ");
                int telefone = ler.nextInt();
                System.out.println(" ");
                
                System.out.print(" Informe o numero da carteirinha do convenio : ");
                int numeroCarteira = ler.nextInt();
                System.out.println(" ");
            */ 
            
                obj.Cadastro(nome, nomeConvenio, telefone, numeroCarteira);    // COLOCAR NO PRINCIPAL
            /*     
                System.out.println("-------------------------------------\n\n\n");
            
                System.out.println(obj.toString());
                        
                System.out.println("-------------------------------------\n\n\n");
               
                System.out.println(" ");
                
                
                
                System.out.print("\n\n - Tecle (S) para finalizar o cadastro , senão teclar qualquer tecla e enter para continuar : ");              
                op = ler.next().charAt(0);
                System.out.println(" ");
                               
            }
                     
                System.out.println("-------------------------------------\n\n\n");         
                obj.print();
                System.out.println("-------------------------------------\n\n\n");
            */   
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
    
