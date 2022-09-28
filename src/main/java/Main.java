public class Main {
    public static void main(String[] args) {
        Banco santander = new Banco();
        santander.setNome("Santander");

        Cliente kleber = new Cliente();
        kleber.setNome("Kleber");

        santander.criarContaCorrente(kleber);
        santander.criarContaPoupanca(kleber);
        santander.listarContas();
    }
}
