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
        List<String> l = Arrays.asList("Gustavo", "Daniel");
        RecyclerView.Adapter adapter = new NombresAdapter(l);
        rv.setAdapter(adapter);
    }
}