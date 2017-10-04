package com.example.lenovo.trackingeye.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.lenovo.trackingeye.R;

public class Setting extends AppCompatActivity {

    Toolbar mActionBarToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        mActionBarToolbar = (Toolbar) findViewById(R.id.toolbarsetting);
        setSupportActionBar(mActionBarToolbar);
        getSupportActionBar().setTitle("Setelan");
    }
}
