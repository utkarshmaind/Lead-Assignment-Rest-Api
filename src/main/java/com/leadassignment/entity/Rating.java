package com.leadassignment.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class Rating {
    private String userId;
    public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	private int rating;
    private String comment;

}

