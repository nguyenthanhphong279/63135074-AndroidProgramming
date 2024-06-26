package phongnt.edu.vidu1_intents;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

    }
    //Ham dap ung su kien nhan len nut man hinh khac
    //Xu ly chuyen man hinh
    public void ChuyenManHinh(View v){
        // Tao mot doi tuong Intent
        //Tham so thu 2 cua ham tao nay, la ten Activity(man hinh)
        Intent iManHinhKhac = new Intent( this, SubActivity.class);
        //Thuc hien chuyen
        startActivity(iManHinhKhac);
    }
}