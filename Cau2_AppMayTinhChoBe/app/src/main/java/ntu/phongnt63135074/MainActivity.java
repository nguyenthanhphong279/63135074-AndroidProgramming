package ntu.phongnt63135074;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText editTextSo1;
    EditText editTextSo2;
    EditText editTextKQ;
    ImageButton nutCong, nutTru, nutNhan, nutChia;


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
        TimDieuKhien();
        nutCong.setOnClickListener(boLangNghe_XuLyCong);
        nutTru.setOnClickListener(boLangNghe_XuLyTru);
    }
    void TimDieuKhien(){
        editTextSo1 = (EditText)findViewById(R.id.edtSo1);
        editTextSo2 = (EditText)findViewById(R.id.edtSo2);
        editTextKQ = (EditText)findViewById(R.id.edtKq);
        nutCong = (ImageButton)findViewById(R.id.imgbtnCong);
        nutTru = (ImageButton)findViewById(R.id.imgbtnTru);
        nutNhan = (ImageButton)findViewById(R.id.imgbtnNhan);
        nutChia = (ImageButton)findViewById(R.id.imgbtnChia);

    }

    View.OnClickListener boLangNghe_XuLyCong = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String strSo1 = editTextSo1.getText().toString();
            String strSo2 = editTextSo2.getText().toString();
            double so1 = Double.parseDouble(strSo1);
            double so2 = Double.parseDouble(strSo2);
            double Tong = so1 + so2;
            String strKQ = String.valueOf(Tong);
            editTextKQ.setText(strKQ);
        }
    };

    View.OnClickListener boLangNghe_XuLyTru = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String strSo1 = editTextSo1.getText().toString();
            String strSo2 = editTextSo2.getText().toString();
            double so1 = Double.parseDouble(strSo1);
            double so2 = Double.parseDouble(strSo2);
            double Hieu = so1 - so2;
            String strKQ = String.valueOf(Hieu);
            editTextKQ.setText(strKQ);
        }
    };
}