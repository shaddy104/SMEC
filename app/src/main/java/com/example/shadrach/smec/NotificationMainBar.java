package com.example.shadrach.smec;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class NotificationMainBar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification_main_bar);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
    }

    public void onClickHeadOfTheDepartmentLoginListener(View view){
        startActivity(new Intent(NotificationMainBar.this, HeadOfDepartmentLogInNotify.class));
    }

    public void onClickNotificationStudentBarListener(View view){
        startActivity(new Intent(NotificationMainBar.this,NotificationStudentBar.class));
    }

    public void onClickStudentHubListener(View view){
        startActivity(new Intent(NotificationMainBar.this,StudentHub.class));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_notification_main_bar, menu);
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
