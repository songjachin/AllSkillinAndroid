package com.songjachin.allskillinandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.songjachin.allskillinandroid.client.ClientActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.jump_to_client_activity).setOnClickListener(v->{
            Intent intent = new Intent(this, ClientActivity.class);
            startActivity(intent);
        });
    }
}