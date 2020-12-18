package com.pandai.pengingattugas;

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

    public void CheckMyTaskView(View view){
        Intent main_i = new Intent(this, CheckMyTask.class);
        startActivity(main_i);
    }

    public void openAddModifyTask(View view) {
        startActivity(new Intent(this, AddModifyTask.class));
    }
}