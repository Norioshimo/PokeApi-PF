package dto.onepokeapi;

public class OtherDto {
    private DreamWorldDto dreamWorld;
    private HomeDto home;
    private OfficialArtworkDto officialArtwork;
    private SpritesDto showdown;

    public DreamWorldDto getDreamWorld() { return dreamWorld; }
    public void setDreamWorld(DreamWorldDto value) { this.dreamWorld = value; }

    public HomeDto getHome() { return home; }
    public void setHome(HomeDto value) { this.home = value; }

    public OfficialArtworkDto getOfficialArtwork() { return officialArtwork; }
    public void setOfficialArtwork(OfficialArtworkDto value) { this.officialArtwork = value; }

    public SpritesDto getShowdown() { return showdown; }
    public void setShowdown(SpritesDto value) { this.showdown = value; }
}
