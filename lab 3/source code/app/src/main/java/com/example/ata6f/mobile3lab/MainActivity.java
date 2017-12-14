package com.example.ata6f.mobile3lab;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private static final String TAG = "myMessage";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Help.class);
                startActivity(i);
            }
        });

        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line, MONTHS);

        //ImageView image= (ImageView)findViewById(R.id.image);
        //image.setBackgroundColor(Color.rgb(100,100,50));

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

    }

    float f = (float)0.7;
    ViewGroup layout;

    public void click1(View v){
        Log.i(TAG,f+"");
        layout = (ViewGroup)findViewById(R.id.layout1);
        layout.setAlpha(1);
        startActivity(new Intent(this, TexttoSpeech.class));
        layout.setAlpha(f);
    }

    public void click2(View v){
        layout = (ViewGroup)findViewById(R.id.layout2);
        layout.setAlpha(1);
        startActivity(new Intent(this, SpeechtoText.class));
        layout.setAlpha(f);
    }

    public void click3(View v){
        layout = (ViewGroup)findViewById(R.id.layout3);
        layout.setAlpha(1);
        startActivity(new Intent(this, Recorder.class));
        layout.setAlpha(f);
    }

    public void click4(View v){
        layout = (ViewGroup)findViewById(R.id.layout4);
        layout.setAlpha(1);
        startActivity(new Intent(this, About.class));
        layout.setAlpha(f);
    }

    public void click5(View v){
        layout = (ViewGroup)findViewById(R.id.layout5);
        layout.setAlpha(1);
        startActivity(new Intent(this, SpeechToSpeech.class));
        layout.setAlpha(f);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
