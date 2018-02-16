package com.offbyamilestudios.circleanim;

import android.content.Context;
import android.content.Intent;
import android.drm.DrmStore;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        Context context = MainActivity.this;
        Class destinationActivity = SettingsActivity.class;

        int id = item.getItemId();
            if (id == R.id.action_settings) {
                Intent settingsItemPressed = new Intent(context, destinationActivity);
                startActivity(settingsItemPressed);
                return true;

            }
            return super.onOptionsItemSelected(item);

    }
}
