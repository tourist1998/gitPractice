package Model;


import java.util.List;

public class SearchResponse {
    private int totalCount;

    private List<Contact> results;

    public SearchResponse(int totalCount, List<Contact> results) {
        this.totalCount = totalCount;
        this.results = results;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public List<Contact> getResults() {
        return results;
    }
}
