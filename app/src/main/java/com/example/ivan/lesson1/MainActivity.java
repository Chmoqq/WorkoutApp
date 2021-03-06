package com.example.ivan.lesson1;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ivan.lesson1.Fragments.FragmentMenu;

public class MainActivity extends AppCompatActivity {
    FragmentMenu fragmentMenu;
    FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentMenu = new FragmentMenu();
        fragmentManager = getSupportFragmentManager();

        fragmentManager.beginTransaction().add(R.id.container, fragmentMenu).commit();

    }
}
