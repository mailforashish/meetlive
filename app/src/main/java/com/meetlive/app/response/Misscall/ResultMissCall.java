package com.meetlive.app.response.Misscall;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResultMissCall {
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("message")
    @Expose
    private String message;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
