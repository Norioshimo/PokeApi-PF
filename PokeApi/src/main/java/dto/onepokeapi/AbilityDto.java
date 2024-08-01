package dto.onepokeapi;

public class AbilityDto {
    private SpeciesDto ability;
    private boolean isHidden;
    private long slot;

    public SpeciesDto getAbility() { return ability; }
    public void setAbility(SpeciesDto value) { this.ability = value; }

    public boolean getIsHidden() { return isHidden; }
    public void setIsHidden(boolean value) { this.isHidden = value; }

    public long getSlot() { return slot; }
    public void setSlot(long value) { this.slot = value; }
}
