package com.vanisb.venderapp;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.TextView;

/**
 * Created by vikas on 23/11/18.
 */

public class Home_freg extends Fragment {
    private RecyclerView ordersRecyclerview;
    Context context;
    TextView no;



    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate( R.layout.home_freg, container, false );

        ordersRecyclerview = v.findViewById(R.id.orders);
        ordersRecyclerview.setLayoutManager(new LinearLayoutManager(context));
        String[] message = new String[4];
        message[0] = "user1";
        message[1] = "user2";
        message[2] = "user3";
        message[3] = "user4";
        ordersRecyclerview.setAdapter(new OrderAdapter(getActivity(), message, no));

        /*ordersRecyclerview = v.findViewById( R.id.orders );

        ordersRecyclerview.setLayoutManager( new LinearLayoutManager( context ) );
        String[] user=new String[4];
        user[0]="user1";user[1]="user1";
        user[2]="user1";
        user[3]="user1";

        ordersRecyclerview.setAdapter( new OrderAdapter( getActivity(),user) );
        ordersRecyclerview.setAdapter( (RecyclerView.Adapter) OrderAdapter );*/
        return v;

    }




}

