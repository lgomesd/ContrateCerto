


package br.lgomesd.contratecerto;

import java.util.Scanner;

/**
 *
 * @author Charliston Rodrigo
 */
public class ConvenioMetodos {
    
    Scanner ler = new Scanner(System.in);
    public int tamanho = 0;
    Convenio cabeca, cauda, v;

    public void criarLista() {
        // cabeca = new Convenio();
        cabeca = cauda = null;
        tamanho = 0;
    }

    public void Cadastro(String nome, String nomeConvenio, int telefone, int numeroCarteira) {
        v = new Convenio(nome, nomeConvenio, telefone, numeroCarteira);

        char op = ' ';
        while (op != 'S') {
            System.out.println("Cadastro : ");

            System.out.println("");
            ler.nextLine();
            System.out.print(" Informe o nome do cliente : ");
            nome = ler.nextLine();
            System.out.println(" ");

            System.out.print(" Informe o nome do convenio : ");
            nomeConvenio = ler.nextLine();
            System.out.println(" ");

            System.out.print(" Informe o numero de telefone do cliente : ");
            telefone = ler.nextInt();
            System.out.println(" ");

            System.out.print(" Informe o numero da carteirinha do convenio : ");
            numeroCarteira = ler.nextInt();
            System.out.println(" ");

            v = new Convenio(nome, nomeConvenio, telefone, numeroCarteira);

            if (tamanho == 0) {
                cabeca = cauda = v;
            } else {
                cauda.prox = v;
                cauda = v;
            }
            tamanho++;

            System.out.print("\n\n - Tecle (S) para finalizar o cadastro , senão teclar qualquer tecla e enter para continuar : ");
            op = ler.next().charAt(0);
            System.out.println(" ");

        }

    }

    public void Consultar() {
        int numeroCarteirinha;
        System.out.println("Numero da carteira :");
        numeroCarteirinha = ler.nextInt();

        if (tamanho == 0) {
            throw new IllegalArgumentException("Cadastro vazio");
        }

        Convenio ant, at;
        boolean achou = false;
        ant = null;
        at = cabeca;

        while (at != null) {
            if (at.getNumeroCarteira() == numeroCarteirinha) {
                achou = true;
                System.out.println("II");
                
                System.out.println(toString());

                break;

            }
            ant = at;
            at = at.prox;

        }
        if (!achou) {
            throw new IllegalArgumentException("Não existe carteira com o numero informado! ");
        }

    }

    public void atualizar() {        // MOSTRA A INCLUSÃO DO CONVENIADO NO SISTEMA.
        Convenio v = cabeca;
        while (v != null) {
            System.out.println(" ");
            System.out.println("Nome : " + v.getNome() + "\n" + "Numero da carteira :" + v.getNumeroCarteira() + "\n" + "Nome do convenio : " + v.getNomeConvenio() + "\n" + "Telefone :" + v.getTelefone());
            System.out.println(" ");
            v = v.prox;
        }
    }

    @Override
    public String toString() {  // MOSTRA A INCLUSÃO DO CONVENIADO NO SISTEMA.
        Convenio v = cabeca;
        return " Nome de  : "
                + v.getNome()
                + " \n"
                + " Nome do convenio : "
                + v.getNomeConvenio()
                + " \n"
                + " Numero de telefone : "
                + v.getTelefone()
                + " \n"
                + " Numero de carteirinha : "
                + v.getNumeroCarteira();

    }
}
