public class CategoriaDeBase extends Pessoa{
    String posicao;
    int tempContrato;
    float salario;
    public CategoriaDeBase() {}
    public CategoriaDeBase(String nome, int idade, String cargo, String posicao, int tempContrato, float salario) {
        super(nome, idade, cargo);
        this.posicao = posicao;
        this.tempContrato = tempContrato;
        this.salario = salario;
    }
    public String getPosicao() {
        return posicao;
    }
    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }
    public int getTempContrato() {
        return tempContrato;
    }
    public void setTempContrato(int tempContrato) {
        this.tempContrato = tempContrato;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {

        return super.toString() + "\nPosição: " + posicao + "\nTempo de contrato(anos): " + "Salario: R$" + salario;
    }
}