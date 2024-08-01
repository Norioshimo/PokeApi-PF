package dto.listpokeapi;

import java.io.Serializable;
import java.util.List;

public class PokeApiListDto implements Serializable {

    private Integer count;

    private String next;

    private String previous;

    private List<ResultsDto> results;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getPrevious() {
        return previous;
    }

    public void setPrevious(String previous) {
        this.previous = previous;
    }

    public List<ResultsDto> getResults() {
        return results;
    }

    public void setResults(List<ResultsDto> results) {
        this.results = results;
    }

}
