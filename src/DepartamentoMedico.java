public class DepartamentoMedico  extends Pessoa{
    
    private int tempContrato;
    private float salario;
    private String cargo;

    public DepartamentoMedico() {}
    public DepartamentoMedico(String nome, int idade, String rc, int tempContrato,
            float salario, String cargo) {
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
        
        return super.toString() + "\nTempo de contrato(meses): " + tempContrato + "\nSalario: R$" + salario + "\nCargo: " + cargo;
    }
    
}
