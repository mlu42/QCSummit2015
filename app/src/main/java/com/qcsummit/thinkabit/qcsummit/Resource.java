package com.qcsummit.thinkabit.qcsummit;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

/**
 * Created by mlu1 on 7/18/15.
 */
public class Resource extends AppCompatActivity
{


    private Button  btnLocal, btnResource;
    LinearLayout resource, local;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.social);



        resource = (LinearLayout) findViewById(R.id.resourceView);
        local = (LinearLayout) findViewById(R.id.localView);
        resource.setVisibility(View.VISIBLE);
        local.setVisibility(View.GONE);


        btnLocal = (Button) findViewById(R.id.btnlocal);
        btnLocal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                resource.setVisibility(View.GONE);
                local.setVisibility(View.VISIBLE);

            }
        });
        btnResource = (Button) findViewById(R.id.btnResource);
        btnResource.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resource.setVisibility(View.VISIBLE);
                local.setVisibility(View.GONE);



            }
        });





    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_Social) {
            Intent intent = new Intent(Resource.this, Resource.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.action_profile) {
            Intent intent = new Intent(Resource.this, Firstpage.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.action_Career) {
            Intent intent = new Intent(Resource.this, Career.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.action_logout) {
            Intent intent = new Intent(Resource.this, MainActivity.class);
            startActivity(intent);
            return true;
        }



        return super.onOptionsItemSelected(item);
    }
}
