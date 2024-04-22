package com.example.projectgoal;

import android.os.Parcel;
import android.os.Parcelable;

public class Player implements Parcelable {
    Integer profile;
    String name;
    String club;
    Integer goal;

    public Player(Integer profile, String name, String club, Integer goal) {
        this.profile = profile;
        this.name = name;
        this.club = club;
        this.goal = goal;
    }

    public Integer getProfile() {
        return profile;
    }

    public void setProfile(Integer profile) {
        this.profile = profile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public Integer getGoal() {
        return goal;
    }

    public void setGoal(Integer goal) {
        this.goal = goal;
    }

    protected Player(Parcel in) {
        if (in.readByte() == 0) {
            profile = null;
        } else {
            profile = in.readInt();
        }
        name = in.readString();
        club = in.readString();
        if (in.readByte() == 0) {
            goal = null;
        } else {
            goal = in.readInt();
        }
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        if (profile == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(profile);
        }
        dest.writeString(name);
        dest.writeString(club);
        if (goal == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(goal);
        }
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Player> CREATOR = new Creator<Player>() {
        @Override
        public Player createFromParcel(Parcel in) {
            return new Player(in);
        }

        @Override
        public Player[] newArray(int size) {
            return new Player[size];
        }
    };
}
