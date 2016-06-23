package com.prempal.dbflowtest;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.raizlabs.android.dbflow.structure.provider.ContentUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //testing content provider
        Currency currency = new Currency();
        currency.name = "INR";
        Uri insertUri = Uri.parse("content://com.raizlabs.android.dbflow.test.provider/Currency");
        Uri uri = ContentUtils.insert(getContentResolver(), insertUri, currency);
        Log.d("Uri: ", uri.toString());
    }
}
