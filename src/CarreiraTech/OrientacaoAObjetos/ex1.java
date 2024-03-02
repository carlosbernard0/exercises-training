package CarreiraTech.OrientacaoAObjetos;
//Crie uma classe base chamada "Veículo" que possua atributos: nome, cor, número de rodas, e velocidade.
//Crie também um método chamado mover e outro chamado frear, sendo que o método mover aumenta 50km/h a velocidade,
// já o metodo frear diminui 25km/h a velocidade. Criei também outro método que imprima todos os atributos da classe.
// Crie ao menos 2 objetos e teste os métodos.
public class ex1 {
    public static void main(String[] args) {
        VeiculoEx1 veiculo = new VeiculoEx1("Ômega", "Red", 4, 100);
        veiculo.frear();
        veiculo.imprimirDetalhes();

    }
}
