package com.vanisb.venderapp;

import android.annotation.SuppressLint;
import android.app.Fragment;
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


public class History_freg extends Fragment {
    DataBaseHelper3 databaseHelper3;
    RecyclerView programmingList;
    String user_name = "", address = "";
    OrderAdapter adapter = null;
    SwipeRefreshLayout swipe;
    ArrayList<GetSet> data;

    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate( R.layout.history_frag, container, false );
        databaseHelper3 = new DataBaseHelper3(getContext() );
        //fetchData();

        return v;
    }

    /*public void fetchData() {
        Cursor result = databaseHelper3.getData();

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
                adapter = new OrderAdapter( this, data, data.size() ) {

                };
                programmingList.setAdapter(adapter);

            }
        }
    }*/
}
