package com.gamecodeschool.expressingyourself;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    int numMessages;
    int myNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        numMessages = 1;

        for(int i = 0; i < 10; i++) {
            for (int j = 0; j <= 4; j++){
                myNum = numMessages + j;
                Log.i("myNum = ", "Innerloop #" + myNum);
            }
            myNum = numMessages + i;
            Log.i("myNum = ", "Outerloop #" + myNum);
        }


        /*String message = "";

        switch(message){
            case "message1":
                Log.i("message1: ", "This is message 1" );
                break;

            case "message2":
                Log.i("message2: ", "This is message 2" );
                break;

            case "message3":
                Log.i("message3: ", "This is message 3" );
                break;

            case "message4":
                Log.i("message4: ", "This is message 4" );
                break;

            default:
                Log.i("messageDefault: ", "This is default message" );
                break;
        }*/

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
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onStop() {
        super.onStop();
        numMessages = numMessages ++;
        Log.i("numMessages = ", "" + numMessages);

    }
}
