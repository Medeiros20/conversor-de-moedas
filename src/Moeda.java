import java.util.Map;

public class Moeda {
    private String base_code;
    private Map<String, Double> conversion_rates;

    public String getBaseCode() {
        return base_code;
    }

    public double getTaxa(String destino) {
        return conversion_rates.get(destino);
    }

    @Override
    public String toString() {
        return "Moeda base: " + base_code + " | Conversões disponíveis: " + conversion_rates.keySet();
    }
}
