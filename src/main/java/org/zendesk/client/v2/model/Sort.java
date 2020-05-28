package org.zendesk.client.v2.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Sort
{
    private String id;

    private String title;

    private String order;

    public void setId(String id){
        this.id = id;
    }

    @JsonProperty("id")
    public String getId(){
        return this.id;
    }

    public void setTitle(String title){
        this.title = title;
    }

    @JsonProperty("title")
    public String getTitle(){
        return this.title;
    }

    public void setOrder(String order){
        this.order = order;
    }

    @JsonProperty("order")
    public String getOrder(){
        return this.order;
    }
}


