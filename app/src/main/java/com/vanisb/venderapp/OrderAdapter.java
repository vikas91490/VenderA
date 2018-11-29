package com.vanisb.venderapp;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

import static android.content.Intent.FLAG_ACTIVITY_NEW_TASK;

/**
 * Created by vikas on 19/11/18.
 */

public class OrderAdapter extends RecyclerView.Adapter<OrderAdapter.Holder> {

    private ArrayList<String> name;
    private ArrayList<String> address;
    //private int size;
    private ArrayList<Bitmap> img;
    private Context context;
    private String[] name1;
    private String[] address1;




    public OrderAdapter(ArrayList<String> user_name,ArrayList<String> address, ArrayList<Bitmap> img, int size) {
        this.name = user_name;
        this.address=address;
      //  this.size = size;
        this.img = img;
    }

    public OrderAdapter() {
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.recycle_order, parent, false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(final Holder holder, int position) {
       // String name1 = name.get(position);
        //String address1 = address.get(position);
       // Bitmap image = img.get(position);
       // holder.name.setText(name1[position]);
        //holder.address.setText(address1[position]);
        //holder.user_image.setImageBitmap(image);
       // int no1 = name1.length;
        //int no = address1.length;
       /* holder.yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Order Accepter", Toast.LENGTH_SHORT).show();
               // holder.yes.setClickable(false);
                //holder.yes.setBackground(context.getResources().getDrawable( R.drawable.round_button_green_accepted));
              //  holder.no.setBackground(context.getResources().getDrawable(R.drawable.round_button_red_declined));
                //holder.no.setClickable(false);
            }
        });*/


    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public ArrayList<String> getAddress() {
        return address;
    }

    public void setAddress(ArrayList<String> address) {
        this.address = address;
    }

    public ArrayList<String> getName() {
        return name;
    }

    public void setName(ArrayList<String> name) {
        this.name = name;
    }

    public ArrayList<Bitmap> getImg() {
        return img;
    }

    public void setImg(ArrayList<Bitmap> img) {
        this.img = img;
    }

    public class Holder extends RecyclerView.ViewHolder {
        TextView name;
        ImageView user_image;
         TextView address;
         Button yes,no;

        public Holder(View itemView) {
            super( itemView );
            name = itemView.findViewById(R.id.user_name);
            address=itemView.findViewById(R.id.address);
            user_image = itemView.findViewById(R.id.user_picture);
            yes=itemView.findViewById( R.id.Accepted_order );
            no=itemView.findViewById( R.id.Canceled_order );
           /* yes.setOnClickListener( new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                 Toast.makeText( context,"Hello Javatpoint",Toast.LENGTH_SHORT);
                }
            } );

            no.setOnClickListener( new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent1=new Intent( context.getApplicationContext(),Cancel_Order_freg.class );
                    intent1.addFlags(FLAG_ACTIVITY_NEW_TASK);
                    context.getApplicationContext().startActivity(intent1);

                }
            } );

*/
        }
    }




}
