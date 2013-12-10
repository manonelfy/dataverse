package edu.harvard.iq.dataverse;

import java.util.List;
import java.util.Map;

public class SolrQueryResponse {

    private List<SolrSearchResult> solrSearchResults;
    private Map<String, List<String>> spellingSuggestionsByToken;

    public List<SolrSearchResult> getSolrSearchResults() {
        return solrSearchResults;
    }

    public void setSolrSearchResults(List<SolrSearchResult> solrSearchResults) {
        this.solrSearchResults = solrSearchResults;
    }

    public Map<String, List<String>> getSpellingSuggestionsByToken() {
        return spellingSuggestionsByToken;
    }

    public void setSpellingSuggestionsByToken(Map<String, List<String>> spellingSuggestionsByToken) {
        this.spellingSuggestionsByToken = spellingSuggestionsByToken;
    }

}
