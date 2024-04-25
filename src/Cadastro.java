import java.util.ArrayList;
import java.util.List;

public class Cadastro {
    
    private static List<Pessoa> listaColaboradores;

    public Cadastro(){
        listaColaboradores = new ArrayList<>();
    }

    public static void cadastrar(Pessoa p){
        listaColaboradores.add(p);
    }

    public static List<Pessoa> getListaColaboradores() {
        return listaColaboradores;
    }

    public static void procurar(String nome){

        for (Pessoa i : listaColaboradores) {
            if (i.getNome().equals(nome)) {
                System.out.println("Colaborador encontrado!\n" + i.toString());
                return;
            }
            System.out.println(nome + " não encontrado.");
            return;
        }
    }
    public static void listarTodos(){

        if (listaColaboradores.size() == 0) {
            System.out.println("Ainda não há funcionários cadastrados");
            return;
        }
        for (Pessoa p : listaColaboradores) {
            System.out.println(p.toString());
        }
    }
    public static void exlcuirColaborador(List<String> lista, String nome) {
    
        if (lista.contains(nome)) {
            
            lista.remove(nome);
            System.out.println("Funcionario '" + nome + "' removido com sucesso.");
        } else {
            System.out.println("'" + nome + "' não está presente na lista.");
        }
    }
    public static void excluirTudo(){
        listaColaboradores.removeAll(listaColaboradores);
    }
}
