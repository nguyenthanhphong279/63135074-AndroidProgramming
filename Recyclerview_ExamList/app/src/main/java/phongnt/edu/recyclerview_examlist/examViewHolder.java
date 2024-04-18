package phongnt.edu.recyclerview_examlist;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class examViewHolder
        extends RecyclerView.ViewHolder {
    TextView examName;
    TextView examMessage;
    TextView examDate;
    View view;

    examViewHolder(View itemView) {
        super(itemView);
        examName
                = (TextView) itemView
                .findViewById(R.id.txtExamName);
        examDate
                = (TextView) itemView
                .findViewById(R.id.txtExamDate);
        examMessage
                = (TextView) itemView
                .findViewById(R.id.txtExamMess);
        view = itemView;
    }
}
