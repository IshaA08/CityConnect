/**
 * MainActivity.java
 * @author Isha Afzaal
 * CalgaryHacks 2021 Team#: 74
 * Info: Main homepage for project. Gives user overview of their options in examining tasks, their
 *       points and browsing the shop alongside viewing overall future city plans.
 */

package com.example.cityconnect;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when user clicks on Tasks button */
    public void taskPressed(View view) {
        Intent intent = new Intent(this, TasksActivity.class);
        startActivity(intent);
    }

    /** Called when user clicks on Points button */
    public void pointsPressed (View view) {
        Intent intent = new Intent(this, PointsActivity.class);
        startActivity(intent);
    }

    /** Called when user clicks on the Shop button */
    public void shopPressed (View view) {
        Intent intent = new Intent(this, ShopActivity.class);
        startActivity(intent);
    }

    /** Called when the user clicks on the Home button */
    public void homePressed (View view) {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }
}