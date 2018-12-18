package com.vanisb.venderapp;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by vikas on 19/11/18.
 */

public class OrderAdapter extends RecyclerView.Adapter<OrderAdapter.Holder> {

    TextView username, address;
    DataBaseHelper3 databaseHelper3;
    String username_string, address_string;
    private String[] name;
    //TextView id;
    Context context;

    public OrderAdapter(Context context, String[] message, TextView id) {
        this.name = message;
       // this.id = id;
        this.context = context;
    }

    public OrderAdapter(Cancel_Order_freg cancel_order_freg, ArrayList<GetSet> data, int size) {
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.recycle_order, parent, false);
        return new OrderAdapter.Holder(view);
    }

    @Override
    public void onBindViewHolder(final OrderAdapter.Holder holder, int position) {


        holder.name.setText(name[position]);
        int no = name.length;

        final int previous = position;

        //.setText(no+"");


        holder.accept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Order Accepter", Toast.LENGTH_SHORT).show();
                holder.accept.setClickable(false);
                holder.accept.setVisibility( View.GONE );
                holder.decline.setVisibility( View.GONE );
                holder.complete.setVisibility( View.VISIBLE );
                holder.decline.setClickable(false);
                send_data();
            }
        });

        holder.decline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Order Declined", Toast.LENGTH_SHORT).show();
                holder.decline.setClickable(false);
                holder.accept.setVisibility( View.GONE );
                holder.decline.setVisibility( View.GONE );
                holder.accept.setClickable(false);

                send_data();
            }
        });
    }



    @Override
    public int getItemCount() {
        return name.length;
    }

    public class Holder extends RecyclerView.ViewHolder {
        TextView name;
        RelativeLayout notification_layout;
        Button accept, decline,complete;

        public Holder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.user_name);
            notification_layout = itemView.findViewById(R.id.rel_layout);
            accept = itemView.findViewById(R.id.Accepted_order);
            decline = itemView.findViewById(R.id.Decline);
            complete = itemView.findViewById(R.id.complete_order);

        }
    }




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


}




































   /* private String[] name;
    TextView user_name;
    Context context;


    public OrderAdapter(Context context, String[] name) {
        this.name = name;
        this.context = context;
    }


    @Override
    public OrderAdapter.Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from( parent.getContext() );
        View view = inflater.inflate( R.layout.recycle_order, parent, false );
        return new OrderAdapter.Holder( view );
    }

    @Override
    public void onBindViewHolder(final OrderAdapter.Holder holder, int position) {
        holder.name.setText( name[position] );
        final int no = name.length;
        user_name.setText( no + "" );
        holder.accept.setVisibility( View.VISIBLE );


        *//*holder.accept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // String name=TextView
                Toast.makeText(context, "Order Accepter", Toast.LENGTH_SHORT).show();
                holder.accept.setVisibility( View.GONE );
                holder.decline.setVisibility( View.GONE );
                holder.complete_order.setVisibility(View.VISIBLE);
                Intent intent=new Intent( context,History_freg.class);
                intent.putExtra("textViewText", user_name.getText().toString());
                context.startActivity( intent );


            }
        });

        holder.decline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Order Accepter", Toast.LENGTH_SHORT).show();
Intent intent=new Intent( context,History_freg.class );
context.startActivity( intent );

            }
        });
        holder.complete_order.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent( context,Complete_Order_freg.class );
                context.startActivity( intent );
            }
        } );*//*


    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class Holder extends RecyclerView.ViewHolder {
        TextView name;
        Button accept, decline, complete_order;

        public Holder(View itemView) {
            super( itemView );
            name = itemView.findViewById( R.id.name );
            accept = itemView.findViewById( R.id.Accepted_order );
            decline = itemView.findViewById( R.id.Canceled_order );
            complete_order = itemView.findViewById( R.id.Canceled_order );

        }
    }
}*/




