package com.ceyentra.tattle.model;

public class NewsFeed {
    // This class is create temp for testing
    private String profileName;
    private String profileImgUrl;
    private String postLacation;
    private String postImageUrl;
    private String postTime;
    private String postDescription;
    private int noOfLikes;
    private int noOfDislikes;
    private int noOfShares;



    public NewsFeed() {
    }

    public NewsFeed(String profileName, String profileImgUrl, String postLacation, String postImageUrl, String postTime, int noOfLikes,
                    int noOfDislikes, int noOfShares) {
        this.profileName = profileName;
        this.profileImgUrl = profileImgUrl;
        this.postLacation = postLacation;
        this.postImageUrl = postImageUrl;
        this.postTime = postTime;
        this.noOfLikes = noOfLikes;
        this.noOfDislikes = noOfDislikes;
        this.noOfShares = noOfShares;
    }

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    public String getProfileImgUrl() {
        return profileImgUrl;
    }

    public void setProfileImgUrl(String profileImgUrl) {
        this.profileImgUrl = profileImgUrl;
    }

    public String getPostLacation() {
        return postLacation;
    }

    public void setPostLacation(String postLacation) {
        this.postLacation = postLacation;
    }

    public String getPostImageUrl() {
        return postImageUrl;
    }

    public void setPostImageUrl(String postImageUrl) {
        this.postImageUrl = postImageUrl;
    }

    public int getNoOfLikes() {
        return noOfLikes;
    }

    public void setNoOfLikes(int noOfLikes) {
        this.noOfLikes = noOfLikes;
    }

    public int getNoOfDislikes() {
        return noOfDislikes;
    }

    public void setNoOfDislikes(int noOfDislikes) {
        this.noOfDislikes = noOfDislikes;
    }

    public String getPostTime() {
        return postTime;
    }

    public void setPostTime(String postTime) {
        this.postTime = postTime;
    }

    public int getNoOfShares() {
        return noOfShares;
    }

    public void setNoOfShares(int noOfShares) {
        this.noOfShares = noOfShares;
    }

    public String getPostDescription() {
        return postDescription;
    }

    public void setPostDescription(String postDescription) {
        this.postDescription = postDescription;
    }
}
