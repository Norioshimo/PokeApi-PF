package dto.onepokeapi;

public class StatDto {
    private long baseStat;
    private long effort;
    private SpeciesDto stat;

    public long getBaseStat() { return baseStat; }
    public void setBaseStat(long value) { this.baseStat = value; }

    public long getEffort() { return effort; }
    public void setEffort(long value) { this.effort = value; }

    public SpeciesDto getStat() { return stat; }
    public void setStat(SpeciesDto value) { this.stat = value; }
}
