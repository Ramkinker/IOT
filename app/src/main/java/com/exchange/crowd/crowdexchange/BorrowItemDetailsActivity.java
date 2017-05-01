package com.exchange.crowd.crowdexchange;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class BorrowItemDetailsActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_borrow_item_details);
        Button borrow_button = (Button) findViewById(R.id.borrow);
        borrow_button.setOnClickListener(this);
        ImageButton email_button = (ImageButton) findViewById(R.id.email_button);
        email_button.setOnClickListener(this);
        ImageButton location_button = (ImageButton) findViewById(R.id.location_button);
        location_button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        switch(v.getId()){
            case R.id.borrow:
                AlertDialog alertDialog = new AlertDialog.Builder(BorrowItemDetailsActivity.this).create();
                alertDialog.setTitle("Terms and Conditions");
                alertDialog.setMessage("By accepting these terms and conditions " +
                        "you are agreeing to solve all disputes by our third party " +
                        "dispute settlement system.");
                alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "Accept & Continue",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                setContentView(R.layout.activity_payment);
                                Intent i = new Intent(BorrowItemDetailsActivity.this, PaymentActivity.class);
                                startActivity(i);
                            }
                        });
                alertDialog.show();
                break;
            case R.id.location_button:
                Uri gmmIntentUri = Uri.parse("geo:37.7749,-122.4194");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                }
                break;
            case R.id.email_button:
                Intent intent=new Intent(Intent.ACTION_SEND);
                String[] recipients={"xyz@gmail.com"};
                intent.putExtra(Intent.EXTRA_EMAIL, recipients);
                intent.putExtra(Intent.EXTRA_SUBJECT,"abc");
                intent.putExtra(Intent.EXTRA_TEXT,"def");
                intent.putExtra(Intent.EXTRA_CC,"ghi");
                intent.setType("text/html");
                intent.putExtra(android.content.Intent.EXTRA_TEXT,
                        Html.fromHtml("<html>Hello<br/><b>Just a little test.</b></html>"));
                startActivity(Intent.createChooser(intent, "Send mail"));
                break;

        }
    }

}

