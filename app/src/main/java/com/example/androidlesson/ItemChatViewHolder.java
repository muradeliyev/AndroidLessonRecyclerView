package com.example.androidlesson;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ItemChatViewHolder extends RecyclerView.ViewHolder {

    private ImageView imageProfile;
    private TextView name;
    private TextView description;

    public ItemChatViewHolder(@NonNull View itemView) {
        super(itemView);
        imageProfile = itemView.findViewById(R.id.image_view_profile);
        name = itemView.findViewById(R.id.text_view_name);
        description = itemView.findViewById(R.id.text_view_description);
    }

    public void bindItem(Chat chatData) {
        name.setText(chatData.getName());
        description.setText(chatData.getDescription());
    }

}
