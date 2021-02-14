/**
 * Tasksctivity.java
 * @author Isha Afzaal
 * CalgaryHacks 2021 Team#: 74
 * Info: Show users currently available tasks that they can complete to earn points.
 */

package com.example.cityconnect;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TasksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasks);
    }

    /**
     * Redirect users when they click to view tasks
     */
    public void taskOne (View view) {
        Intent intent = new Intent(this, Task1Activity.class);
        startActivity(intent);
    }

    public void taskTwo (View view) {
        Intent intent = new Intent(this, Task1Activity.class);
        startActivity(intent);
    }

    public void taskThree (View view) {
        Intent intent = new Intent(this, Task1Activity.class);
        startActivity(intent);
    }
}