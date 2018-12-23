package com.vanisb.venderapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Panding_pament_adapter extends RecyclerView.Adapter<Panding_pament_adapter.Holder> {


    TextView username, address;

    String username_string, address_string;
    private String[] name;
    //TextView id;
    Context context;

    public Panding_pament_adapter(Context context, String[] message, TextView id, String[] address) {
        this.name = message;
        // this.id = id;
        this.context = context;

    }



    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from( parent.getContext() );
        View view = inflater.inflate( R.layout.recycle_order, parent, false );
        return new Panding_pament_adapter.Holder( view );
    }

    @Override
    public void onBindViewHolder(final Holder holder, int position) {


        holder.name.setText( name[position] );
        int no = name.length;

        final int previous = position;






    }




    @Override
    public int getItemCount() {
        return name.length;
    }

    public class Holder extends RecyclerView.ViewHolder {
        TextView name;
      RelativeLayout layout;

        public Holder(View view) {
            super(view);
            name = itemView.findViewById(R.id.user_name);
            layout = itemView.findViewById(R.id.pending_layout);
        }
    }


}