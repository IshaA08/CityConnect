/**
 * TaskTakenActivity.java
 * @author Isha Afzaal
 * CalgaryHacks 2021 Team#: 74
 * Info: Update user data stored in database when they choose to undertake a task.
 */

package com.example.cityconnect;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class TaskTakenActivity extends AppCompatActivity {

    private final String DATABASE_NAME = "projectdb";
    private final String DATABASE_PATH = "com.example.cityconnect"; // Change this variable according to your local path

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_taken);
    }

    /**
     * Interact with Local MySQL Database by first manually copying stored contents.
     * This is required because assets in Android Studio cannot directly access databases.
     * @throws IOException
     **/
    private void copyDb (View view) throws IOException {
        // Open the local database
        Context current_context = view.getContext();
        InputStream input = current_context.getAssets().open(DATABASE_NAME);

        // Open new (and empty) database by using output stream
        String out_file_path = DATABASE_PATH + DATABASE_NAME;
        OutputStream output_stream = new FileOutputStream("/data/data/com.example.cityconnect/databases/projectdb.sqlite");

        // Transfer data from original database to its copy
        byte[] byte_buffer = new byte[1024];
        int length;

        while ( (length = input.read(byte_buffer) ) > 0) {
            output_stream.write(byte_buffer, 0, length);
        }

        // Close all resources
        output_stream.flush();
        output_stream.close();
        input.close();
    }

    /**
     * interactWithDb contains code that instructs on how to access and interact with the local
     * MySQL database copied in the copyDb method.
     */
    private void interactWithDb () {
        // Specify complete database path
        String db_path = DATABASE_PATH + DATABASE_NAME;
        // Access database
        SQLiteDatabase db = SQLiteDatabase.openDatabase(db_path, null, SQLiteDatabase.OPEN_READWRITE);
    }

}