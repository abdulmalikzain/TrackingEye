package com.example.lenovo.trackingeye.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.lenovo.trackingeye.R;

public class Group extends AppCompatActivity {

    Toolbar  mActionBarToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group);

        mActionBarToolbar = (Toolbar) findViewById(R.id.toolbargroup);
        setSupportActionBar(mActionBarToolbar);
        getSupportActionBar().setTitle("My Group");



    }



}
