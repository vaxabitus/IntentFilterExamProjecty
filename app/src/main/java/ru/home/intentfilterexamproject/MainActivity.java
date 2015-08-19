package ru.home.intentfilterexamproject;

import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public final String TAG = "Dev";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void explCall(View view){
        Intent intent = new Intent(this,CurrentDateActivity.class);
        startActivity(intent);

        Log.i(TAG, "Current date view");
    }


    public void implCall(View view){
        Intent intent = new Intent("home_site_act");
        startActivity(intent);

        Log.i(TAG,"implicity call Site activity");
    }

    public void openContacts(View view){
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.android.contacts","com.android.contacts.DialtactsContactsEntryActivity"));
        startActivity(intent);

        Log.i(TAG,"Open contacts");
    }
}
