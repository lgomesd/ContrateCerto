


/**
 *
 * @author Charliston Rodrigo
 */
public class Convenio {
    
    private  String nome;
    private  String nomeConvenio;
    private  int telefone;
    private int numeroCarteira;
    Convenio prox;
    
     public Convenio(String nome, String nomeConvenio, int telefone, int numeroCarteira){
    
         this.nome = nome;
         this.nomeConvenio = nomeConvenio;        
         this.telefone = telefone;
         this.numeroCarteira = numeroCarteira;
    }
     
    public Convenio(){   
        
    }
    
    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }
   
    
    public int getTelefone() {
        return telefone;
    }

    
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    
    public int getNumeroCarteira() {
        return numeroCarteira;
    }

    
    public void setNumeroCarteira(int numeroCarteira) {
        this.numeroCarteira = numeroCarteira;
    }
    
    public String getNomeConvenio() {
        return nomeConvenio;
    }

    public void setNomeConvenio(String nomeConvenio) {
        this.nomeConvenio = nomeConvenio;
    }
}
