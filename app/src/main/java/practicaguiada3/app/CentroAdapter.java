package practicaguiada3.app;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CentroAdapter extends RecyclerView.Adapter<CentroAdapter.Holder> {
    static class Holder extends RecyclerView.ViewHolder{
        final TextView nombre;
        public Holder(View itemView){
            super(itemView);
            nombre= itemView.findViewById(R.id.textView);
        }


            /*
             * va a declarar los atributos necesarios para hacer referencia a las vistas del recyclerView. Además recibe y asigna a esas listas los datos que le envie el adapter
             *
             */

    }
    List<String> nombres;

    public CentroAdapter(List<String> nombres) {
        this.nombres = nombres;
    }

    @NonNull
    @Override
    public CentroAdapter.Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.fila, parent, false);
        return new Holder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull CentroAdapter.Holder holder, int position) {
    //va a ser encargado de pasarle al holder correspondiente el dato que esté en una posición concreta
        holder.nombre.setText(nombres.get(position));
    }

    @Override
    public int getItemCount() {
        return nombres.size();
    }
}
