package practicaguiada3.app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView rv = findViewById(R.id.recyclerView);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this));
        List<Centro> l = Arrays.asList(
                new Centro ("IES Doctor Fleming", "Doctor Fleming 7, Oviedo", R.mipmap.ic_launcher),
                new Centro ("IES Monte Naranco", "Calle de Oviedo", R.mipmap.ic_launcher),
                new Centro ("CIFP Avilés", "Calle en Avilés", R.mipmap.ic_launcher)
        );
        RecyclerView.Adapter adapter = new CentroAdapter(l);
        rv.setAdapter(adapter);
    }
}