public class Pessoa {
    private String nome;
    private int idade;
    private String rc;
    

    public Pessoa(){}
    public Pessoa(String nome, int idade, String rc) {
        this.nome = nome;
        this.idade = idade;
        this.rc = rc;
        
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getRc() {
        return rc;
    }
    public void setRc(String rc) {
        this.rc = rc;
    }
    
    @Override
    public String toString() {
        return "FUNCIONÁRIO\nNome: " + nome + "\nIdade: " + idade + "\nRegistro do clube: " + rc;
    }
    
}
