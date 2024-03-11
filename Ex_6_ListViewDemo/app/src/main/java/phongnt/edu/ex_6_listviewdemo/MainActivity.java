package phongnt.edu.ex_6_listviewdemo;

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

        //Hiển thị dữ liệu lên listView
        //B1: Cần có dữ liệu
        ArrayList<String> dsTenTinhThanhVN; //Khai báo
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
    }
}