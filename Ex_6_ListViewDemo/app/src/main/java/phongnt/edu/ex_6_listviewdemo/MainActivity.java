package phongnt.edu.ex_6_listviewdemo;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> dsTenTinhThanhVN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Hiển thị dữ liệu lên listView
        //B1: Cần có dữ liệu
        //ArrayList<String> dsTenTinhThanhVN; //Khai báo
        dsTenTinhThanhVN = new ArrayList<>(); //Tạo thể hiện cụ thể, xin mới
        //Thêm dữ liệu
        dsTenTinhThanhVN.add("Hà Nội");
        dsTenTinhThanhVN.add("Thành phố Hồ Chí Minh");
        dsTenTinhThanhVN.add("Đồng Nai");
        dsTenTinhThanhVN.add("Bình Thuận");
        dsTenTinhThanhVN.add("Ninh Thuận");
        dsTenTinhThanhVN.add("Nha Trang");
        dsTenTinhThanhVN.add("Tiền Giang");

        //B2: Tạo adapter
        ArrayAdapter<String> adapterTinhThanh;
        adapterTinhThanh = new ArrayAdapter<String>(this,
                                                    android.R.layout.simple_list_item_1,
                                                    dsTenTinhThanhVN);

        //B3 Gắn vào điều kiện hiển thị ListView
        //3.1 Tìm
        ListView lvTenTinhThanh = findViewById(R.id.lvDanhSachTT);
        //Gắn
        lvTenTinhThanh.setAdapter(adapterTinhThanh);
        //3.3 Lắng nghe và xử lí sự kiện User tương tác
        //Gắn bộ lắng nghe vào
        lvTenTinhThanh.setOnItemClickListener(BoLangNghevaXL);
    }
    //Tạo bộ lắng nghe và xử lí sự kiện OnItemClick, đặt vào một biến
    AdapterView.OnItemClickListener BoLangNghevaXL = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            //Code xử lý
            //i là vị trí phần tử vừa được click
            //Hiện lên màn hình một thông báo nhanh về vị trí của phần tử vừa chọn
            ////Lấy giá trị của phần tử thứ i
            String strTenTinhChon = dsTenTinhThanhVN.get(i);
            Toast.makeText(MainActivity.this, "Bạn vừa chọn: "+String.valueOf(i), Toast.LENGTH_LONG).show();
            //Toast.makeText(MainActivity.this,strTenTinhChon, Toast.LENGTH_LONG).show();

        }
    };
}