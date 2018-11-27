package com.vanisb.venderapp;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.DialogInterface;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.MenuItem;
import android.view.View;

public class Home_Page extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    private DrawerLayout dl;
    private ActionBarDrawerToggle t;
    private NavigationView nv;
    Fragment fragment;
    private RecyclerView ordersRecyclerview;
    OrderAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home__page);



        adapter = new OrderAdapter(  );
        ordersRecyclerview = findViewById( R.id.orders );
        dl = (DrawerLayout)findViewById(R.id.activity_main);
        t = new ActionBarDrawerToggle(this, dl,R.string.Open, R.string.Close);
        dl.addDrawerListener(t);
        t.syncState();

        fragment = new Fragment();
        FragmentManager fm = getFragmentManager();
        FragmentTransaction tx = fm.beginTransaction();
        tx.replace(R.id.frame_layout, new Home_freg());
        tx.commit();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        nv = (NavigationView)findViewById(R.id.nv);
        nv.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                switch(id)
                {

                    default:
                        return true;
                }


            }
        });

    /*    ordersRecyclerview.setLayoutManager( new LinearLayoutManager( this ) );
        ordersRecyclerview.setAdapter( adapter );*/

    }

   /* @Override
    public void onBackPressed() {
        if (fragment.equals(new Home_freg())) {

            final AlertDialog.Builder builder = new AlertDialog.Builder(getApplicationContext());
            builder.setMessage("Are you sure want to exit!");
            builder.setCancelable(true);
            builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.cancel();
                }
            });
            builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    finishAffinity();
                }
            });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
        } else
            fragment = new Home_freg();
        FragmentManager fm = getFragmentManager();
        FragmentTransaction tx = fm.beginTransaction();

        tx.replace(R.id.frame_layout, fragment);
        tx.commit();
        finishAffinity();
    }*/

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(t.onOptionsItemSelected(item))
            return true;

        return super.onOptionsItemSelected(item);
    }

    public void selectFrag(View view) {

        Fragment fr = new Home_freg();
        if (view == findViewById(R.id.home_btn)) {
            fr = new Home_freg();

        }
        if (view == findViewById(R.id.Accepted_order)) {
            fr = new Complete_Order_freg();
        }

         else if (view == findViewById(R.id.Canceled_order)) {
            fr = new Cancel_Order_freg();

        }
        else if (view == findViewById(R.id.History)) {
            fr = new History_freg();
        }

        FragmentManager fm = getFragmentManager();
        FragmentTransaction tx = fm.beginTransaction();

        tx.replace(R.id.frame_layout, fr);
        tx.commit();
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return false;
    }
}