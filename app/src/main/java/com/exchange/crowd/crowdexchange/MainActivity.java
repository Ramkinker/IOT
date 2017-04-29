package com.exchange.crowd.crowdexchange;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class  MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button b1;
    Button b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.button1);
        b1.setOnClickListener(this);

        b2 =(Button) findViewById(R.id.button2);
        b2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        // TODO Auto-generated method stub
        switch(v.getId()){
            case R.id.button1:
                setContentView(R.layout.activity_login);
                Intent i = new Intent(this, LoginActivity.class);
                startActivity(i);
                break;
            case R.id.button2:
                setContentView(R.layout.activity_signup_guider);
                Intent p = new Intent(this, signupGuider.class);
                startActivity(p);
                break;
        }

    }

}
