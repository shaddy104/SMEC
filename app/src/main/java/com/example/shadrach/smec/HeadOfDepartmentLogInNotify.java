package com.example.shadrach.smec;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class HeadOfDepartmentLogInNotify extends AppCompatActivity {
    private static EditText user_name;
    private static EditText password;
    private static Button login_btn;
    int attempt_counter = 5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_head_of_department_log_in_notify);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

    }
    public void onClickHodLoginListener(View view){
        user_name = (EditText)findViewById(R.id.editText);
        password = (EditText)findViewById(R.id.editText2);
        login_btn = (Button)findViewById(R.id.button11);
        if(user_name.getText().toString().equals("hod")&&password.getText().toString().equals("hod")){
            Toast.makeText(HeadOfDepartmentLogInNotify.this,"Access Granted",Toast.LENGTH_SHORT).show();
            startActivity(new Intent(HeadOfDepartmentLogInNotify.this,HODdesk.class));
        }
        else {
            Toast.makeText(HeadOfDepartmentLogInNotify.this,"Access Denied",Toast.LENGTH_SHORT).show();
            attempt_counter--;
            if(attempt_counter==0){
                login_btn.setEnabled(false);
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_head_of_department_log_in_notify, menu);
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
