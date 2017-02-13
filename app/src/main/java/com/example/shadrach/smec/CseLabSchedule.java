package com.example.shadrach.smec;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class CseLabSchedule extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cse_lab_schedule);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
    }

    public void onClickcse1Listener(View view){
        startActivity(new Intent(CseLabSchedule.this, CseFirstYear.class));
    }

    public void onClickcse2Listener(View view){
        startActivity(new Intent(CseLabSchedule.this, CseSecondYear.class));
    }

    public void onClickcse3Listener(View view){
        startActivity(new Intent(CseLabSchedule.this, CseThirdYear.class));
    }

    public void onClickcse4Listener(View view){
        startActivity(new Intent(CseLabSchedule.this, CseFourthYear.class));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_cse_lab_schedule, menu);
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
