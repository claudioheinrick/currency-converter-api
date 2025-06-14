import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import static java.lang.Double.parseDouble;

public class CambioBusca {

    public double taxa;

    public CambioBusca(String moedaBase, String moedaAlvo, double valor) throws IOException {
        // Setting URL
        String link = "https://v6.exchangerate-api.com/v6/105f5eff3a4c417210842348/pair/" + moedaBase + "/" + moedaAlvo + "/" + valor;

        // Making Request
        URL url = new URL(link);
        HttpURLConnection request = (HttpURLConnection) url.openConnection();
        request.connect();

        // Convert to JSON
        JsonParser jp = new JsonParser();
        JsonElement root = jp.parse(new InputStreamReader(request.getInputStream()));
        JsonObject jsonobj = root.getAsJsonObject();



        String taxaDeConversao = jsonobj.get("conversion_rate").getAsString();
        Double retornoDaConversao = converterValor(valor, taxaDeConversao);
        this.taxa = parseDouble(taxaDeConversao);
        String convertido = jsonobj.get("conversion_result").getAsString();
        System.out.println("valor convertido de " + moedaBase + " para " + moedaAlvo + " é " + retornoDaConversao);



    }



    public Double converterValor(double valor, String taxa){
        Double resultadoDeuCerto = valor * parseDouble(taxa);
        return resultadoDeuCerto;
    }


}
