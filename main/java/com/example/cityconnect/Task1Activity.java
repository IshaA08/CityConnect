/**
 * Task1Activity.java
 * @author Isha Afzaal
 * CalgaryHacks 2021 Team#: 74
 * Info: Display information related to task #1 and give users the ability to undertake the task.
 */

package com.example.cityconnect;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Task1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task1);
    }

    public void taskAssigned (View view) {
        Intent intent = new Intent(this, TaskTakenActivity.class);
        startActivity(intent);
    }
}