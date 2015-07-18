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
public class Quiz3 extends Activity {
    //List<Question> questions;
    //int qid = 0;
    //Question currentQ;
    //TextView txtQuestion;
    //Button ba, bb, bc, bd;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz3);
        next = (Button) findViewById(R.id.button4);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                setContentView(R.layout.grandma);
                Intent intent = new Intent(Quiz3.this, Quiz4.class);
                startActivity(intent);

            }
        });
    }
}
    /*
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz);
        QuestionDB db = new QuestionDB(this);
        questions=db.getAllQuestions();
        currentQ=questions.get(qid);
        txtQuestion=(TextView)findViewById(R.id.textView1);
        ba=(Button)findViewById(R.id.button0);
        bb=(Button)findViewById(R.id.button1);
        bc=(Button)findViewById(R.id.button2);
        bd=(Button)findViewById(R.id.button3);

    }

    private void setQuestionView()
    {
        txtQuestion.setText(currentQ.getQUESTION());
        ba.setText(currentQ.getA());
        bb.setText(currentQ.getB());
        bc.setText(currentQ.getC());
        bd.setText(currentQ.getD());
        qid++;
    }
}
*/