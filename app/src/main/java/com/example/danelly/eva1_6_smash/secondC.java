package com.example.danelly.eva1_6_smash;

import android.support.v7.app.AppCompatActivity;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Color;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class secondC extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundaria);
        getFragmentManager().beginTransaction().replace(android.R.id.content,
                new Configuracion()) .commit();
        SharedPreferences spMisPref = PreferenceManager.getDefaultSharedPreferences(this);
        Resources resource = this.getResources();
    }
    public static class Configuracion extends PreferenceFragment {
        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            addPreferencesFromResource(R.xml.preferences);
        }
    }
}