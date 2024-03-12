package phongnt.edu.ex_6cong_listviewthemxoasua;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> dsBH;
    ArrayAdapter<String> adapterBH;
    Button btnThem,btnSua,btnXoa;
    ListView lvBaiHat;
    EditText edtBaiHat;

    int ViTri = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnThem = (Button)findViewById(R.id.btnThem);
        btnSua = (Button)findViewById(R.id.btnSua);
        btnXoa = (Button)findViewById(R.id.btnXoa);
        edtBaiHat = (EditText)findViewById(R.id.edtBaiHat);
        dsBH = new ArrayList<String>();
        dsBH.add("Mogu Mogu Yummy");
        dsBH.add("Doggy Street");
        dsBH.add("Error");
        dsBH.add("Aqua-iro Pallete");
        dsBH.add("Nekokaburi-na");

        adapterBH = new ArrayAdapter<String>(this,
                                             android.R.layout.simple_list_item_1,
                                             dsBH);

        ListView lvBaiHat = findViewById(R.id.lvLoiBaiHatYeuThich);
        lvBaiHat.setAdapter(adapterBH);
        lvBaiHat.setOnItemClickListener(BoLangNghevaXL);

        // button
        ThemPhanTu();
        SuaPhanTu();
        XoaPhanTu();

    }
    AdapterView.OnItemClickListener BoLangNghevaXL = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            String strTenBHChon = dsBH.get(i);
            //Toast.makeText(MainActivity.this, "Bạn vừa chọn: "+String.valueOf(i), Toast.LENGTH_LONG).show();
            Toast.makeText(MainActivity.this,strTenBHChon, Toast.LENGTH_LONG).show();
        }
    };
    //Thêm
    public void ThemPhanTu(){
        btnThem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String baiHat = edtBaiHat.getText().toString();
                dsBH.add(baiHat);
                adapterBH.notifyDataSetChanged();
            }
        });
    }
    //Xóa
    public void XoaPhanTu() {
        lvBaiHat.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                edtBaiHat.setText(dsBH.get(position));
                ViTri = position;
            }
        });
        btnXoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dsBH.remove(ViTri);
                adapterBH.notifyDataSetChanged();
            }
        });
    }
    //Sửa
    public void SuaPhanTu(){
        lvBaiHat.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                edtBaiHat.setText(dsBH.get(position));
                ViTri = position;
            }
        });
        btnSua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dsBH.set(ViTri, edtBaiHat.getText().toString());
                adapterBH.notifyDataSetChanged();
            }
        });
    }
}