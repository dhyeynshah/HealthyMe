package com.example.healthyme;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    ImageButton buttonDrawerToggle;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        drawerLayout = findViewById(R.id.drawerLayout);
        buttonDrawerToggle = findViewById(R.id.buttonDrawerToggle);
        navigationView = findViewById(R.id.navigationView);

        buttonDrawerToggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.open();
            }
        });


        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int itemId = item.getItemId();
                if (itemId == R.id.navAccess) {
                    Toast.makeText(MainActivity.this, "Access Clicked", Toast.LENGTH_SHORT).show();
                }

                if (itemId == R.id.navAppointments) {
                    Toast.makeText(MainActivity.this, "Appointments Clicked", Toast.LENGTH_SHORT).show();
                }

                if (itemId == R.id.navFiles) {
                    Toast.makeText(MainActivity.this, "Files Clicked", Toast.LENGTH_SHORT).show();
                }

                if (itemId == R.id.navMedicine) {
                    Toast.makeText(MainActivity.this, "Medicine Clicked", Toast.LENGTH_SHORT).show();
                }

                if (itemId == R.id.navReminders) {
                    Toast.makeText(MainActivity.this, "Reminders Clicked", Toast.LENGTH_SHORT).show();
                }

                if (itemId == R.id.navSleep) {
                    Toast.makeText(MainActivity.this, "Sleep Clicked", Toast.LENGTH_SHORT).show();
                }

                if (itemId == R.id.navSteps) {
                    Toast.makeText(MainActivity.this, "Steps Clicked", Toast.LENGTH_SHORT).show();
                }

                if (itemId == R.id.navSymptoms) {
                    Toast.makeText(MainActivity.this, "Symptoms Clicked", Toast.LENGTH_SHORT).show();
                }

                drawerLayout.close();

                return false;
            }
        });


    }
}