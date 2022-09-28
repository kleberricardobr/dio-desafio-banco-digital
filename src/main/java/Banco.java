import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Getter
@Setter
public class Banco {
    private String nome;
    private List<Conta> contas;

    public Banco() {
        contas = new ArrayList<Conta>();
    }

    public Conta criarContaCorrente(Cliente cliente) {
        Conta conta = new ContaCorrente(cliente);

        contas.add(conta);

        return conta;
    }

    public Conta criarContaPoupanca(Cliente cliente) {
        Conta conta = new ContaPoupanca(cliente);
        contas.add(conta);

        return conta;
    }

    public void listarContas() {

        for (Conta itConta: contas) {
            System.out.println("=====================================");
            System.out.println( String.format("Conta Numero: %d", itConta.getNumero()));
            System.out.println( String.format("Cliente: %s", itConta.getCliente().getNome()));
            System.out.println("=====================================");
        }

    }
}
