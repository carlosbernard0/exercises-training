package CarreiraTech.OrientacaoAObjetos.com.jornada.exercicio1;

public class Retangulo {
    private Double altura;
    private Double largura;

    public Double calcularPerimetroRetangulo(){
        return (this.largura+this.altura)*2;
    }

    public Double calcularAreaRetangulo(){
        return this.largura*this.altura;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Retangulo{" +
                "altura=" + altura +
                ", largura=" + largura +
                '}';
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }
}
