package dto.onepokeapi;

public class GenerationIiDto {
    private CrystalDto crystal;
    private GoldDto gold;
    private GoldDto silver;

    public CrystalDto getCrystal() { return crystal; }
    public void setCrystal(CrystalDto value) { this.crystal = value; }

    public GoldDto getGold() { return gold; }
    public void setGold(GoldDto value) { this.gold = value; }

    public GoldDto getSilver() { return silver; }
    public void setSilver(GoldDto value) { this.silver = value; }
}
