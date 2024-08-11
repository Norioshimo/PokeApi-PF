package services;

import dto.listpokeapi.PokeApiListDto;
import com.google.gson.reflect.TypeToken;
import dto.onepokeapi.PokeApiOneDto;
import java.io.IOException;
import java.lang.reflect.Type;
import javax.faces.view.ViewScoped;

@ViewScoped
public class PokeApiServices extends AbstractServices<PokeApiListDto> {

    private String url = "";

    public PokeApiServices() {
        this.url = "https://pokeapi.co/api";
    }

    public PokeApiServices(String url) {
        super();
        this.url = url;
    }

    public PokeApiListDto findPokemon(Integer limit, Integer offset) throws Exception {

        String url = this.url + "/v2/pokemon?limit=" + limit + "&offset=" + offset;
        PokeApiListDto paDto = new PokeApiListDto();
        try {
            this.httpGet(url);

            if (responsecode == 200) {
                Type responseType = TypeToken.getParameterized(PokeApiListDto.class).getType();
                paDto = gson.fromJson(payload, responseType);
                System.out.println("Terminado de parsear");
            } else if (responsecode == 404) {
                String m = MENSAJE_404.replace("@1", url);
                throw new IOException(m);
            } else if (responsecode == 400) {

                String m = MENSAJE_400.replace("@1", "Error 404");
                throw new IOException(m);
            } else {
                String m = MENSAJE_XXX.replace("@1", responsecode + "");
                throw new IOException(m);
            }

        } catch (Exception ex) {
            System.out.println("Error al parsear resultado");
            ex.printStackTrace();
            throw new Exception(ex.getMessage());
        }
        return paDto;
    }

    public PokeApiOneDto findPokemon(String id) throws Exception {

        String url = this.url + "/v2/pokemon/" + id;
        PokeApiOneDto paDto = new PokeApiOneDto();
        try {
            this.httpGet(url);

            if (responsecode == 200) {
                Type responseType = TypeToken.getParameterized(PokeApiOneDto.class).getType();
                paDto = gson.fromJson(payload, responseType);
                System.out.println("Terminado de parsear");
            } else if (responsecode == 404) {
                String m = MENSAJE_404.replace("@1", url);
                throw new IOException(m);
            } else if (responsecode == 400) {

                String m = MENSAJE_400.replace("@1", "Error 404");
                throw new IOException(m);
            } else {
                String m = MENSAJE_XXX.replace("@1", responsecode + "");
                throw new IOException(m);
            }

        } catch (Exception ex) {
            System.out.println("Error al parsear resultado");
            ex.printStackTrace();
            throw new Exception(ex.getMessage());
        }
        return paDto;
    }

}
