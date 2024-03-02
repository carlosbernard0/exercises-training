package CarreiraTech.OrientacaoAObjetos;

public class PessoaEx7 {
    String nome;
    int idade;
    double altura;

    public PessoaEx7(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "PessoaEx7{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                '}';
    }
}
