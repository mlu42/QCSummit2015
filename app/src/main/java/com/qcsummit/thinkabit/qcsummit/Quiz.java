package com.qcsummit.thinkabit.qcsummit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

/**
 * Created by mlu1 on 7/18/15.
 */
public class Quiz extends AppCompatActivity {


    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz);
        next = (Button) findViewById(R.id.button1);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                setContentView(R.layout.grandma);
                Intent intent = new Intent(Quiz.this, Quiz1.class);
                startActivity(intent);

            }
        });
    }

        @Override
        public boolean onCreateOptionsMenu (Menu menu){
            // Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.menu_main, menu);
            return true;
        }

        @Override
        public boolean onOptionsItemSelected (MenuItem item){
            // Handle action bar item clicks here. The action bar will
            // automatically handle clicks on the Home/Up button, so long
            // as you specify a parent activity in AndroidManifest.xml.
            int id = item.getItemId();

            //noinspection SimplifiableIfStatement
            if (id == R.id.action_Social) {
                Intent intent = new Intent(Quiz.this, Resource.class);
                startActivity(intent);
                return true;
            }
            if (id == R.id.action_profile) {
                Intent intent = new Intent(Quiz.this, Firstpage.class);
                startActivity(intent);
                return true;
            }
            if (id == R.id.action_Career) {
                Intent intent = new Intent(Quiz.this, Career.class);
                startActivity(intent);
                return true;
            }
            if (id == R.id.action_logout) {
                Intent intent = new Intent(Quiz.this, MainActivity.class);
                startActivity(intent);
                return true;
            }


            return super.onOptionsItemSelected(item);
        }


}
