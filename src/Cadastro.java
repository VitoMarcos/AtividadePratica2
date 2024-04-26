import java.util.ArrayList;
import java.util.List;

public class Cadastro {
    
    private static List<Pessoa> listaColaboradores;

    public Cadastro(){
        listaColaboradores = new ArrayList<>();
    }

    public  void cadastrar(Pessoa p){
        listaColaboradores.add(p);
    }
    public  void cadastrar(Atleta a){
        listaColaboradores.add(a);
    }
    public  void cadastrar(DepartamentoMedico d){
        listaColaboradores.add(d);
    }
    public  void cadastrar(FuncionariosGeral f){
        listaColaboradores.add(f);
    }
    public  void cadastrar(ComissaoTecnica c){
        listaColaboradores.add(c);
    }

    public  List<Pessoa> getListaColaboradores() {
        return listaColaboradores;
    }

    public void procurar(String rc){

        for (Pessoa i : listaColaboradores) {
            if (i.getRc().equals(rc)) {
                System.out.println("Funcionário encontrado!\n" + i.toString());
                return;
            }
            System.out.println(rc + " não encontrado.");
            return;
        }
    }
    public void listarTodos(){

        if (listaColaboradores.size() == 0) {
            System.out.println("Ainda não há funcionários cadastrados");
            return;
        }
        for (Pessoa p : listaColaboradores) {
            System.out.println(p.toString());
        }
    }
    public void exlcuirColaborador(List<String> lista, String nome) {
    
        if (lista.contains(nome)) {
            
            lista.remove(nome);
            System.out.println("Funcionario '" + nome + "' removido com sucesso.");
        } else {
            System.out.println("'" + nome + "' não está presente na lista.");
        }
    }
    public void excluirTudo(){
        listaColaboradores.removeAll(listaColaboradores);
    }
}
