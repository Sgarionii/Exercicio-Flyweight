import java.util.ArrayList;
import java.util.List;

public class FormaManager {
    private List<Forma> formas;
    private CorFactory corFactory;

    public FormaManager() {
        formas = new ArrayList<>();
        corFactory = new CorFactory();
    }

    public void addForma(String nomeCor, String posicao, int tamanho) {
        if (nomeCor == null || nomeCor.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome da cor não pode ser vazio ou nulo.");
        }
        if (posicao == null || posicao.trim().isEmpty()) {
            throw new IllegalArgumentException("Posição não pode ser vazia ou nula.");
        }
        if (tamanho <= 0) {
            throw new IllegalArgumentException("O tamanho deve ser maior que zero.");
        }

        Cor cor = corFactory.getCor(nomeCor);
        Forma forma = new Forma(cor, posicao, tamanho);
        formas.add(forma);
    }

    public void apresentar() {
        for (Forma forma : formas) {
            System.out.println(forma);
        }
    }
}
