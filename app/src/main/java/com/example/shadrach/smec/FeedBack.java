package com.example.shadrach.smec;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class FeedBack extends AppCompatActivity {
    private static Button button_sbm;
    private static TextView text_v;
    private static RatingBar rating_b;
    private static RadioGroup radio_g;
    private static RadioButton radio_b;
    int attempt_counter=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed_back);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        listenerForRatingBar();
        onButtonClickListener();
    }
    public void listenerForRatingBar(){
        rating_b = (RatingBar)findViewById(R.id.ratingBar);
        text_v = (TextView)findViewById(R.id.textView6);

        rating_b.setOnRatingBarChangeListener(
                new RatingBar.OnRatingBarChangeListener() {
                    @Override
                    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                        text_v.setText(String.valueOf(rating));
                    }
                }
        );

    }
    public void onButtonClickListener(){
        rating_b = (RatingBar)findViewById(R.id.ratingBar);
        button_sbm = (Button)findViewById(R.id.button8);
        radio_g = (RadioGroup)findViewById(R.id.rd_check);

        button_sbm.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int selected_id = radio_g.getCheckedRadioButtonId();
                        radio_b = (RadioButton)findViewById(selected_id);
                        Toast.makeText(FeedBack.this, String.valueOf(rating_b.getRating()), Toast.LENGTH_SHORT).show();
                        Toast.makeText(FeedBack.this, radio_b.getText().toString(), Toast.LENGTH_SHORT).show();
                        Toast.makeText(FeedBack.this, "THANK YOU FOR FEEDBACK", Toast.LENGTH_SHORT).show();
                        attempt_counter--;
                        if(attempt_counter==0)
                        {
                            button_sbm.setEnabled(false);
                        }

                    }
                }
        );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_feed_back, menu);
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
