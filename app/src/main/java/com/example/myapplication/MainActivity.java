package com.example.myapplication;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the Navigation Arrow Icon by its ID
        ImageView navigationArrowIcon = findViewById(R.id.navigationArrowIcon);

        // Set a click listener for the Navigation Arrow Icon
        navigationArrowIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Start the OrdersActivity when the icon is clicked
                Intent intent = new Intent(MainActivity.this, OrdersActivity.class);
                startActivity(intent);
            }
        });
// Find the Arrow Button by its ID
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

        // Set content for Event 3
        View cardLayout3 = findViewById(R.id.cardLayout3);
        ImageView photoImageView3 = cardLayout3.findViewById(R.id.photo);
        TextView titleTextView3 = cardLayout3.findViewById(R.id.title);

        photoImageView3.setImageResource(R.drawable.massif); // Set the photo
        titleTextView3.setText("Massif");

        // Populate item_event views for Event 3
        TextView eventNameTextView3 = cardLayout3.findViewById(R.id.eventName);
        TextView eventDescriptionTextView3 = cardLayout3.findViewById(R.id.eventDescription);
        TextView eventStartDateTextView3 = cardLayout3.findViewById(R.id.eventStartDate);
        TextView eventEndDateTextView3 = cardLayout3.findViewById(R.id.eventEndDate);

        eventNameTextView3.setText("MASSIF FESTIVAL");
        eventDescriptionTextView3.setText("A massive outdoor music festival.");
        eventStartDateTextView3.setText("Starts: September 5, 2023");
        eventEndDateTextView3.setText("Ends: September 8, 2023");

        // Set content for Event 4
        View cardLayout4 = findViewById(R.id.cardLayout4);
        ImageView photoImageView4 = cardLayout4.findViewById(R.id.photo);
        TextView titleTextView4 = cardLayout4.findViewById(R.id.title);

        photoImageView4.setImageResource(R.drawable.oktoberfest); // Set the photo
        titleTextView4.setText("Oktoberfest");

        // Populate item_event views for Event 4
        TextView eventNameTextView4 = cardLayout4.findViewById(R.id.eventName);
        TextView eventDescriptionTextView4 = cardLayout4.findViewById(R.id.eventDescription);
        TextView eventStartDateTextView4 = cardLayout4.findViewById(R.id.eventStartDate);
        TextView eventEndDateTextView4 = cardLayout4.findViewById(R.id.eventEndDate);

        eventNameTextView4.setText("OKTOBERFEST CELEBRATION");
        eventDescriptionTextView4.setText("Experience the famous Oktoberfest.");
        eventStartDateTextView4.setText("Starts: October 1, 2023");
        eventEndDateTextView4.setText("Ends: October 16, 2023");

        // Set content for Event 5
        View cardLayout5 = findViewById(R.id.cardLayout5);
        ImageView photoImageView5 = cardLayout5.findViewById(R.id.photo);
        TextView titleTextView5 = cardLayout5.findViewById(R.id.title);

        photoImageView5.setImageResource(R.drawable.wine); // Set the photo
        titleTextView5.setText("Wine");

        // Populate item_event views for Event 5
        TextView eventNameTextView5 = cardLayout5.findViewById(R.id.eventName);
        TextView eventDescriptionTextView5 = cardLayout5.findViewById(R.id.eventDescription);
        TextView eventStartDateTextView5 = cardLayout5.findViewById(R.id.eventStartDate);
        TextView eventEndDateTextView5 = cardLayout5.findViewById(R.id.eventEndDate);

        eventNameTextView5.setText("WINE TASTING EVENT");
        eventDescriptionTextView5.setText("Explore a variety of exquisite wines.");
        eventStartDateTextView5.setText("Starts: November 10, 2023");
        eventEndDateTextView5.setText("Ends: November 12, 2023");

        // Set content for additional events if needed







    }
}
