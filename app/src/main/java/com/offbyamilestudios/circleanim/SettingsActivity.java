package com.offbyamilestudios.circleanim;

import android.content.SharedPreferences;
import android.preference.PreferenceFragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        ActionBar actionBar =this.getSupportActionBar();
            if (actionBar != null) {
                actionBar.setDisplayHomeAsUpEnabled(true);
            }

            // Display the fragment as the settings screen
        FragmentManager mfragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = mfragmentManager
                .beginTransaction();
        PrefsFragment mPrefsFragment = new PrefsFragment();
        fragmentTransaction.replace(android.R.id.content, mPrefsFragment, );
        fragmentTransaction.commit();
    }

    public static class PrefsFragment extends PreferenceFragment {

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            addPreferencesFromResource(R.xml.settings_screen);

            SharedPreferences switchPrefStatus
        }

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
            if (id == android.R.id.home) {
                NavUtils.navigateUpFromSameTask(this);
            }
            return super.onOptionsItemSelected(item);

    }
}
