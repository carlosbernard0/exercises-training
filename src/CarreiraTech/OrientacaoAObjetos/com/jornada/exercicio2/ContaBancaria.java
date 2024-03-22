package CarreiraTech.OrientacaoAObjetos.com.jornada.exercicio2;

public class ContaBancaria implements Despositavel,Sacavel {
    private Integer numeroDaConta;
    private String nomeTitular;
    private Integer saldo;



    public Integer getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(Integer numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public Integer getSaldo() {
        return saldo;
    }

    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "numeroDaConta=" + numeroDaConta +
                ", nomeTitular='" + nomeTitular + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    @Override
    public Integer depositar(Integer valorDoDeposito) {
        return saldo += valorDoDeposito;
    }

    @Override
    public Integer sacar(Integer valorDoSaque) {
        return saldo -= valorDoSaque;
    }
}
