package CarreiraTech.OrientacaoAObjetos;
//Crie uma classe chamada "Funcionário" que possua atributos como nome e salário, e um método chamado "calcularSalário"
// que retorne o salário total e receba o bônus do funcionario e o desconto do salário em porcentagem. Em seguida, crie um objeto chamado "gerente"
// e outro "desenvolvedor"". O objeto gerente deve chamar o método calcularSalario passando o bônus de 10% com um bônus ao salário total
// e o desconto de 15%, enquanto a classe desenvolvedor não deve ter bonificação e o desconto é de 10%
public class ex3 {
    public static void main(String[] args) {
        FuncionarioEx3 gerente = new FuncionarioEx3("Paulo", 10000);
        FuncionarioEx3 desenvolvedor = new FuncionarioEx3("Marcos", 1000);

        System.out.println(gerente.calcularSalario(0.1,0.15));
        System.out.println(desenvolvedor.calcularSalario(0,0.1));

    }
}
