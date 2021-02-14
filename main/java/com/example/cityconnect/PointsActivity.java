/**
 * PointsActivity.java
 * @author Isha Afzaal
 * CalgaryHacks 2021 Team#: 74
 * Info: Retrieve user data from MySQL database and inform them of their current points balance.
 */

package com.example.cityconnect;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class PointsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_points);
    }
}