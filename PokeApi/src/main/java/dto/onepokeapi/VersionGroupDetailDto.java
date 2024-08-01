package dto.onepokeapi;

public class VersionGroupDetailDto {
    private long levelLearnedAt;
    private SpeciesDto moveLearnMethod;
    private SpeciesDto versionGroup;

    public long getLevelLearnedAt() { return levelLearnedAt; }
    public void setLevelLearnedAt(long value) { this.levelLearnedAt = value; }

    public SpeciesDto getMoveLearnMethod() { return moveLearnMethod; }
    public void setMoveLearnMethod(SpeciesDto value) { this.moveLearnMethod = value; }

    public SpeciesDto getVersionGroup() { return versionGroup; }
    public void setVersionGroup(SpeciesDto value) { this.versionGroup = value; }
}
