
public class Sistema {

    static Cadastro atleta = new Cadastro();
    static Cadastro funcionario = new Cadastro();
    static Cadastro comissao = new Cadastro();
    static Cadastro dm = new Cadastro();
    static Cadastro Geral = new Cadastro();

    private static void Verificar1() {
        int newop;
        String nome;
        int idade;
        String rc;
        int tempContrato;
        float salario;
        String posicao;
        String cargo;

        do {
            System.out.println("\nCADASTRANDO FUNCIONÁRIOS");
            System.out.println("1) Atleta");
            System.out.println("2) Funcionário");
            System.out.println("3) Comissão técnica");
            System.out.println("4) Departamento médico");
            System.out.println("0) Voltar ao menu principal");
            System.out.print("Selecione quem deseja cadastrar: ");
            newop = Console.LerInt();

            switch (newop) {
                case 1:

                    System.out.println("\nNovo atleta:");
                    System.out.print("Registrar nome: ");
                    nome = Console.LerString();
                    System.out.print("Registrar idade: ");
                    idade = Console.LerInt();
                    System.out.print("Registro do clube (ex: 000.000-00): ");
                    rc = Console.LerString();
                    System.out.print("Cargo: ");
                    cargo = Console.LerString();
                    System.out.print("Tempo de contrato(meses): ");
                    tempContrato = Console.LerInt();
                    System.out.print("Salário: R$");
                    salario = Console.LerFloat();
                    System.out.print("Posição em que atua: ");
                    posicao = Console.LerString();

                    Atleta a = new Atleta(nome, idade, rc, cargo, posicao, tempContrato, salario);
                    atleta.cadastrar(a);

                    System.out.println("Atleta cadastrado!");
                    break;
                case 2:

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
                    cargo = Console.LerString();

                    FuncionariosGeral f = new FuncionariosGeral(nome, idade, rc, cargo, tempContrato, salario);
                    funcionario.cadastrar(f);

                    System.out.println("Funcionário cadastrado!");
                    break;
                case 3:

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

                    ComissaoTecnica c = new ComissaoTecnica(nome, idade, rc, cargo, tempContrato, salario);
                    comissao.cadastrar(c);

                    System.out.println("Integrante de comissão técnica cadastrado!");
                    break;
                case 4:

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

                    DepartamentoMedico d = new DepartamentoMedico(nome, idade, rc, cargo, tempContrato, salario);
                    dm.cadastrar(d);

                    System.out.println("Integrante de departamento médico cadastrado!");
                    break;
                case 0:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Informação inválida. Tente novamente...");
                    break;
            }
        } while (newop != 0);

    }

    private static void Verificar2() {
        String rc;
        System.out.println("\nBUSCANDO FUNCIONÁRIO");
        System.out.print("Digite o Registro de clube(RC) da pessoa: ");
        rc = Console.LerString();
        Geral.procurar(rc);
    }

    private static void Verificar4() {
        int oppenheimer;
        String rc;
        do {

            System.out.println("\nEXCLUSÃO DE FUNCIONÁRIO");
            System.out.println("1) Excluir funcionário");
            System.out.println("2) Excluir todos!!!");
            System.out.println("0) Voltar ao menu principal");
            System.out.print("");
            oppenheimer = Console.LerInt();

            switch (oppenheimer) {
                case 1:
                    System.out.print("Digite o Registro de clube(RC) de quem deseja excluir do sistema: ");
                    rc = Console.LerString();
                    Geral.excluirColaborador(rc);
                    break;
                case 2:
                    Geral.excluirTudo();
                    break;
                case 0:
                    System.out.println("\nVoltando ao menu principal");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente...");
                    break;
            }

        } while (oppenheimer != 0);
    }

    private static void Menu() {
        System.out.println("\n\n---SISTEMA DE GERENCIAMENTO CLUBE---");
        System.out.println("1) Cadastro");
        System.out.println("2) Busca");
        System.out.println("3) Listar todos");
        System.out.println("4) Excluir");
        System.out.println("0) Sair do sistema");
        System.out.print("");
    }

    private static void Verificar(int op) {

        switch (op) {
            case 1:
                Verificar1();
                break;
            case 2:
                Verificar2();
                break;
            case 3:
                System.out.println("\nLISTAGEM DE TODOS OS FUNCIONARIOS DO CLUBE");
                Geral.listarTodos();
                break;
            case 4:
                Verificar4();
                break;
            case 0:
                System.out.println("\nO sistema foi finalizado!");
                break;

            default:
                System.out.println("\nOpção inválida. Tente novamente...");
                break;
        }

    }

    public static void executar() {
        int op;
        do {
            Menu();
            op = Console.LerInt();
            Verificar(op);
        } while (op != 0);
    }

}
