package CarreiraTech.OrientacaoAObjetos;
//Crie uma classe base chamada "Animal" que possua atributos como nome, idade e som (o som que ele emite),
// por fim crie um método chamado "emitirSom" que imprima um som genérico. Em seguida, crie um objeto "cachorro", "gato" e "pássaro",
// que são do tipo Animal. Cada objeto tem um som diferente, atribua os sons aos objetos e chame o método emitirSom para ver qual som cada objeto faz.
public class ex2 {

    public static void main(String[] args) {
        AnimalEx2 cachorro = new AnimalEx2();
        cachorro.setNome("Lilica");
        cachorro.setIdade(3);
        cachorro.setSom("Au-au");
        cachorro.emitirSom();
    }
}
