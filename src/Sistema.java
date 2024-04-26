public class Sistema {
    

private static void Verificar1(){
    int newop;
    String nome;
    int idade;
    String rc;
    int tempContrato;
    float salario;
    String posicao;
          do {
            System.out.println("CADASTRANDO FUNCIONÁRIOS");
            System.out.println("1) Atleta");
            System.out.println("2) Funcionário");
            System.out.println("3) Comissão técnica");
            System.out.println("4) Departamento médico");
            System.out.println("0) Voltar ao menu principal");
            System.out.print("Selecione quem deseja cadastrar: ");
            newop = Console.LerInt();

            switch (newop) {
                case 1:

                Cadastro atleta = new Cadastro();
                    System.out.println("\nNovo atleta:");
                    System.out.print("Registrar nome: ");
                    nome = Console.LerString();
                    System.out.print("Registrar idade: ");
                    idade = Console.LerInt();
                    System.out.print("Registro do clube (ex: 000.000-00): ");
                    rc = Console.LerString();
                    System.out.print("Tempo de contrato(meses): ");
                    tempContrato = Console.LerInt();
                    System.out.print("Salário: R$");
                    salario = Console.LerFloat();
                    System.out.print("Posição em que atua: ");
                    posicao = Console.LerString();

                    Atleta a = new Atleta(nome, idade, rc, posicao, tempContrato, salario);
                    atleta.cadastrar(a);

                    System.out.println("Atleta cadastrado!");
                    break;
                case 2:

                Cadastro funcionario = new Cadastro();
                    System.out.println("\nNovo funcionario:");
                    System.out.print("Registrar nome: ");
                    nome = Console.LerString();
                    System.out.print("Registrar idade: ");
                    idade = Console.LerInt();
                    System.out.print("Registro do clube (ex: 000.000-00): ");
                    rc = Console.LerString();
                    System.out.print("Tempo de contrato(meses): ");
                    tempContrato = Console.LerInt();
                    System.out.print("Salário: R$");
                    salario = Console.LerFloat();
                    System.out.print("Cargo que ocupa: ");
                    String cargo = Console.LerString();

                    FuncionariosGeral f = new FuncionariosGeral(nome, idade, rc, tempContrato, salario, cargo);
                    funcionario.cadastrar(f);

                    System.out.println("Funcionário cadastrado!");
                    break;
                case 3:
                Cadastro comissao = new Cadastro();
                    System.out.println("\nNovo integrante de comissão técnica:");
                    System.out.print("Registrar nome: ");
                    nome = Console.LerString();
                    System.out.print("Registrar idade: ");
                    idade = Console.LerInt();
                    System.out.print("Registro do clube (ex: 000.000-00): ");
                    rc = Console.LerString();
                    System.out.print("Tempo de contrato(meses): ");
                    tempContrato = Console.LerInt();
                    System.out.print("Salário: R$");
                    salario = Console.LerFloat();
                    System.out.print("Cargo que ocupa: ");
                    cargo = Console.LerString();

                    ComissaoTecnica c = new ComissaoTecnica(nome, idade, rc, tempContrato, salario, cargo);
                    comissao.cadastrar(c);

                    System.out.println("Integrante de comissão técnica cadastrado!");
                    break;
                case 4: 
                Cadastro dm = new Cadastro();
                    System.out.println("\nNovo integrante de departamento médico:");
                    System.out.print("Registrar nome: ");
                    nome = Console.LerString();
                    System.out.print("Registrar idade: ");
                    idade = Console.LerInt();
                    System.out.print("Registro do clube (ex: 000.000-00): ");
                    rc = Console.LerString();
                    System.out.print("Tempo de contrato(meses): ");
                    tempContrato = Console.LerInt();
                    System.out.print("Salário: R$");
                    salario = Console.LerFloat();
                    System.out.print("Cargo que ocupa: ");
                    cargo = Console.LerString();

                    DepartamentoMedico d = new DepartamentoMedico(nome, idade, rc, tempContrato, salario, cargo);
                    dm.cadastrar(d);

                    System.out.println("Integrante de departamento médico cadastrado!");
                    break;
                case 0:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Informação inválida. Tente novamente...");
                    break;
                }} while (newop != 0);  
            
}
private static void Menu(){
    System.out.println("---SISTEMA DE GERENCIAMENTO CLUBE---");
    System.out.println("1) Cadastro de funcionário");
    System.out.println("2) Procurar funcionário");
    System.out.println("3) Listar todos os funcionários");
    System.out.println("4) Excluir funcionário");
    System.out.println("0) Sair do sistema");
    System.out.print("");
}

private static void Verificar(int op){

    String nome;
    int idade;
    String rc;
    int tempContrato;
    float salario;
    String posicao;

    switch (op) {
        case 1:
            Verificar1();
            break;
        case 2:
            
            break;
        case 3:
            
            break;
        case 4:
            
            break;           
        case 0:
            System.out.println("O sistema foi finalizado!");
            break;
        
        default:
            System.out.println("Opção inválida. Tente novamente...");
            break;
    }













}

public static void executar(){
    int op;
    do {
        Menu();
        op = Console.LerInt();
        Verificar(op);
    } while (op != 0);
}

}

