package phongnt.edu.recyclerview_examlist;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    ExamAdapter examAdapter;
    ArrayList<examData> ExamDatas;
    RecyclerView recyclerViewExam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ExamDatas = getDataForRecyclerViewExam();
        recyclerViewExam = findViewById(R.id.recyclerViewExam);
        RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(this);
        recyclerViewExam.setLayoutManager(layoutLinear);
        examAdapter = new ExamAdapter(this, ExamDatas);
        recyclerViewExam.setAdapter(examAdapter);
    }
    ArrayList<Exam> getDataForRecyclerViewExam(){
        ArrayList<Exam> dsDuLieu = new ArrayList<Exam>();
        dsDuLieu.add(new Exam("First Exam", "May 23, 2015", "Best Of Luck"));
        dsDuLieu.add(new Exam("Second Exam", "June 09, 2015", "b of l"));
        dsDuLieu.add(new Exam("My Test Exam", "April 27, 2017", "This is testing exam .."));
        return dsDuLieu;
    }
}