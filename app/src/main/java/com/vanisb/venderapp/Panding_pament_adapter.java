package com.vanisb.venderapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Panding_pament_adapter extends RecyclerView.Adapter<Panding_pament_adapter.Holder> {

    TextView username, address;
   // DataBaseHelper3 databaseHelper3;
    //String username_string, address_string;
    private String[] name;
    //TextView id;
    Context context;

    public Panding_pament_adapter(Context context, String[] message, TextView id) {
        this.name = message;
        // this.id = id;
        this.context = context;
    }


    public Panding_pament_adapter(Pending_Payments pending_payments, ArrayList<GetSet> data, int size) {
    }

    @NonNull
    @Override
    public Panding_pament_adapter.Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.pending__payments, parent, false);
        return new Panding_pament_adapter.Holder(view);
    }

    @Override
    public void onBindViewHolder(final Panding_pament_adapter.Holder holder, int position) {


        holder.name.setText(name[position]);
      int no = name.length;
       // final int previous = position;





    }

   /* private void send_data_volley() {



    }*/




    @Override
    public int getItemCount() {
        return name.length;
    }

    public class Holder extends RecyclerView.ViewHolder {
        TextView name;
        RelativeLayout notification_layout;


        public Holder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.user_name);
            notification_layout = itemView.findViewById(R.id.pending);




        }
    }




/*
    private void send_data() {

        username_string = username.getText().toString();
        address_string = address.getText().toString();



        boolean b = databaseHelper3.addData(username_string, address_string);
        if (b) {
            Toast.makeText(context, "Success", Toast.LENGTH_SHORT).show();
            username.setText("");
            address.setText("");

        } else
            Toast.makeText(context, "not Success", Toast.LENGTH_SHORT).show();
    }
*/


}




























/*extends RecyclerView.Adapter<Panding_pament_adapter.Holder> {


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

    public Panding_pament_adapter( String[] message, TextView id,String[] address) {

    }

    public Panding_pament_adapter(Pending_Payments pending_payments, String[] message, TextView no) {
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


}*/