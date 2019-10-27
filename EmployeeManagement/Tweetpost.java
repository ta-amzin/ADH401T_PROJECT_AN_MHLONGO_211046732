import java.util.List;

import javax.swing.JOptionPane;

import twitter4j.Status;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;
import twitter4j.examples.tweets.ShowStatus;

public class Tweetpost {
	
	public void tweet() 	throws TwitterException{
		
		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setDebugEnabled(false)
		.setOAuthConsumerKey("")
		.setOAuthConsumerSecret("")
		.setOAuthAccessToken("")
		.setOAuthAccessTokenSecret("");
		
		TwitterFactory tf = new TwitterFactory(cb.build());
		twitter4j.Twitter twitter = tf.getInstance();
	
		String tweet = JOptionPane.showInputDialog(" im tweeting...");
		Status status = twitter.updateStatus(tweet);
		System.out.println("Twitter post to @");
		
	}
}
