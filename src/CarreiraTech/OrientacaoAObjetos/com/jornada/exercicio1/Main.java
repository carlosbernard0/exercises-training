package CarreiraTech.OrientacaoAObjetos.com.jornada.exercicio1;

public class Main {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();

        retangulo.setLargura(10.0);
        retangulo.setAltura(10.0);

        System.out.println(retangulo);

        System.out.println(retangulo.calcularPerimetroRetangulo());
        System.out.println(retangulo.calcularAreaRetangulo());

    }
}
