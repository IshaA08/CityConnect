/**
 * HomeActivity.java
 * @author Isha Afzaal
 * CalgaryHacks 2021 Team#: 74
 * Info: Give user an option to jump to various points in the app: Home, Points, Shop, Account and Tasks.
 */

package com.example.cityconnect;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
}