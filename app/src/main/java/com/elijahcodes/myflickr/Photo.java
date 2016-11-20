package com.elijahcodes.myflickr;

/**
 * Created by Elijah on 11/19/2016.
 */

public class Photo {

    private String mTitle;
    private String mAuthor;
    private String mAutherId;
    private String mLink;
    private String mTag;
    private String mImage;

    public Photo(String mTitle, String mAuthor, String mAutherId, String mLink, String mTag, String mImage) {
        this.mTitle = mTitle;
        this.mAuthor = mAuthor;
        this.mAutherId = mAutherId;
        this.mLink = mLink;
        this.mTag = mTag;
        this.mImage = mImage;
    }

    String getTitle() {
        return mTitle;
    }

    String getAuthor() {
        return mAuthor;
    }

    String getAutherId() {
        return mAutherId;
    }

    String getLink() {
        return mLink;
    }

    String getTag() {
        return mTag;
    }

    String getImage() {
        return mImage;
    }
}
