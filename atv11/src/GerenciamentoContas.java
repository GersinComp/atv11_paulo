// Trabalhar com arrays
import java.util.ArrayList;

public class GerenciamentoContas {
//  Atributo privado para armazenar todas as contas criados
    private ArrayList<ContaBancaria> contas = new ArrayList<>();

//  método para adicionar contas
    public void addConta(ContaBancaria conta) {
        contas.add(conta);
    }

    @Override
    public String toString() {
        return "GerenciamentoContas{" +
                "contas=" + contas +
                '}';
    }
}
