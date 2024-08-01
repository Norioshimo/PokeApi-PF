package dto.onepokeapi;

import dto.onepokeapi.OtherDto;

public class SpritesDto {
    private String backDefault;
    private Object backFemale;
    private String backShiny;
    private Object backShinyFemale;
    private String frontDefault;
    private Object frontFemale;
    private String frontShiny;
    private Object frontShinyFemale;
    private OtherDto other;
    private VersionsDto versions;
    private SpritesDto animated;

    public String getBackDefault() { return backDefault; }
    public void setBackDefault(String value) { this.backDefault = value; }

    public Object getBackFemale() { return backFemale; }
    public void setBackFemale(Object value) { this.backFemale = value; }

    public String getBackShiny() { return backShiny; }
    public void setBackShiny(String value) { this.backShiny = value; }

    public Object getBackShinyFemale() { return backShinyFemale; }
    public void setBackShinyFemale(Object value) { this.backShinyFemale = value; }

    public String getFrontDefault() { return frontDefault; }
    public void setFrontDefault(String value) { this.frontDefault = value; }

    public Object getFrontFemale() { return frontFemale; }
    public void setFrontFemale(Object value) { this.frontFemale = value; }

    public String getFrontShiny() { return frontShiny; }
    public void setFrontShiny(String value) { this.frontShiny = value; }

    public Object getFrontShinyFemale() { return frontShinyFemale; }
    public void setFrontShinyFemale(Object value) { this.frontShinyFemale = value; }

    public OtherDto getOther() { return other; }
    public void setOther(OtherDto value) { this.other = value; }

    public VersionsDto getVersions() { return versions; }
    public void setVersions(VersionsDto value) { this.versions = value; }

    public SpritesDto getAnimated() { return animated; }
    public void setAnimated(SpritesDto value) { this.animated = value; }
}
