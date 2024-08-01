package dto.onepokeapi;

public class TypeDto {
    private long slot;
    private SpeciesDto type;

    public long getSlot() { return slot; }
    public void setSlot(long value) { this.slot = value; }

    public SpeciesDto getType() { return type; }
    public void setType(SpeciesDto value) { this.type = value; }
}
