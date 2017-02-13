package com.example.shadrach.smec;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class HODdesk extends AppCompatActivity {
    EditText editText;
    Button notify_btn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoddesk);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        editText = (EditText)findViewById(R.id.editText3);

    }



    public void onWriteClickListener(View view){
        String Notification = editText.getText().toString();
        try {
            FileOutputStream notificationOut = openFileOutput("Notification.txt", MODE_PRIVATE);
            notificationOut.write(Notification.getBytes());
            notificationOut.close();
            Toast.makeText(getApplicationContext(),"Notification Sent",Toast.LENGTH_LONG).show();
            editText.setText("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Intent intent = new Intent();
        PendingIntent pIntent = PendingIntent.getActivity(HODdesk.this,0,intent,0);
        Notification noti = new Notification.Builder(HODdesk.this)
                .setTicker("TickerTitle")
                .setSmallIcon(R.mipmap.ic_launcher)
                .setAutoCancel(true)
                .setContentTitle("Context Title")
                .setContentText(Notification)
                .setSmallIcon(R.mipmap.ic_launcher)
                .setContentIntent(pIntent).getNotification();


        NotificationManager nm = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);
        nm.notify(0,noti);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_hoddesk, menu);
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
