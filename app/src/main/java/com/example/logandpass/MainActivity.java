package com.example.logandpass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void logan(View view){
        Intent intent = new Intent(this, YesActivity.class);
        EditText log = (EditText) findViewById(R.id.login);
        EditText password = (EditText) findViewById(R.id.pass);
        TextView deny = (TextView) findViewById(R.id.textView3);
        String logText = log.getText().toString();
        String passText = password.getText().toString();
        if (logText.equals("ggwp") && passText.equals("papich228")){
            startActivity(intent);
        }
        else {
            deny.setText("Accept Denied");
        }
    }
}