package com.example.shadrach.smec;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
    }
    public void onClickTimeTableListener(View view){
        startActivity(new Intent(this, FacultyTimeTable.class));
    }

    public void onClickLibraryListener(View view){
        startActivity(new Intent(this, Libraryschedule.class));
    }


    public void onClickLabScheduleListener(View view){
        startActivity(new Intent(this,LABSchedule.class));
    }


    public void SmecNewsFeed(View view){
        startActivity(new Intent(this,NewsFeed.class));
    }

    public void onClickSmecMainNotificationListener(View view){
        startActivity(new Intent(this, NotificationMainBar.class));
    }

    public void onFeedBackClickListener(View view){
        startActivity(new Intent(this,FeedBack.class));
    }
    public void onCallDevelopersClickListener(View view){
       startActivity(new Intent(this,callDevelopers.class));
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
