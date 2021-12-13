package com.example.mvogue;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    TextView tvItem;
    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        tvItem=itemView.findViewById(R.id.tvItem);
    }
}
