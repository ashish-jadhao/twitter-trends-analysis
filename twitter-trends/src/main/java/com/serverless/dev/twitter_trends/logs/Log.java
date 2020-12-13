package com.serverless.dev.twitter_trends.logs;

public class Log {

	private String hashtag;
	private int tweetVolume;
	public String getHashtag() {
		return hashtag;
	}
	public void setHashtag(String hashtag) {
		this.hashtag = hashtag;
	}
	public int getTweetVolume() {
		return tweetVolume;
	}
	public void setTweetVolume(int tweetVolume) {
		this.tweetVolume = tweetVolume;
	}
	@Override
	public String toString() {
		return "Log [hashtag=" + hashtag + ", tweetVolume=" + tweetVolume + "]";
	}
	
}
