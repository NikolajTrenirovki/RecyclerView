package com.semenov.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_View);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Car> cars  = new ArrayList<Car>();

        cars.add(new Car(R.drawable.car_1, "какая-то машина"));
        cars.add(new Car(R.drawable.car_2, "другая машина"));
        cars.add(new Car(R.drawable.car_3, "ещё какая-то машина"));
        cars.add(new Car(R.drawable.car_4, "последняя машина"));

        CarAdapter carAdapter = new CarAdapter(cars);

        recyclerView.setAdapter(carAdapter);
    }
}