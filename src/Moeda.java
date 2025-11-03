import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class Moeda {
    @SerializedName("base_code")
    private String moedaBase;

    @SerializedName("conversion_rates")
    private Map<String, Double> taxasConversao;

    public String getBaseCode() {
        return moedaBase;
    }

    public double getTaxa(String destino) {
        return taxasConversao.get(destino);
    }

    @Override
    public String toString() {
        return "Moeda base: " + moedaBase + " | Conversões disponíveis: " + taxasConversao.keySet();
    }
}
