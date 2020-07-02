package com.example.androidlesson;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewChatsAdapter extends RecyclerView.Adapter<ItemChatViewHolder> {

    private List<Chat> givenListOfChats = new ArrayList<>();

    @NonNull
    @Override
    public ItemChatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View rootView = inflater.inflate(R.layout.item_chats, parent, false);
        return new ItemChatViewHolder(rootView);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemChatViewHolder holder, int position) {
        holder.bindItem(givenListOfChats.get(position));
    }

    @Override
    public int getItemCount() {
        return givenListOfChats.size();
    }

    public void submitList(List<Chat> chats) {
        this.givenListOfChats = chats;
        notifyDataSetChanged();
    }

}
