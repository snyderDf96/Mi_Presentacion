package com.example.labjdos18.hiuberstdf2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button acceder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        acceder=(Button)findViewById(R.id.yo);
        acceder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent acceder= new Intent(MainActivity.this,WindowsActivity.class);
                startActivity(acceder);
            }
        });
    }
}
