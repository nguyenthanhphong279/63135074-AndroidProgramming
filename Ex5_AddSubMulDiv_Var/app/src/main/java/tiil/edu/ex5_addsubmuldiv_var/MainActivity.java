package tiil.edu.ex5_addsubmuldiv_var;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    //Khai báo các đối tượng tương ứng với các điều khiển view cần thao tác
    EditText edtSoA;
    EditText edtSoB;
    Button btnCong,btnTru,btnNhan,btnChia;
    TextView tvKetQua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //Tìm view
        TimView();
        //Gắn các bộ lắng nghe
        btnCong.setOnClickListener(boLangNghe_XuLyCong);
        btnTru.setOnClickListener(boLangNghe_XuLyTru);
        btnNhan.setOnClickListener(boLangNghe_XuLyNhan);
        //btnChia.setOnClickListener(boLangNghe_XuLyChia);
        //Ví dụ Bộ Lắng nghe ẩn danh
        btnChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strSo1 = edtSoA.getText().toString();
                String strSo2 = edtSoB.getText().toString();
                //b2 Chuyển thành số để tính toán
                double soA = Double.parseDouble(strSo1);
                double soB = Double.parseDouble(strSo2);
                //Tính toán
                double Tong = soA / soB;
                //b4 XUất KQ
                String strKQ = String.valueOf(Tong);
                tvKetQua.setText(strKQ );
            }
        });
    }
    //=========================================================================
    //Tạo các bộ lắng nghe và xử lý sự kiện
    View.OnClickListener boLangNghe_XuLyCong = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String strSo1 = edtSoA.getText().toString();
            String strSo2 = edtSoB.getText().toString();
            //b2 Chuyển thành số để tính toán
            double soA = Double.parseDouble(strSo1);
            double soB = Double.parseDouble(strSo2);
            //Tính toán
            double Tong = soA + soB;
            //b4 XUất KQ
            String strKQ = String.valueOf(Tong);
            tvKetQua.setText(strKQ);
        }
    };
    View.OnClickListener boLangNghe_XuLyTru = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String strSo1 = edtSoA.getText().toString();
            String strSo2 = edtSoB.getText().toString();
            //b2 Chuyển thành số để tính toán
            double soA = Double.parseDouble(strSo1);
            double soB = Double.parseDouble(strSo2);
            //Tính toán
            double Tong = soA - soB;
            //b4 XUất KQ
            String strKQ = String.valueOf(Tong);
            tvKetQua.setText(strKQ );
        }
    };
    View.OnClickListener boLangNghe_XuLyNhan = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String strSo1 = edtSoA.getText().toString();
            String strSo2 = edtSoB.getText().toString();
            //b2 Chuyển thành số để tính toán
            double soA = Double.parseDouble(strSo1);
            double soB = Double.parseDouble(strSo2);
            //Tính toán
            double Tong = soA * soB;
            //b4 XUất KQ
            String strKQ = String.valueOf(Tong);
            tvKetQua.setText(strKQ );
        }
    };

    //============================================================================
    void TimView(){
        edtSoA = (EditText) findViewById(R.id.editTextA);
        edtSoB = (EditText) findViewById(R.id.editTextB);
        btnCong = (Button) findViewById(R.id.buttonCong);
        btnTru = (Button) findViewById(R.id.buttonTru);
        btnNhan = (Button) findViewById(R.id.buttonNhan);
        btnChia = (Button) findViewById(R.id.buttonChia);
        tvKetQua = (TextView) findViewById(R.id.textViewKQ);
    }
}