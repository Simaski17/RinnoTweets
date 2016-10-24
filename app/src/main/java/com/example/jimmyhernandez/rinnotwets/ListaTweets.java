package com.example.jimmyhernandez.rinnotwets;

import android.app.ListActivity;
import android.os.Bundle;
import com.twitter.sdk.android.Twitter;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.tweetui.TweetTimelineListAdapter;
import com.twitter.sdk.android.tweetui.UserTimeline;

import io.fabric.sdk.android.Fabric;

public class ListaTweets extends ListActivity {

    private String user;

    // Note: Your consumer key and secret should be obfuscated in your source code before shipping.
    private static final String TWITTER_KEY = "ZURm1p1o53wMmmkBkvZSgIurW";
    private static final String TWITTER_SECRET = "W2hK6PMb0BjFnGIsSwcX46pFlX8oHBOex6YbuYM8q5qm9ZimkM";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TwitterAuthConfig authConfig = new TwitterAuthConfig(TWITTER_KEY, TWITTER_SECRET);
        Fabric.with(this, new Twitter(authConfig));
        setContentView(R.layout.lista_tweets);

        user = getIntent().getExtras().getString("nombre");

        final UserTimeline userTimeline = new UserTimeline.Builder()
                .screenName(user)
                .build();
        final TweetTimelineListAdapter adapter = new TweetTimelineListAdapter.Builder(this)
                .setTimeline(userTimeline)
                .build();
        setListAdapter(adapter);
    }
}
