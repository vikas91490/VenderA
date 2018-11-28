package com.vanisb.venderapp;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static android.content.Intent.FLAG_ACTIVITY_NEW_TASK;

/**
 * Created by vikas on 27/11/18.
 */

public class Bill_download_adapter extends RecyclerView.Adapter<Bill_download_adapter.Holder> {

    private ArrayList<String> name;
    private ArrayList<String> address;
    //private int size;
    private ArrayList<Bitmap> img;
    private Context context;


    public Bill_download_adapter(ArrayList<String> user_name,ArrayList<String> address, ArrayList<Bitmap> img, int size) {
        this.name = user_name;
        this.address=address;
        //  this.size = size;
        this.img = img;
    }

    public Bill_download_adapter() {
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.recycle_order, parent, false);
        return new Bill_download_adapter.Holder(view);
    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {
        /*String name1 = name.get(position);
        String address1 = address.get(position);
        Bitmap image = img.get(position);
        holder.name.setText(name1);
        holder.address.setText(address1);
        holder.user_image.setImageBitmap(image);*/

    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public class Holder extends RecyclerView.ViewHolder {
        TextView name;
        ImageView user_image;
        TextView address;
        Button downloadbill;

        public Holder(View itemView) {
            super( itemView );
            name = itemView.findViewById(R.id.user_name);
            address=itemView.findViewById(R.id.address);
            user_image = itemView.findViewById(R.id.user_picture);
            downloadbill=itemView.findViewById( R.id.Accepted_order );

            downloadbill.setOnClickListener( new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent=new Intent( context.getApplicationContext(),Complete_Order_freg.class );
                    intent.addFlags(FLAG_ACTIVITY_NEW_TASK);
                    context.getApplicationContext().startActivity(intent);
                }
            } );



        }
    }




}
