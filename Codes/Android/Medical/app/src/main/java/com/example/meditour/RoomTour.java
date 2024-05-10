package com.example.meditour;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentActivity;



import android.content.Intent;
import android.os.Bundle;

import android.widget.ImageButton;

public class RoomTour extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_tour);
        ImageButton m1 = findViewById(R.id.BackToMain);

        CardView r1 = findViewById(R.id.room_1);


        r1.setOnClickListener(v -> {
            Intent i = getPackageManager().getLaunchIntentForPackage("com.whatsapp");

                startActivity(i);


        });


        m1.setOnClickListener(v -> startActivity(new Intent(RoomTour.this,MainActivity.class)));
    }
}