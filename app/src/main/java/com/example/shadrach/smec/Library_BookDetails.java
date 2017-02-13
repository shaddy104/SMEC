package com.example.shadrach.smec;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class Library_BookDetails extends AppCompatActivity {
    AutoCompleteTextView bnTextView;
    AutoCompleteTextView anTextView;

    String[] book_name={"operating system","compiler Designs","software enggineering","principle of programming language","computer networks","intellectual property rights"};
    String[] author_name={"pearson","forazon","bunsun","balaguruswamy"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library__book_details);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        bnTextView = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView);
        anTextView = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView2);
        ArrayAdapter bnadapter = new ArrayAdapter(Library_BookDetails.this,android.R.layout.select_dialog_item,book_name);
        ArrayAdapter anadapter = new ArrayAdapter(Library_BookDetails.this,android.R.layout.select_dialog_item,author_name);

        bnTextView.setThreshold(1);
        anTextView.setThreshold(1);
        bnTextView.setAdapter(bnadapter);
        anTextView.setAdapter(anadapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_library__book_details, menu);
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
