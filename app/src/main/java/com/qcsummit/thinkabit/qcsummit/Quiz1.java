package com.qcsummit.thinkabit.qcsummit;

import android.app.Activity;
import java.util.List;
import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by tdvoss on 7/18/2015.
 */
public class Quiz1 extends Activity {
    //List<Question> questions;
    //int qid = 0;
    //Question currentQ;
    //TextView txtQuestion;
    //Button ba, bb, bc, bd;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz1);
        next = (Button) findViewById(R.id.button2);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                setContentView(R.layout.grandma);
                Intent intent = new Intent(Quiz1.this, Quiz2.class);
                startActivity(intent);

            }
        });
    }







}
