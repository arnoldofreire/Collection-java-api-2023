import main.java.list.Ordenacao.Pessoa;

import java.util.Comparator;

public class ComparatorPorAltura implements Comparator<Pessoa> {
    private Pessoa p1;
    private Pessoa p2;

    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        this.p1 = p1;
        this.p2 = p2;
        return Double.compare(p1.getAltura(), p2.getAltura());
    }
}
