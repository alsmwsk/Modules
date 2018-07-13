package com.appg.modules;

public class ItemForm {

    private String mNames;
    private String mImageUrls;

    public ItemForm(String mNames, String mImageUrls) {
        this.mNames = mNames;
        this.mImageUrls = mImageUrls;
    }

    public String getmNames() {
        return mNames;
    }

    public void setmNames(String mNames) {
        this.mNames = mNames;
    }

    public String getmImageUrls() {
        return mImageUrls;
    }

    public void setmImageUrls(String mImageUrls) {
        this.mImageUrls = mImageUrls;
    }
}
