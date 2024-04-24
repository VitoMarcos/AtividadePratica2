public class DepartamentoMedico  extends Pessoa{
    
    String especialidade;
    int tempContrato;
    float salario;
    public DepartamentoMedico() {}
    public DepartamentoMedico(String nome, int idade, String cargo, String especialidade, int tempContrato,
            float salario) {
        super(nome, idade, cargo);
        this.especialidade = especialidade;
        this.tempContrato = tempContrato;
        this.salario = salario;
    }
    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
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
        
        return super.toString() + "\nEspecialidade: " + especialidade + "\nTempo de contrato(anos): " + tempContrato + "\nSalario: R$" + salario;
    }
}
