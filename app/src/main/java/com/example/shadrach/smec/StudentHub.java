package com.example.shadrach.smec;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;

public class StudentHub extends AppCompatActivity {
    private static WebView stu_browse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_hub);
        stu_browse=(WebView)findViewById(R.id.webView2);
        stu_browse.getSettings().setLoadsImagesAutomatically(true);
        stu_browse.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        stu_browse.getSettings().setAllowContentAccess(true);
        stu_browse.getSettings().setAllowFileAccess(true);
        stu_browse.getSettings().setAllowFileAccessFromFileURLs(true);
        stu_browse.loadUrl("http://119.235.48.130/results/student_corner_index.php");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_student_hub, menu);
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
