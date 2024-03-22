package CarreiraTech.OrientacaoAObjetos.com.jornada.exercicio3;

public class Main {
    public static void main(String[] args) {
        Integer opcao = null;
        Esportes esportes = Esportes.FUTEBOL;

        do {
            System.out.println("Escolha uma opcao");
            System.out.println("""
                0 - sair
                1 - futebol
                2 - BASQUETE
                3 - NATACAO
                4 - JIUJITSU
                5 - VOLEI
                6 - CROSSFIT
            
            """);



            switch (opcao) {
                case 0:
                    System.exit(opcao);
                    break;
                case 1:
                    Esportes futebol = Esportes.FUTEBOL;
                    usaBola();
                    break;
                case 2:
                    Esportes basquete = Esportes.BASQUETE;
                    usaBola();
                    break;

                case 3:
                    Esportes natacao = Esportes.NATACAO;
                    naoUsaBola();
                    break;
                case 4:
                    Esportes jiujitsu = Esportes.JIUJITSU;
                    naoUsaBola();
                    break;
                case 5:
                    Esportes volei = Esportes.VOLEI;
                    usaBola();
                    break;
                case 6:
                    Esportes crossfit = Esportes.CROSSFIT;
                    naoUsaBola();
                    break;

            }

        }while (opcao != 0);
    }




    public static String usaBola(){
       return "Usa bola";
    }

    public static String naoUsaBola(){
        return "Não usa bola";
    }
}
