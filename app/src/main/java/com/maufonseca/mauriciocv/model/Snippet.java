package com.maufonseca.mauriciocv.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

public class Snippet implements Parcelable {
  private String title, subtitle, shortDescription, longDescription;

  public Snippet() {
    this.title = "";
    this.subtitle = "";
    this.shortDescription = "";
    this.longDescription = "";
  }

  public Snippet(String title, String subtitle, String shortDescription, String longDescription) {
    this.title = title;
    this.subtitle = subtitle;
    this.shortDescription = shortDescription;
    this.longDescription = longDescription;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getSubtitle() {
    return subtitle;
  }

  public void setSubtitle(String subtitle) {
    this.subtitle = subtitle;
  }

  public String getShortDescription() {
    return shortDescription;
  }

  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }

  public String getLongDescription() {
    return longDescription;
  }

  public void setLongDescription(String longDescription) {
    this.longDescription = longDescription;
  }

  public boolean matchesQuery(String query) {
    return (title.toLowerCase().contains(query.toLowerCase())
        || subtitle.toLowerCase().contains(query.toLowerCase())
        || shortDescription.toLowerCase().contains(query.toLowerCase())
        || longDescription.toLowerCase().contains(query.toLowerCase()));
  }

  @Override
  public int describeContents() {
    return 0;
  }

  @Override
  public void writeToParcel(Parcel dest, int flags) {
    dest.writeString(this.title);
    dest.writeString(this.subtitle);
    dest.writeString(this.shortDescription);
    dest.writeString(this.longDescription);
  }

  protected Snippet(Parcel in) {
    this.title = in.readString();
    this.subtitle = in.readString();
    this.shortDescription = in.readString();
    this.longDescription = in.readString();
  }

  public static final Creator<Snippet> CREATOR = new Creator<Snippet>() {
    @Override
    public Snippet createFromParcel(Parcel source) {
      return new Snippet(source);
    }

    @Override
    public Snippet[] newArray(int size) {
      return new Snippet[size];
    }
  };
}
