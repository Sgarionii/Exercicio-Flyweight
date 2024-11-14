import java.util.HashMap;
import java.util.Map;

public class CorFactory {
    private Map<String, Cor> cores = new HashMap<>();

    public Cor getCor(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome da cor não pode ser nulo ou vazio.");
        }
        if (!cores.containsKey(nome)) {
            cores.put(nome, new Cor(nome));
        }
        return cores.get(nome);
    }
}
