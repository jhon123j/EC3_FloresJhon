package pe.edu.idat.appec3_floresjhon;

import android.view.View;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import pe.edu.idat.appec3_floresjhon.databinding.ActivityUbicarBinding;

public class Ubicar implements View.OnClickListener{

    private ActivityUbicarBinding binding;

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnBuscar) {
            realizarBusqueda();
        }
    }

    private boolean realizarBusqueda() {
        String nombre = binding.txtNombre.getText().toString().trim();
        String fechaInicio = binding.txtInicio.getText().toString().trim();
        String fechaFin = binding.txtFin.getText().toString().trim();

        if (nombre.isEmpty() || fechaInicio.isEmpty() || fechaFin.isEmpty()) {
            Toast.makeText(this, "Por favor, completa todos los campos", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }
}
