package CarreiraTech.OrientacaoAObjetos.com.jornada.exercicio2;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.setNumeroDaConta(2003);
        conta.setSaldo(1000);
        conta.setNomeTitular("Carlos");

        conta.depositar(200);
        conta.sacar(100);
        System.out.println(conta);
        System.out.println(conta.getSaldo());
    }
}
