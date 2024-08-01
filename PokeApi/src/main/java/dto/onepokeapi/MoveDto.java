package dto.onepokeapi;

import java.util.List;

public class MoveDto {
    private SpeciesDto move;
    private List<VersionGroupDetailDto> versionGroupDetails;

    public SpeciesDto getMove() { return move; }
    public void setMove(SpeciesDto value) { this.move = value; }

    public List<VersionGroupDetailDto> getVersionGroupDetails() { return versionGroupDetails; }
    public void setVersionGroupDetails(List<VersionGroupDetailDto> value) { this.versionGroupDetails = value; }
}
