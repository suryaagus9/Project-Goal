package com.example.projectgoal;

import android.os.Parcel;
import android.os.Parcelable;

public class Club implements Parcelable {
    String name;
    String country;
    Integer profile;
    Integer point;

    public Club(String name, String country, Integer profile, Integer point) {
        this.name = name;
        this.country = country;
        this.profile = profile;
        this.point = point;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getProfile() {
        return profile;
    }

    public void setProfile(Integer profile) {
        this.profile = profile;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    protected Club(Parcel in) {
        name = in.readString();
        country = in.readString();
        if (in.readByte() == 0) {
            profile = null;
        } else {
            profile = in.readInt();
        }
        if (in.readByte() == 0) {
            point = null;
        } else {
            point = in.readInt();
        }
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(country);
        if (profile == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(profile);
        }
        if (point == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(point);
        }
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Club> CREATOR = new Creator<Club>() {
        @Override
        public Club createFromParcel(Parcel in) {
            return new Club(in);
        }

        @Override
        public Club[] newArray(int size) {
            return new Club[size];
        }
    };
}
