package com.example.ocr_gui2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;





public class skip1 extends AppCompatActivity {

    // define the variable
    TextView skip;
    Button next;

    @Override
    public void finish()
    {
        super.finish();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skip1);
        // final MediaPlayer catSoundMediaPlayer = MediaPlayer.create(this,R.raw.Skip);
        // final Button playCatMeow = (Button) this.findViewById(R.id.skip);

        skip = (TextView)findViewById(R.id.skip);
        next = (Button)findViewById(R.id.next);
        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
               // catSoundMediaPlayer.start();

                Intent intent = new Intent(getApplicationContext(), home.class);
                startActivity(intent);
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                // catSoundMediaPlayer.start();

                Intent intent = new Intent(getApplicationContext(), skip2.class);
                startActivity(intent);
            }
        });
    }
}

