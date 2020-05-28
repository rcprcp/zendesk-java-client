package org.zendesk.client.v2.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Execution {
    private String group_by;

    private String group_order;

    private String sort_by;

    private String sort_order;

//    private String group;

    private Sort sort;

    private List<Columns> columns;

    private List<Fields> fields;

    private List<CustomFieldValue> custom_fields;

    public void setGroup_by(String group_by) {
        this.group_by = group_by;
    }

    @JsonProperty("group_by")
    public String getGroup_by() {
        return this.group_by;
    }

    public void setGroup_order(String group_order) {
        this.group_order = group_order;
    }

    @JsonProperty("group_order")
    public String getGroup_order() {
        return this.group_order;
    }

    public void setSort_by(String sort_by) {
        this.sort_by = sort_by;
    }

    @JsonProperty("sort_by")
    public String getSort_by() {
        return this.sort_by;
    }

    public void setSort_order(String sort_order) {
        this.sort_order = sort_order;
    }

    @JsonProperty("sort_order")
    public String getSort_order() {
        return this.sort_order;
    }

//    public void setGroup(String group) {
//        this.group = group;
//    }

//    @JsonProperty("group")
//    public String getGroup() {
//        return this.group;
//    }

    public void setSort(Sort sort) {
        this.sort = sort;
    }

    @JsonProperty("sort")
    public Sort getSort() {
        return this.sort;
    }

    public void setColumns(List<Columns> columns) {
        this.columns = columns;
    }

    @JsonProperty("columns")
    public List<Columns> getColumns() {
        return this.columns;
    }

    public void setFields(List<Fields> fields) {
        this.fields = fields;
    }

    @JsonProperty("fields")
    public List<Fields> getFields() {
        return this.fields;
    }

    public void setCustom_fields(List<CustomFieldValue> custom_fields) {
        this.custom_fields = custom_fields;
    }

    @JsonProperty("custom_fields")
    public List<CustomFieldValue> getCustom_fields() {
        return this.custom_fields;
    }
}


