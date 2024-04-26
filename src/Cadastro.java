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
    
    public  List<Pessoa> getListaColaboradores() {
        return listaColaboradores;
    }
    


    public void procurar(String rc){

        boolean encontrado = false;
        for (Pessoa i : listaColaboradores) {
            if (i.getRc().equals(rc)) {
                System.out.println("Funcionário encontrado!\n" + i.toString());
                encontrado = true;
                return;
            }

        }

        if (!encontrado) {
            System.out.println(rc + " não encontrado.");
        }
    }
    
    public void listarTodos(){

        if (listaColaboradores.isEmpty()) {
            System.out.println("Ainda não há funcionários cadastrados");
        }else {
            for (Pessoa p : listaColaboradores) {
                System.out.println(p.toString());
            }
        }
    }

    public void excluirColaborador(String rc) {
       
        for (int i = 0; i < listaColaboradores.size(); i++) {
            Pessoa p = listaColaboradores.get(i);
            
            if (p.getRc().equals(rc)) {
                listaColaboradores.remove(i);
                System.out.println(p.toString() + " foi removido com sucesso!");
                return;
            }
        }
        System.out.println("'" + rc + "' não encontrado.");
    }
    
    public void excluirTudo(){
        listaColaboradores.removeAll(listaColaboradores);
    }
}
