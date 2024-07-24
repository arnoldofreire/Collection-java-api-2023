package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    public final Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for (Convidado e : convidadoSet) {
            if (codigoConvite == e.getCodigoConvite()) {
                convidadoParaRemover = e;
                break;
            }
        }
        if (convidadoParaRemover != null) {
            convidadoSet.remove(convidadoParaRemover);
        }
    }

    public int contarConvidados() {
        return convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do Set de Convidados");

        conjuntoConvidados.adicionarConvidado("Convidado1", 1234);
        conjuntoConvidados.adicionarConvidado("Convidado2", 1235);
        conjuntoConvidados.adicionarConvidado("Convidado3", 1236);
        conjuntoConvidados.adicionarConvidado("Convidado4", 1237);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do Set de Convidados");

        conjuntoConvidados.removerConvidadoPorCodigoConvite(1234);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do Set de Convidados");

        conjuntoConvidados.exibirConvidados();
    }
}
