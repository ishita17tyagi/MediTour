package com.example.meditour;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class RoomTour extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_tour);
        ImageButton m1 = findViewById(R.id.BackToMain);

        CardView r1 = findViewById(R.id.room_1);
        r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = getPackageManager().getLaunchIntentForPackage("com.fyoutube");
                if (i != null) {
                    startActivity(i);
                } else {
                    startActivity(new Intent(RoomTour.this, AR_Model.class));
                }

            }
        });


        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RoomTour.this,MainActivity.class));
            }
        });
    }
}