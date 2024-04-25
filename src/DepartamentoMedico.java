public class DepartamentoMedico  extends Pessoa{
    
    int tempContrato;
    float salario;
    public DepartamentoMedico() {}
    public DepartamentoMedico(String nome, int idade, String cargo, int tempContrato,
            float salario) {
        super(nome, idade, cargo);
        this.tempContrato = tempContrato;
        this.salario = salario;
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
        
        return super.toString() + "\nTempo de contrato(anos): " + tempContrato + "\nSalario: R$" + salario;
    }
}
