package com.gdgcampinas.chat_firebase;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.ViewHolder> {

    private List<Chat> mDataSet;
    private String mId;


    ChatAdapter(List<Chat> dataSet) {
        mDataSet = dataSet;
//        mId = id;
    }

    @Override
    public ChatAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;

        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_rider, parent, false);

        return new ViewHolder(view);
    }



    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Chat chat = mDataSet.get(position);
        holder.firstnameTextView.setText(chat.getFirstname());
        holder.lastnameTextView.setText(chat.getLastname());
    }
    @Override
    public int getItemCount() {

        return mDataSet.size();
    }

    /**
     * Inner Class for a recycler view
     */
    class ViewHolder extends RecyclerView.ViewHolder {
        TextView firstnameTextView;
        TextView lastnameTextView;

        ViewHolder(View v) {
            super(v);
            firstnameTextView = (TextView) itemView.findViewById(R.id.firstnameTextView);
            lastnameTextView = (TextView) itemView.findViewById(R.id.lastnameTextView);
        }
    }
}
