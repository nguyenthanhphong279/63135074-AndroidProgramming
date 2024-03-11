package phongnt.edu.ex_6cong_listviewthemxoasua;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> dsBH;
        dsBH = new ArrayList<String>();
        dsBH.add("Mogu Mogu Yummy");
        dsBH.add("Doggy Street");
        dsBH.add("Error");
        dsBH.add("Aqua-iro Pallete");
        dsBH.add("Nekokaburi-na");

        ArrayAdapter<String> adapterBH;
        adapterBH = new ArrayAdapter<String>(this,
                                             android.R.layout.simple_list_item_1,
                                             dsBH);
        //B4
        ListView lvBaiHat = findViewById(R.id.lvLoiBaiHatYeuThich);
        lvBaiHat.setAdapter(adapterBH);

    }
}