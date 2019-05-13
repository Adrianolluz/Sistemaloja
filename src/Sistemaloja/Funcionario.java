

package Sistemaloja;

public class Funcionario {//classe abstrata não pode ser instancianda
    
    private String nome;
    private String numeroRg ;
    private String idade;
    private String contato;
    private String endereco;
    private String profissao;
   
   // public void AtendimentoCliente();

    public Funcionario() {
    }
    
    

    public Funcionario(String nome, String numeroRg, String idade, String contato, String endereco,String profissao) {
        this.nome = nome;
        this.numeroRg = numeroRg;
        this.idade = idade;
        this.contato = contato;
        this.endereco = endereco;
        this.profissao = profissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroRg() {
        return numeroRg;
    }

    public void setNumeroRg(String numeroRg) {
        this.numeroRg = numeroRg;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "nome = " + nome + ", numeroRg = " + numeroRg + ", idade = " + idade + ", "
                + "contato = " + contato + ", endereco = " + endereco + ", profissao = " + profissao + '}';
    }
     
   
        
    }
        
    

