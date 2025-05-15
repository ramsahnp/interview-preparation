package com.interview_preparation.keep.growing.util.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SensexData {

    @JsonProperty("indxnm")
    private String indexName;

    @JsonProperty("ltp")
    private String lastTradedPrice;

    @JsonProperty("chg")
    private String change;

    @JsonProperty("perchg")
    private String percentChange;

    @JsonProperty("F")
    private String f;

    @JsonProperty("dttm")
    private String dateTime;

    @JsonProperty("istream")
    private String iStream;

    @JsonProperty("msg")
    private String message;

    @JsonProperty("Prev_Close")
    private String previousClose;

    @JsonProperty("I_open")
    private String open;

    @JsonProperty("High")
    private String high;

    @JsonProperty("Low")
    private String low;

    @JsonProperty("source")
    private String source;

    @JsonProperty("iclsprice")
    private String iclsPrice;

    @JsonProperty("iclsflag")
    private String iclsFlag;

    @JsonProperty("iclsChg")
    private String iclsChange;

    @JsonProperty("iclsPchg")
    private String iclsPercentChange;

    // Getters and setters
    public String getIndexName() { return indexName; }
    public void setIndexName(String indexName) { this.indexName = indexName; }

    public String getLastTradedPrice() { return lastTradedPrice; }
    public void setLastTradedPrice(String lastTradedPrice) { this.lastTradedPrice = lastTradedPrice; }

    public String getChange() { return change; }
    public void setChange(String change) { this.change = change; }

    public String getPercentChange() { return percentChange; }
    public void setPercentChange(String percentChange) { this.percentChange = percentChange; }

    public String getF() { return f; }
    public void setF(String f) { this.f = f; }

    public String getDateTime() { return dateTime; }
    public void setDateTime(String dateTime) { this.dateTime = dateTime; }

    public String getiStream() { return iStream; }
    public void setiStream(String iStream) { this.iStream = iStream; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }

    public String getPreviousClose() { return previousClose; }
    public void setPreviousClose(String previousClose) { this.previousClose = previousClose; }

    public String getOpen() { return open; }
    public void setOpen(String open) { this.open = open; }

    public String getHigh() { return high; }
    public void setHigh(String high) { this.high = high; }

    public String getLow() { return low; }
    public void setLow(String low) { this.low = low; }

    public String getSource() { return source; }
    public void setSource(String source) { this.source = source; }

    public String getIclsPrice() { return iclsPrice; }
    public void setIclsPrice(String iclsPrice) { this.iclsPrice = iclsPrice; }

    public String getIclsFlag() { return iclsFlag; }
    public void setIclsFlag(String iclsFlag) { this.iclsFlag = iclsFlag; }

    public String getIclsChange() { return iclsChange; }
    public void setIclsChange(String iclsChange) { this.iclsChange = iclsChange; }

    public String getIclsPercentChange() { return iclsPercentChange; }
    public void setIclsPercentChange(String iclsPercentChange) { this.iclsPercentChange = iclsPercentChange; }
}
