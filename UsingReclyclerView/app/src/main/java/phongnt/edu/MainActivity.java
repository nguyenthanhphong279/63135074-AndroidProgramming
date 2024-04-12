package phongnt.edu;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    LandScapeAdapter landScapeAdapter;
    ArrayList<LandScape> recyclerViewDatas;
    RecyclerView recyclerViewLandScape;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        //3
        recyclerViewDatas = getDataForRecycleView();
        //B4
        recyclerViewLandScape = findViewById(R.id.recyclerLand);
        //B5
        RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(this);
        recyclerViewLandScape.setLayoutManager(layoutLinear);
        //B6
        landScapeAdapter = new LandScapeAdapter(this, recyclerViewDatas);
        //B7
        recyclerViewLandScape.setAdapter(landScapeAdapter);
    }
    ArrayList<LandScape> getDataForRecycleView(){
        ArrayList<LandScape> dsDuLieu = new ArrayList<LandScape>();
        LandScape landScape1 = new LandScape("hanoi", "Ảnh Hà Nội");
        dsDuLieu.add(landScape1);
        dsDuLieu.add(new LandScape("eiffel", "Tháp Eiffel"));
        return dsDuLieu;
    }
}