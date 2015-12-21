package com.ai.cloud.skywalking.model;

public class Identification {
    private String viewPoint;
    private String businessKey;
    private String spanType;

    public Identification() {
        //Non
    }

    public String getViewPoint() {
        return viewPoint;
    }

    public String getBusinessKey() {
        return businessKey;
    }
    
    public String getSpanType(){
    	return spanType;
    }

    public static IdentificationBuilder newBuilder() {
        return new IdentificationBuilder();
    }

    public static class IdentificationBuilder {
        private Identification sendData;

        IdentificationBuilder() {
            sendData = new Identification();
        }

        public Identification build() {
            return sendData;
        }

        public IdentificationBuilder viewPoint(String viewPoint) {
            sendData.viewPoint = viewPoint;
            return this;
        }

        public IdentificationBuilder businessKey(String businessKey) {
            sendData.businessKey = businessKey;
            return this;
        }
        
        public IdentificationBuilder spanType(String spanType) {
            sendData.spanType = spanType;
            return this;
        }

    }


}
