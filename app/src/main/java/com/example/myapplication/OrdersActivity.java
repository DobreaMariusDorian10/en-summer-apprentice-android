package com.example.myapplication;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
public class OrdersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_orders);

        // Find the TextView in your OrdersActivity layout
        TextView textView = findViewById(R.id.ordersTextView);

        // Set some dummy text content
        String dummyText = "This is the OrdersActivity.\n\n"
                + "You can display information related to orders here.";
        textView.setText(dummyText);
    }
}
