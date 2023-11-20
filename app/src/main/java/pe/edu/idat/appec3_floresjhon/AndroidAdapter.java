package pe.edu.idat.appec3_floresjhon;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import pe.edu.idat.appec3_floresjhon.databinding.ActivityListadoBinding;

public class AndroidAdapter extends RecyclerView.Adapter<AndroidAdapter.ViewHolder> {

    private ArrayList<Android> lista = new ArrayList<>();

    @NonNull
    @Override
    public AndroidAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(ActivityListadoBinding
                .inflate(LayoutInflater.from(parent.getContext())
                        ,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull AndroidAdapter.ViewHolder holder, int position) {
        final Android obAndroid = lista.get(position);
        holder.binding.ivImage.setImageResource(obAndroid.getImage());
        holder.binding.txtParadero.setText(obAndroid.getParadero());
        holder.binding.txtPasajero.setText(obAndroid.getPasajero());
        holder.binding.txtOk.setText(obAndroid.getOk());
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }

    public void setData(ArrayList<Android> data){
        lista.addAll(data);
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ActivityListadoBinding binding;
        public ViewHolder(@NonNull ActivityListadoBinding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }
    }
}
