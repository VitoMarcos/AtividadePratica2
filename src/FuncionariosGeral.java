public class FuncionariosGeral extends Pessoa {

    private int tempContrato;
    private float salario;
    private String cargo;
    public FuncionariosGeral() {}

    public FuncionariosGeral(String nome, int idade, String rc, int tempContrato, float salario, String cargo) {

        super(nome, idade, rc);
        this.tempContrato = tempContrato;
        this.salario = salario;
        this.cargo = cargo;

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
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {

        return super.toString() + "\nTempo de Contrato(meses): " + tempContrato +
        "\nSalário: R$" + salario + "\nCargo: " + cargo;

    }

    
}