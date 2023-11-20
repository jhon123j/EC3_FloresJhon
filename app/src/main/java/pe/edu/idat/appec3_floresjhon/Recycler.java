package pe.edu.idat.appec3_floresjhon;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import java.util.ArrayList;

import pe.edu.idat.appec3_floresjhon.databinding.ActivityListadoBinding;
import pe.edu.idat.appec3_floresjhon.databinding.ActivityMainBinding;

public class Recycler extends AppCompatActivity {

    private ActivityListadoBinding binding;
    private AndroidAdapter androidAdapter= new AndroidAdapter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityListadoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.rvlistado.setLayoutManager(new LinearLayoutManager(this));
        binding.rvlistado.setAdapter(androidAdapter);
        androidAdapter.setData(getData());
    }

    private ArrayList<Android> getData() {
        ArrayList<Android> list = new ArrayList<>();
        list.add(new Android(list.size() +1,
                R.drawable.image1,
                "Paradero 1",
                "Pasajeros: 1",
                "12/10/2020 13:30"));
        list.add(new Android(list.size() +1,
                R.drawable.image1,
                "Paradero 2",
                "Pasajeros: 2",
                "12/10/2020 13:30"));
        list.add(new Android(list.size() +1,
                R.drawable.image1,
                "Paradero 3",
                "Pasajeros: 3",
                "12/10/2020 13:30"));
        list.add(new Android(list.size() +1,
                R.drawable.image1,
                "Paradero 4",
                "Pasajeros: 4",
                "12/10/2020 13:30"));
        list.add(new Android(list.size() +1,
                R.drawable.image1,
                "Paradero 5",
                "Pasajeros: 5",
                "12/10/2020 13:30"));
        list.add(new Android(list.size() +1,
                R.drawable.image1,
                "Paradero 6",
                "Pasajeros: 6",
                "12/10/2020 13:30"));
        list.add(new Android(list.size() +1,
                R.drawable.image1,
                "Paradero 7",
                "Pasajeros: 7",
                "12/10/2020 13:30"));
        list.add(new Android(list.size() +1,
                R.drawable.image1,
                "Paradero 8",
                "Pasajeros: 8",
                "12/10/2020 13:30"));
        list.add(new Android(list.size() +1,
                R.drawable.image1,
                "Paradero 9",
                "Pasajeros: 9",
                "12/10/2020 13:30"));
        list.add(new Android(list.size() +1,
                R.drawable.image1,
                "Paradero 10",
                "Pasajeros: 10",
                "12/10/2020 13:30"));
        return list;
    }
}
