package com.entity;

import java.util.List;

import twitter4j.Status;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.api.TimelinesResources;
import twitter4j.conf.ConfigurationBuilder;

public class Timeline {
	
	public void timeline() 	throws TwitterException{
		
		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setDebugEnabled(false)
		.setOAuthConsumerKey("WeltEIe4YuDULVKIFl65JC7kT")
		.setOAuthConsumerSecret("YLBI6Falpje1RAsrNZwNWnvjMtvB6WDhgDgMfJdNj5ThBlB4hZ")
		.setOAuthAccessToken("981168134924062725-MB2i2UQyNO5txDRFlBVJ9IUlnaLl0TK")
		.setOAuthAccessTokenSecret("hW9qEaLboBMVHoeneaImyjDlUH1WWwM79KBt0H2VTtMwl");
		
		TwitterFactory tf = new TwitterFactory(cb.build());
		twitter4j.Twitter twitter = tf.getInstance();
		
		List<Status> status = twitter.getHomeTimeline();
		
		for (Status stat : status){
			System.out.println("username : @" + stat.getUser().getScreenName() + " - " + stat.getText());
		}
	}
}
