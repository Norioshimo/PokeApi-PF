package dto.onepokeapi;

import dto.onepokeapi.GenerationVDto;
import dto.onepokeapi.GenerationViiiDto;
import dto.onepokeapi.HomeDto;
import dto.onepokeapi.GenerationViiDto;
import dto.onepokeapi.GenerationIvDto;
import dto.onepokeapi.GenerationIiDto;
import dto.onepokeapi.GenerationIDto;
import dto.onepokeapi.GenerationIiiDto;
import java.util.Map;

public class VersionsDto {
    private GenerationIDto generationI;
    private GenerationIiDto generationIi;
    private GenerationIiiDto generationIii;
    private GenerationIvDto generationIv;
    private GenerationVDto generationV;
    private Map<String, HomeDto> generationVi;
    private GenerationViiDto generationVii;
    private GenerationViiiDto generationViii;

    public GenerationIDto getGenerationI() { return generationI; }
    public void setGenerationI(GenerationIDto value) { this.generationI = value; }

    public GenerationIiDto getGenerationIi() { return generationIi; }
    public void setGenerationIi(GenerationIiDto value) { this.generationIi = value; }

    public GenerationIiiDto getGenerationIii() { return generationIii; }
    public void setGenerationIii(GenerationIiiDto value) { this.generationIii = value; }

    public GenerationIvDto getGenerationIv() { return generationIv; }
    public void setGenerationIv(GenerationIvDto value) { this.generationIv = value; }

    public GenerationVDto getGenerationV() { return generationV; }
    public void setGenerationV(GenerationVDto value) { this.generationV = value; }

    public Map<String, HomeDto> getGenerationVi() { return generationVi; }
    public void setGenerationVi(Map<String, HomeDto> value) { this.generationVi = value; }

    public GenerationViiDto getGenerationVii() { return generationVii; }
    public void setGenerationVii(GenerationViiDto value) { this.generationVii = value; }

    public GenerationViiiDto getGenerationViii() { return generationViii; }
    public void setGenerationViii(GenerationViiiDto value) { this.generationViii = value; }
}
