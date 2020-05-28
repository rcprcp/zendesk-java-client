package org.zendesk.client.v2.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Columns {
    private String id;

    private String title;

    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("id")
    public String getId() {
        return this.id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("title")
    public String getTitle() {
        return this.title;
    }
}
