package com.example.shadrach.smec;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;

public class NewsFeed extends AppCompatActivity {
    private static WebView Newsbrowser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_feed);
        Newsbrowser=(WebView)findViewById(R.id.webView);
        Newsbrowser.getSettings().setLoadsImagesAutomatically(true);
        Newsbrowser.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        Newsbrowser.getSettings().setAllowContentAccess(true);
        Newsbrowser.getSettings().setAllowFileAccess(true);
        Newsbrowser.getSettings().setAllowFileAccessFromFileURLs(true);
        Newsbrowser.loadUrl("file:///G:/MRTN/newsfeed.html");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_news_feed, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
