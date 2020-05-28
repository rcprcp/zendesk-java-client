package org.zendesk.client.v2.model;

public class Restriction
{
    private String type;

    private int id;

    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return this.type;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }
}


