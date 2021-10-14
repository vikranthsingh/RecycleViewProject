package com.example.recyclerviewproject;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ExamViewHolder extends RecyclerView.ViewHolder {
    TextView examName;
    TextView examMessage;
    TextView examDate;

    public ExamViewHolder(@NonNull View itemView) {
        super(itemView);
        examName = itemView.findViewById(R.id.txtFirstExam);
        examDate = itemView.findViewById(R.id.txtDate);
        examMessage = itemView.findViewById(R.id.txtLuck);
    }
}

