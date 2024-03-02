package CarreiraTech.OrientacaoAObjetos;

public class FuncionarioEx3 {
    private String nome;
    private double salario;

    public double calcularSalario(double bonus, double desconto){
        salario += (salario*bonus) - (salario*desconto);
        return salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public FuncionarioEx3(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
}
