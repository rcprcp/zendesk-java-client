package org.zendesk.client.v2.model;

public class Any
{
    private String field;

    private String operator;

    private String value;

    public void setField(String field){
        this.field = field;
    }
    public String getField(){
        return this.field;
    }
    public void setOperator(String operator){
        this.operator = operator;
    }
    public String getOperator(){
        return this.operator;
    }
    public void setValue(String value){
        this.value = value;
    }
    public String getValue(){
        return this.value;
    }
}

