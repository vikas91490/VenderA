package com.vanisb.venderapp;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by vikas on 23/11/18.
 */

public class Home_freg extends Fragment {
    private RecyclerView ordersRecyclerview;
    OrderAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate( R.layout.home_freg, container, false );

        adapter = new OrderAdapter(  );
        ordersRecyclerview = v.findViewById( R.id.orders );

        ordersRecyclerview.setLayoutManager( new LinearLayoutManager( getContext() ) );
        ordersRecyclerview.setAdapter( adapter );

        return v;

    }

    public void Order_accept(View view) {

    }
}

