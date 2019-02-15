package fr.wildcodeschool.mymenu.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.Arrays;
import java.util.List;

import fr.wildcodeschool.mymenu.R;
import fr.wildcodeschool.mymenu.adapters.FoodAdapter;
import fr.wildcodeschool.mymenu.models.Food;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Food burger = new Food("Burger", 8.);
        Food fries = new Food("Fries", 1.5);
        Food sunday = new Food("Sunday", 2.);
        Food soda = new Food("Soda", 1.);

        List<Food> menu = Arrays.asList(burger, fries, sunday, soda);

        ListView listMenu = findViewById(R.id.listMenu);
        FoodAdapter adapter = new FoodAdapter(MainActivity.this, menu);
        listMenu.setAdapter(adapter);
    }
}
