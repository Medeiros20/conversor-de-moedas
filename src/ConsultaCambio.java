import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaCambio {

    private static final String URL_BASE = "https://v6.exchangerate-api.com/v6/4c742e0a0b892a87e01b187b/latest/";

    public Moeda buscaCambio(String from) {
        URI uri = URI.create(URL_BASE + from);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(uri)
                .build();

        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson(response.body(), Moeda.class);

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Erro ao obter taxa de câmbio: " + e.getMessage());
        }
    }
}
