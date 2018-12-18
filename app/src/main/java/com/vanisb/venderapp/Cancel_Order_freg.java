package com.vanisb.venderapp;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by vikas on 23/11/18.
 */



public class Cancel_Order_freg extends Fragment {
    DataBaseHelper3 databaseHelper3;
    RecyclerView programmingList;
    String user_name = "", address = "";
    OrderAdapter adapter = null;
    SwipeRefreshLayout swipe;
    ArrayList<GetSet> data;
    public View onCreateView(LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate( R.layout.concel_order_frag, container, false );
       // databaseHelper3 = new DataBaseHelper3(Context );
        //fetchData();
        return v;
    }

   /* public void fetchData() {
        Cursor result = databaseHelper3();

        if (result == null) {
            data.clear();
            adapter = new OrderAdapter(this, data, data.size());
            programmingList.setAdapter(adapter);

        } else {
            while (result.moveToNext()) {
                user_name = result.getString(0);
                address = result.getString(1);




                GetSet p = new GetSet( user_name, address );
                data.add(p);
                adapter = new Oder(this, data, data.size());
                programmingList.setAdapter(adapter);

            }
        }
    }*/



}
