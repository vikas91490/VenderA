package com.vanisb.venderapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

public class Pending_Payments extends AppCompatActivity {
    private RecyclerView pending_recycle;
    Context context;
    TextView no;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.pending__payments );
        pending_recycle = findViewById(R.id.pending_recycle);
        pending_recycle.setLayoutManager(new LinearLayoutManager(context));
        String[] message = new String[4];
        message[0] = "user1";
        message[1] = "user2";
        message[2] = "user3";
        message[3] = "user4";
        pending_recycle.setAdapter(new OrderAdapter(this, message, no));



    }
}
