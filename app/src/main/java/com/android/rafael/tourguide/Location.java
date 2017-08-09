package com.android.rafael.tourguide;

import static android.R.attr.name;

/**
 * Created by Rafael on 5/4/2017.
 */

public class Location {
    private String mName;
    private String mAddress;
    private String mPhone;
    private int mImageResourceId;

    public Location(String mName, String mAddress, String mPhone, int mImageResourceId) {
        this.mName = mName;
        this.mAddress = mAddress;
        this.mPhone = mPhone;
        this.mImageResourceId = mImageResourceId;
    }

    public String getName() {
        return mName;
    }

    public String getAddress() {
        return mAddress;
    }

    public String getPhone() {
        return mPhone;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }
}