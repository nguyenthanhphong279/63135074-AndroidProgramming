package phongnt.edu.recyclerview_examlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ExamAdapter extends RecyclerView.Adapter<ExamAdapter.ExamViewHolder> {

    Context context;
    ArrayList<Exam> lstData;

    public ExamAdapter(Context context, ArrayList<Exam> lstData) {
        this.context = context;
        this.lstData = lstData;
    }

    @NonNull
    @Override
    public ExamViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View vItem = layoutInflater.inflate(R.layout.exam_item, parent, false);
        ExamViewHolder viewholderCreated = new ExamViewHolder(vItem);
        return viewholderCreated;
    }

    @Override
    public void onBindViewHolder(@NonNull ExamAdapter.ExamViewHolder holder, int position) {
        Exam examHienThi = lstData.get(position);
        String examLine1 = examHienThi.getExamLine1();
        String examLine2 = examHienThi.getExamLine2();
        String examLine3= examHienThi.getExamLine3();
        holder.txtExam1.setText(examLine1);
        holder.txtExam2.setText(examLine2);
        holder.txtExam3.setText(examLine3);
    }

    @Override
    public int getItemCount() {
        return lstData.size();
    }

    class ExamViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView txtExam1, txtExam2, txtExam3;
        public ExamViewHolder(@NonNull View itemView) {
            super(itemView);
            txtExam1 = itemView.findViewById(R.id.txtExamName);
            txtExam2 = itemView.findViewById(R.id.txtExamDate);
            txtExam3 = itemView.findViewById(R.id.txtExamMess);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {

        }
    }
}