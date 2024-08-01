package services;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class AbstractServices<T> implements  Serializable{

    protected final String MENSAJE_404 = "No existe el servicio @1";
    protected final String MENSAJE_400 = "Error al consumir el servicio, @1";
    protected final String MENSAJE_XXX = "Error inesperado, @1";

    protected Response response;

    protected String payload = null;
    protected Integer responsecode = null;
    protected Gson gson = null;

    protected AbstractServices() {
        gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
    }

    protected void httpGet(String url) throws Exception {
        if (url == null) {
            throw new IOException("URL NULO");
        }
        System.out.println("HTTP GET URL: " + url);

        payload = null;
        responsecode = null;
        response = null;
        OkHttpClient client = new OkHttpClient.Builder()
                .connectTimeout(20, TimeUnit.SECONDS)
                .writeTimeout(20, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                .build();
        Request request = new Request.Builder().url(url)
                .addHeader("Content-Type", "application/json")
                .build();

        response = client.newCall(request).execute();

        responsecode = response.code();
        System.out.println("Reponse code " + responsecode);
        payload = response.body().string();
        System.out.println("Payload: " + payload);

        response.close();

    }

}
