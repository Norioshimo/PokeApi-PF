package dto.onepokeapi;

public class GameIndexDto {
    private long gameIndex;
    private SpeciesDto version;

    public long getGameIndex() { return gameIndex; }
    public void setGameIndex(long value) { this.gameIndex = value; }

    public SpeciesDto getVersion() { return version; }
    public void setVersion(SpeciesDto value) { this.version = value; }
}
