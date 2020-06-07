/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.lgomesd.contratecerto;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
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
        
        System.out.println("Especialidade: " + especialidade1);
        
        //Utilizando a classe Cliente
        Date data = new Date(1987, 04, 17);
        SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = formatar.format(data);
        Cliente cliente1 = new Cliente("Adolfo", "Rua sem saída, n. 4", 000123456756, data);
        
        System.out.println("Cliente :" + cliente1);
        
        //Utilizando a classe Servico
        Servico servico1 = new Servico("Impetrar mandado Judicial");
        System.out.println("Serviço" + servico1);
        
        //Utilizando a classe Convenio
        Convenio convenio1 = new Convenio("Unimed", "UnimedEmpresas", 3322-2399, 1233334, servico1);
        System.out.println("Convenio: " + convenio1);
        
        //Utilizando a classe Profissional
        
        Profissional profissional1 = new Profissional();
        profissional1.setNomecompleto("Guimaraes Rosa");
        profissional1.setEndereco("Rua com saída, n. 7");
        profissional1.setEmail("guimaraesrosa@gmail.com");
        profissional1.setCPF(00012345677);
        profissional1.setNumeroCertificado(123);
        profissional1.setTelefone(998763456);
        
        System.out.println("Profissional :" + profissional1);
        
        //Utilizando a classe Usuario
        Usuario usuario1 = new Usuario();
        usuario1.setUsuario("guigui765");
        usuario1.setEmail("guigui765@hotmail.com");
        usuario1.setSenha("guigui123456");
        
        System.out.println("Usuário : " + usuario1);
        
        //Utilizando a classe Recomendacao
        Recomendacao recomendacao1 = new Recomendacao();
        recomendacao1.setAvaliacao(10);
        recomendacao1.setDepoimentos("Profissional muito atencioso! Bom e barato");
        System.out.println("Recomendação :" + recomendacao1);
        
        //Utilizando a classe pagamento
        Pagamento pagamento1 = new Pagamento("Boleto", 145.00);
        System.out.println("Pagamento :" + pagamento1);
        
        
    }
    
}
