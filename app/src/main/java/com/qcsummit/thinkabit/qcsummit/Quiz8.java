package com.qcsummit.thinkabit.qcsummit;

import android.app.Activity;
import java.util.List;
import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by tdvoss on 7/18/2015.
 */
public class Quiz8 extends Activity {
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz8);
        next = (Button) findViewById(R.id.button9);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                setContentView(R.layout.grandma);
                Intent intent = new Intent(Quiz8.this, Firstpage.class);
                startActivity(intent);

            }
        });
    }
}
