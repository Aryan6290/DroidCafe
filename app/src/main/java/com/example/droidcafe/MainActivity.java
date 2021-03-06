package com.example.droidcafe;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    String mOrderMessage;
   private Toolbar toolbar;

    public static final String EXTRA_MESSAGE =
            "com.example.android.droidcafe.extra.MESSAGE";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar=(Toolbar) findViewById(R.id.my_toolbar2);
        setSupportActionBar(toolbar);

    }




    //    Toolbar toolbar=(Toolbar) findViewById(R.id.my_toolbar);
//
//    @Override
//    public void setSupportActionBar(@Nullable Toolbar toolbar) {
//        super.setSupportActionBar(toolbar);
//    }

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();
    }

    public void showIceCreamOrder(View view) {
        mOrderMessage = getString(R.string.ice_cream_order_message);
        displayToast(mOrderMessage);
    }

    public void OnClick(View view) {
        if (mOrderMessage != null) {
            Intent intent = new Intent(MainActivity.this, OrderActivity.class);
            intent.putExtra(EXTRA_MESSAGE, mOrderMessage);
            startActivity(intent);
        } else {
            displayToast("Order something!");
        }

    }

    /**
     * Shows a message that the froyo image was clicked.
     */
    public void showFroyoOrder(View view) {

        mOrderMessage = getString(R.string.froyo_order_message);
        displayToast(mOrderMessage);
    }

    public void showDonutOrder(View view) {

        mOrderMessage = getString(R.string.donut_order_message);
        displayToast(mOrderMessage);
    }
}