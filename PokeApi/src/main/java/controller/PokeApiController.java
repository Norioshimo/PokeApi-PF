package controller;

import dto.listpokeapi.PokeApiListDto;
import dto.listpokeapi.ResultsDto;
import dto.onepokeapi.PokeApiOneDto;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import services.PokeApiServices;

@Named("pokeApiController")
@ViewScoped
public class PokeApiController implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private PokeApiServices pokeApiService;

    private PokeApiListDto pokemonList = null;

    // <editor-fold defaultstate="collapsed" desc="Getters & Setters">
    public PokeApiListDto getPokemonList() {
        return pokemonList;
    }

    public void setPokemonList(PokeApiListDto pokemonList) {
        this.pokemonList = pokemonList;
    }

    // </editor-fold>
    @PostConstruct
    public void init() {
        System.out.println("Iniciar el pokeApiController");
        try {
            pokemonList = pokeApiService.findPokemon(151, 0);
            System.out.println("Cantidad de pokemon: " + pokemonList.getResults().size());
            int conteo = 0;
            for (ResultsDto r : pokemonList.getResults()) {
                String nroPokemon = r.getUrl().split("/")[r.getUrl().split("/").length - 1];
                System.out.println((++conteo) + "/" + pokemonList.getResults().size() + " | " + r.getName() + " | " + r.getUrl() + " | " + nroPokemon);
                String urlImagen = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/" + nroPokemon + ".png";
                System.out.println("UrlImagen: " + urlImagen);
                r.setPokeImagen(urlImagen);
                r.setNroPokemon(nroPokemon);
            }

        } catch (Exception ex) {
            System.out.println("Error al recuperar lista de pokemon. " + ex);
            ex.printStackTrace();
        }
    }
//    public static void main(String[] args) {
//        System.out.println("PokeApi ejecutar");
//
//        PokeApiServices p = new PokeApiServices("https://pokeapi.co/api");
//        try {
//            PokeApiListDto paListDto = p.findPokemon(10, 0);
//
//            System.out.println("Cantidad de pokemon: " + paListDto.getCount());
//
////            PokeApiOneDto paOneDto = p.findPokemon("1");
////            System.out.println("Nombre: " + paOneDto.getName());
//
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//        
//        System.exit(0);//Borrar esta linea
//    }
}
