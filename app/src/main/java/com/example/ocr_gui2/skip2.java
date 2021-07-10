package com.example.ocr_gui2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class skip2 extends AppCompatActivity {

    Button prev;
    Button skip;

    @Override
    public void finish()
    {
        super.finish();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skip2);
        skip = (Button)findViewById(R.id.next);
        prev = (Button)findViewById(R.id.Prev);

        // add the OnClickListener in sender button
        // after clicked this button following Instruction will run
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getApplicationContext(), skip1.class);
                startActivity(intent);

            }
        });
        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getApplicationContext(), home.class);
                startActivity(intent);
            }
        });
    }
}


