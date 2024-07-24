package main.java.set.OperacoesBasicas;

public class Convidado {
    // Atributos
    private int codigoConvite;

    // Construtor
    public Convidado(String nome, int codigoConvite) {
        this.codigoConvite = codigoConvite;
    }

    // Getter para o código do convite
    public int getCodigoConvite() {
        return codigoConvite;
    }

    public String to; String Convidado(String nome, int codigoConvite) {
        this.codigoConvite = codigoConvite;
        String s = "Convidado{" +
                "nome='" + nome + '\'' +
                ", codigoConvite=" + codigoConvite +
                '}';
        return s;
    }
}
