package com.example.droidcafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE =
            "com.example.android.droidcafe.extra.MESSAGE";
    public String mOrderMessage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
    }

        public void displayToast(String message) {
            Toast.makeText(getApplicationContext(), message,
                    Toast.LENGTH_SHORT).show();
    }


    //when donut image clicked
    public void showDonutOrder(View view) {
        mOrderMessage = getString(R.string.donut_order_message);
        displayToast(mOrderMessage);
    }

    //when ice cream image clicked
    public void showIceCreamOrder(View view) {
        mOrderMessage = getString(R.string.ice_cream_order_message);
        displayToast(mOrderMessage);
    }

    //when froyo image clicked
    public void showFroyoOrder(View view) {
        mOrderMessage = getString(R.string.froyo_order_message);
        displayToast(mOrderMessage);
    }

    //sends order to OrderActivity
    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, OrderActivity.class);
        intent.putExtra(EXTRA_MESSAGE, mOrderMessage);
        startActivity(intent);
    }
}