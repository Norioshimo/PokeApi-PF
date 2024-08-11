package dto.listpokeapi;

import java.io.Serializable;

public class ResultsDto implements Serializable {

    private String name;
    private String url;

    private String pokeImagen;
    private String nroPokemon;

    public String getPokeImagen() {
        return pokeImagen;
    }

    public void setPokeImagen(String pokeImagen) {
        this.pokeImagen = pokeImagen;
    }

    public String getNroPokemon() {
        return nroPokemon;
    }

    public void setNroPokemon(String nroPokemon) {
        this.nroPokemon = nroPokemon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
