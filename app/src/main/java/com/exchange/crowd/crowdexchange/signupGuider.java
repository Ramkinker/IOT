package com.exchange.crowd.crowdexchange;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class signupGuider extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_guider);

     findViewById(R.id.googleButton).setOnClickListener(this);

    }
    @Override
    public void onClick(View v)
    {
        // TODO Auto-generated method stub
        switch(v.getId()){
            case R.id.googleButton:
                Intent i = new Intent(this, signup.class);
                startActivity(i);
                break;
            case R.id.button2:
                break;
        }

    }

}
