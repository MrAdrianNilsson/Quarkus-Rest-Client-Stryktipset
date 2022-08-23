package org.gs.model;


import java.util.*;


//@JsonIgnoreProperties(ignoreUnknown = true)
public class Matcher {

    public Set<Object> draws;
    private String productName;
    private String requestId;

    public Matcher() {

    }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

}
