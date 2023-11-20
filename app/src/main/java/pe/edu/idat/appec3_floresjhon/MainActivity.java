package pe.edu.idat.appec3_floresjhon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

import pe.edu.idat.appec3_floresjhon.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btnAcceso.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnAcceso) {
            String nombreUsuario = binding.txtEmail.getText().toString().trim();
            String contrasena = binding.txtPassword.getText().toString().trim();

            if (nombreUsuario.equals("jhon") && contrasena.equals("SYS123")) {
                Intent intent = new Intent(MainActivity.this, Ubicar.class);
                startActivity(intent);
            } else {
                Toast.makeText(this, "Credenciales incorrectas", Toast.LENGTH_SHORT).show();
            }
        }
    }
}