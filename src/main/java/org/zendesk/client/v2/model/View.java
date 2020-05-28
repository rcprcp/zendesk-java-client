package org.zendesk.client.v2.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class View {
    private String url;

    private long id;

    private String title;

    private boolean active;

    private String updatedAt;

    private String createdAt;

    private long position;

    private String description;

    private Execution execution;

    private Conditions conditions;

    private Restriction restriction;

    private boolean watchable;

    private String rawTitle;

    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("url")
    public String getUrl() {
        return this.url;
    }

    public void setId(long id) {
        this.id = id;
    }

    @JsonProperty("id")
    public long getId() {
        return this.id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("title")
    public String getTitle() {
        return this.title;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @JsonProperty("active")
    public boolean getActive() {
        return this.active;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @JsonProperty("updated_at")
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return this.createdAt;
    }

    public void setPosition(long position) {
        this.position = position;
    }

    @JsonProperty("position")
    public long getPosition() {
        return this.position;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("description")
    public String getDescription() {
        return this.description;
    }

    public void setExecution(Execution execution) {
        this.execution = execution;
    }

    @JsonProperty("execution")
    public Execution getExecution() {
        return this.execution;
    }

    public void setConditions(Conditions conditions) {
        this.conditions = conditions;
    }

    @JsonProperty("conditions")
    public Conditions getConditions() {
        return this.conditions;
    }

    public void setRestriction(Restriction restriction) {
        this.restriction = restriction;
    }

    @JsonProperty("restrictions")
    public Restriction getRestriction() {
        return this.restriction;
    }

    public void setWatchable(boolean watchable) {
        this.watchable = watchable;
    }

    @JsonProperty("watchable")
    public boolean getWatchable() {
        return this.watchable;
    }

    public void setRawTitle(String rawTitle) {
        this.rawTitle = rawTitle;
    }

    @JsonProperty("raw_title")
    public String getRawTitle() {
        return this.rawTitle;
    }

    //TODO: fix this.
    public String toString() {
        return "View: " + id;
    }
}
