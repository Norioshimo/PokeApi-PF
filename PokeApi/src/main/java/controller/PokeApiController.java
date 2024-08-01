package controller;

import dto.listpokeapi.PokeApiListDto;
import java.io.Serializable;
import java.util.List; 
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
//
    private List<PokeApiListDto> listaPokemon = null;

    // <editor-fold defaultstate="collapsed" desc="Getters & Setters">
    public List<PokeApiListDto> getListaPokemon() {
        return listaPokemon;
    }

    public void setListaPokemon(List<PokeApiListDto> listaPokemon) {
        this.listaPokemon = listaPokemon;
    }

    // </editor-fold>
    
//    public static void main(String[] args) {
//        System.out.println("PokeApi ejecutar");
//
//        PokeApiServices p = new PokeApiServices("https://pokeapi.co/api");
//        try {
//            PokeApiListDto paListDto = p.findPokemon(10, 0);
//
//            System.out.println("Cantidad de pokemon: " + paListDto.getCount());
//
//            PokeApiOneDto paOneDto = p.findPokemon("1");
//            System.out.println("Nombre: " + paOneDto.getName());
//
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//        
//        System.exit(0);//Borrar esta linea
//    }
}
