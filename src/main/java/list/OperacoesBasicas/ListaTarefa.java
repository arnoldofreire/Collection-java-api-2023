package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class ListaTarefa {
    // Atributo
    private List<Tarefa> tarefaList;

    // Construtor
    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    // Método para adicionar tarefa
    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    // Método para remover tarefa
    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    // Método para obter o número total de tarefas
    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    // Método para obter descrições das tarefas
    public void obterDescricoesTarefas() {
        for (Tarefa t : tarefaList) {
            System.out.println(t.getDescricao());
        }
    }

    // Método para remover tarefas duplicadas
    public void removerTarefasDuplicadas() {
        Set<String> descricaoSet = new HashSet<>();
        List<Tarefa> tarefasUnicas = new ArrayList<>();

        for (Tarefa t : tarefaList) {
            if (descricaoSet.add(t.getDescricao())) {
                tarefasUnicas.add(t);
            }
        }

        tarefaList = tarefasUnicas;
    }

    public static void main(String[] args) {
        ListaTarefa lista = new ListaTarefa();
        lista.adicionarTarefa("Tarefa1");
        lista.adicionarTarefa("Tarefa1");
        lista.adicionarTarefa("Tarefa2");

        System.out.println("Tarefas antes de remover duplicadas:");
        lista.obterDescricoesTarefas();
        System.out.println("Total de tarefas: " + lista.obterNumeroTotalTarefas());

        lista.removerTarefasDuplicadas();
        System.out.println("Tarefas depois de remover duplicadas:");
        lista.obterDescricoesTarefas();
        System.out.println("Total de tarefas: " + lista.obterNumeroTotalTarefas());
    }
}

class Tarefa {
    private String descricao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @OverrideSHA256:bGfAhMlwKmKIERCdQWxX1+qk85Es7e4eiKSE5onVrs8
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tarefa tarefa = (Tarefa) o;
        return Objects.equals(descricao, tarefa.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(descricao);
    }
}
