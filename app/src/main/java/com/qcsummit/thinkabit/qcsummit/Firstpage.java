package com.qcsummit.thinkabit.qcsummit;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by spillai1 on 7/8/15.
 */
public class Firstpage extends Activity {

    private Button  btnGame, btnSocial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_page);


        btnGame = (Button) findViewById(R.id.btngame);

        btnSocial = (Button) findViewById(R.id.btnsocial);



//        button = (Button) findViewById(R.id.button);

        btnGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                setContentView(R.layout.grandma);
                Intent intent = new Intent(Firstpage.this, Game.class);
                startActivity(intent);

            }
        });

//        btnSocial.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(Firstpage.this, Peers.class);
//                startActivity(intent);
////                setContentView(R.layout.peers);
//
//            }
//        });


    }

}
