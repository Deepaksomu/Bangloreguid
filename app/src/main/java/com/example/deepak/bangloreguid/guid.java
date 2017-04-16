package com.example.deepak.bangloreguid;

/**
 * Created by Deepak on 23-03-2017.
 */

public class guid   {
    /**
     * {@link guid} represents a imageview and a textview .
     * * It contains a ImageResourceId and a DetilsText for that place.
     */

    /** Imageview of the place*/
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** TextView of the place */
    private String mDetailsText;

    private static final int NO_IMAGE_PROVIDED =-1;


    /**
     Create a new guid object .
     */
    public guid( String DetailsText,int ImageResourceId) {
        mImageResourceId = ImageResourceId;
        mDetailsText =  DetailsText;
    }

    /**
     Create a new guid object .
     */
    public guid( String DetailsText) {

        mDetailsText =  DetailsText;
    }

    /**
     * Get the image of the place
     */
    public int getImageResourceId() {
        return  mImageResourceId;
    }

    /**
     Get the text of the place
     */
    public String getDetailsText() {
        return mDetailsText;
    }
    //return true or false if the image is present or not
    public boolean hasimage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
