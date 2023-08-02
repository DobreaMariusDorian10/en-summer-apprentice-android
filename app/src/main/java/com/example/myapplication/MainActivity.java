package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set content for Event 1
        View cardLayout1 = findViewById(R.id.cardLayout1);
        ImageView photoImageView1 = cardLayout1.findViewById(R.id.photo);
        TextView titleTextView1 = cardLayout1.findViewById(R.id.title);

        photoImageView1.setImageResource(R.drawable.neversea); // Set the photo
        titleTextView1.setText("Neversea");

        // Set content for Event 2
        View cardLayout2 = findViewById(R.id.cardLayout2);
        ImageView photoImageView2 = cardLayout2.findViewById(R.id.photo);
        TextView titleTextView2 = cardLayout2.findViewById(R.id.title);

        photoImageView2.setImageResource(R.drawable.untold); // Set the photo
        titleTextView2.setText("Untold");

        // Set content for additional events if needed
    }
}
