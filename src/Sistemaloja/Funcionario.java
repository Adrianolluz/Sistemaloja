

package Sistemaloja;

public class Funcionario {//classe abstrata não pode ser instancianda
    
    private String nome;
    private String NumeroRg ;
    private int idade;
    private String telefone;
    private String endereco;
   
   // public void AtendimentoCliente();

    public Funcionario() {
    }
    
    

    public Funcionario(String nome, String NumeroRg, int idade, String telefone, String endereco) {
        this.nome = nome;
        this.NumeroRg = NumeroRg;
        this.idade = idade;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroRg() {
        return NumeroRg;
    }

    public void setNumeroRg(String NumeroRg) {
        this.NumeroRg = NumeroRg;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
     
  

 

    @Override
    public String toString() {
        return "Funcionario{" + "nome = " + nome + ", telefone = " + telefone + ", endereco = " 
                + endereco + ", idade = " + idade + ", NumeroRg = " + NumeroRg + '}';
    }

        
    }
        
    

