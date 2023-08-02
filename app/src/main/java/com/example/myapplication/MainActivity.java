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

        // Populate item_event views for Event 1
        TextView eventNameTextView1 = cardLayout1.findViewById(R.id.eventName);
        TextView eventDescriptionTextView1 = cardLayout1.findViewById(R.id.eventDescription);
        TextView eventStartDateTextView1 = cardLayout1.findViewById(R.id.eventStartDate);
        TextView eventEndDateTextView1 = cardLayout1.findViewById(R.id.eventEndDate);

        eventNameTextView1.setText("Neversea Festival");
        eventDescriptionTextView1.setText("A music festival by the sea.");
        eventStartDateTextView1.setText("Starts: July 10, 2023");
        eventEndDateTextView1.setText("Ends: July 12, 2023");

        // Set content for Event 2
        View cardLayout2 = findViewById(R.id.cardLayout2);
        ImageView photoImageView2 = cardLayout2.findViewById(R.id.photo);
        TextView titleTextView2 = cardLayout2.findViewById(R.id.title);

        photoImageView2.setImageResource(R.drawable.untold); // Set the photo
        titleTextView2.setText("Untold");

        // Populate item_event views for Event 2
        TextView eventNameTextView2 = cardLayout2.findViewById(R.id.eventName);
        TextView eventDescriptionTextView2 = cardLayout2.findViewById(R.id.eventDescription);
        TextView eventStartDateTextView2 = cardLayout2.findViewById(R.id.eventStartDate);
        TextView eventEndDateTextView2 = cardLayout2.findViewById(R.id.eventEndDate);

        eventNameTextView2.setText("Untold Festival");
        eventDescriptionTextView2.setText("Experience the magic of Untold.");
        eventStartDateTextView2.setText("Starts: August 15, 2023");
        eventEndDateTextView2.setText("Ends: August 18, 2023");

        // Set content for additional events if needed
    }
}
