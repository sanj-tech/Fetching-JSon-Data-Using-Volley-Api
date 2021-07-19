package com.jsstech.recyclerdemo;

public class UserModel {
    public String url;
    public String explanation;


    public UserModel(String url,String explanation) {
        this.url = url;
        this.explanation=explanation;
    }

    public UserModel() {
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url)
    {
        this.url = url;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }
}
