package dto.onepokeapi;

public class GenerationIvDto {
    private SpritesDto diamondPearl;
    private SpritesDto heartgoldSoulsilver;
    private SpritesDto platinum;

    public SpritesDto getDiamondPearl() { return diamondPearl; }
    public void setDiamondPearl(SpritesDto value) { this.diamondPearl = value; }

    public SpritesDto getHeartgoldSoulsilver() { return heartgoldSoulsilver; }
    public void setHeartgoldSoulsilver(SpritesDto value) { this.heartgoldSoulsilver = value; }

    public SpritesDto getPlatinum() { return platinum; }
    public void setPlatinum(SpritesDto value) { this.platinum = value; }
}
