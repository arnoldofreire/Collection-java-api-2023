import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> tarefas;

    // Construtor para inicializar a lista de tarefas
    public ListaTarefas() {
        this.tarefas = new ArrayList<>();
    }

    // Método para adicionar uma nova tarefa à lista
    public void adicionarTarefa(String descricao) {
        Tarefa tarefa = new Tarefa(descricao);
        tarefas.add(tarefa);
        System.out.println("Tarefa adicionada: " + descricao);
    }

    // Método para remover uma tarefa da lista com base na descrição
    public void removerTarefa(String descricao) {
        Iterator<Tarefa> iterator = tarefas.iterator();
        while (iterator.hasNext()) {
            Tarefa tarefa = iterator.next();
            if (tarefa.getDescricao().equals(descricao)) {
                iterator.remove();
                System.out.println("Tarefa removida: " + descricao);
                return;
            }
        }
        System.out.println("Tarefa não encontrada: " + descricao);
    }

    // Método para obter o número total de tarefas na lista
    public int obterNumeroTotalTarefas() {
        return tarefas.size();
    }

    // Método para obter a descrição de todas as tarefas na lista
    public List<String> obterDescricoesTarefas() {
        List<String> descricoes = new ArrayList<>();
        for (Tarefa tarefa : tarefas) {
            descricoes.add(tarefa.getDescricao());
        }
        return descricoes;
    }

    // Método main para testar a funcionalidade
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        // Adicionar tarefas à lista
        listaTarefas.adicionarTarefa("Comprar leite");
        listaTarefas.adicionarTarefa("Enviar e-mail");
        listaTarefas.adicionarTarefa("Estudar para a prova");

        // Exibir número total de tarefas
        System.out.println("Número total de tarefas: " + listaTarefas.obterNumeroTotalTarefas());

        // Exibir descrições de todas as tarefas
        System.out.println("Descrições das tarefas: " + listaTarefas.obterDescricoesTarefas());

        // Remover uma tarefa da lista
        listaTarefas.removerTarefa("Enviar e-mail");

        // Exibir número total de tarefas atualizado
        System.out.println("Número total de tarefas: " + listaTarefas.obterNumeroTotalTarefas());

        // Exibir descrições das tarefas atualizadas
        System.out.println("Descrições das tarefas: " + listaTarefas.obterDescricoesTarefas());
    }
}
