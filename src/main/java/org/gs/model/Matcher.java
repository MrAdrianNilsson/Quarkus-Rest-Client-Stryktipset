package org.gs.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;


import java.util.*;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Matcher {

    public List<Object> draws;


    private String requestId;

    public Matcher(){
    }

    public String getRequestId() throws JsonProcessingException {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

}
