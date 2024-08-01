package dto.onepokeapi;

import dto.onepokeapi.CriesDto;
import dto.onepokeapi.MoveDto;
import dto.onepokeapi.AbilityDto;
import dto.onepokeapi.GameIndexDto;
import java.util.List;

public class PokeApiOneDto {
    private List<AbilityDto> abilities;
    private long baseExperience;
    private CriesDto cries;
    private List<SpeciesDto> forms;
    private List<GameIndexDto> gameIndices;
    private long height;
    private List<Object> heldItems;
    private long id;
    private boolean isDefault;
    private String locationAreaEncounters;
    private List<MoveDto> moves;
    private String name;
    private long order;
    private List<Object> pastAbilities;
    private List<Object> pastTypes;
    private SpeciesDto species;
    private SpritesDto sprites;
    private List<StatDto> stats;
    private List<TypeDto> types;
    private long weight;

    public List<AbilityDto> getAbilities() { return abilities; }
    public void setAbilities(List<AbilityDto> value) { this.abilities = value; }

    public long getBaseExperience() { return baseExperience; }
    public void setBaseExperience(long value) { this.baseExperience = value; }

    public CriesDto getCries() { return cries; }
    public void setCries(CriesDto value) { this.cries = value; }

    public List<SpeciesDto> getForms() { return forms; }
    public void setForms(List<SpeciesDto> value) { this.forms = value; }

    public List<GameIndexDto> getGameIndices() { return gameIndices; }
    public void setGameIndices(List<GameIndexDto> value) { this.gameIndices = value; }

    public long getHeight() { return height; }
    public void setHeight(long value) { this.height = value; }

    public List<Object> getHeldItems() { return heldItems; }
    public void setHeldItems(List<Object> value) { this.heldItems = value; }

    public long getID() { return id; }
    public void setID(long value) { this.id = value; }

    public boolean getIsDefault() { return isDefault; }
    public void setIsDefault(boolean value) { this.isDefault = value; }

    public String getLocationAreaEncounters() { return locationAreaEncounters; }
    public void setLocationAreaEncounters(String value) { this.locationAreaEncounters = value; }

    public List<MoveDto> getMoves() { return moves; }
    public void setMoves(List<MoveDto> value) { this.moves = value; }

    public String getName() { return name; }
    public void setName(String value) { this.name = value; }

    public long getOrder() { return order; }
    public void setOrder(long value) { this.order = value; }

    public List<Object> getPastAbilities() { return pastAbilities; }
    public void setPastAbilities(List<Object> value) { this.pastAbilities = value; }

    public List<Object> getPastTypes() { return pastTypes; }
    public void setPastTypes(List<Object> value) { this.pastTypes = value; }

    public SpeciesDto getSpecies() { return species; }
    public void setSpecies(SpeciesDto value) { this.species = value; }

    public SpritesDto getSprites() { return sprites; }
    public void setSprites(SpritesDto value) { this.sprites = value; }

    public List<StatDto> getStats() { return stats; }
    public void setStats(List<StatDto> value) { this.stats = value; }

    public List<TypeDto> getTypes() { return types; }
    public void setTypes(List<TypeDto> value) { this.types = value; }

    public long getWeight() { return weight; }
    public void setWeight(long value) { this.weight = value; }
}
