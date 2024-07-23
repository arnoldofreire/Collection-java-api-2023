import java.util.ArrayList;
import java.util.List;

class SomaNumeros {
    private List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }

    public int calcularSoma() {
        return numeros.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

    public int encontrarMaiorNumero() {
        return numeros.stream()
                .mapToInt(Integer::intValue)
                .max()
                .orElseThrow(() -> new IllegalStateException("Lista está vazia"));
    }

    public int encontrarMenorNumero() {
        return numeros.stream()
                .mapToInt(Integer::intValue)
                .min()
                .orElseThrow(() -> new IllegalStateException("Lista está vazia"));
    }

    public List<Integer> exibirNumeros() {
        return new ArrayList<>(numeros);
    }
}
