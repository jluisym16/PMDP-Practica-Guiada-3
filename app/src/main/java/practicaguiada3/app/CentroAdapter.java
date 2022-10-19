package practicaguiada3.app;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CentroAdapter extends RecyclerView.Adapter<CentroAdapter.ViewHolder> {
    List<Centro>centros;
    public CentroAdapter (List<Centro> modelList){centros =modelList;}

    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
    View v=LayoutInflater.from(parent.getContext()).inflate(R.layout.fila, parent, false);
    return new ViewHolder(v);
    }
    public void onBindViewHolder(@NonNull ViewHolder holder, int position){
        holder.bind(centros.get(position));
    }
    public int getItemCount(){return centros.size();}

    static class ViewHolder extends RecyclerView.ViewHolder{
        private final TextView nombre;
        private final TextView direccion;
        private final ImageView imagen;

        ViewHolder(View v){
            super(v);
            nombre=v.findViewById(R.id.nombre);
            direccion=v.findViewById(R.id.direccion);
            imagen=v.findViewById(R.id.imagen);
        }
        void bind(Centro centro){
            nombre.setText(centro.getNombre());
            direccion.setText(centro.getDireccion());
            imagen.setImageResource(centro.getImagen());
        }
    }
}
