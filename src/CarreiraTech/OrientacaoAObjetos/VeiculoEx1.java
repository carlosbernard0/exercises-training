package CarreiraTech.OrientacaoAObjetos;

public class VeiculoEx1 {
    private String nome, cor;
    private static int numeroDeRodas,  velocidade;

    public VeiculoEx1(String n, String cor, int numeroDeRodas, int velocidade) {
        this.nome = n;
        this.cor = cor;
        this.numeroDeRodas = numeroDeRodas;
        this.velocidade = velocidade;

    }

    public void mover(){
        velocidade += 50;
    }

    public void frear(){
        velocidade-= 25;
    }

    public void imprimirDetalhes(){
        System.out.println("Nome: "+nome);
        System.out.println("Cor: "+cor);
        System.out.println("Numero de rodas: "+numeroDeRodas);
        System.out.println("Velocidade: "+velocidade+" Km/h");
    }

}
