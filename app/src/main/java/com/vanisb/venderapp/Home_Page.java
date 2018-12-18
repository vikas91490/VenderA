package com.vanisb.venderapp;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.MenuItem;
import android.view.View;

import java.util.Objects;

public class Home_Page extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    private DrawerLayout dl;
    private ActionBarDrawerToggle t;
    private NavigationView nv;
    Fragment fragment;
    Toolbar toolbar;
    SharedPreferences sharedPref;
    private RecyclerView ordersRecyclerview;
   OrderAdapter OrderAdapter;
    public RecyclerView.Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home__page);

        ordersRecyclerview = findViewById( R.id.orders);
        dl = findViewById(R.id.drawer_layout);
        toolbar = findViewById(R.id.nav_toolbar);
       // prefManager = new PrefManager(this);
        // sharedPref = this.getSharedPreferences(mypref, Context.MODE_PRIVATE);
        //setSupportActionBar(toolbar);
        t = new ActionBarDrawerToggle(this, dl,R.string.Open, R.string.Close);
        dl.addDrawerListener(t);
        t.syncState();


        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(Html.fromHtml("<small> Vender App </small>"));
        fragment = new Fragment();
        FragmentManager fm = getFragmentManager();
        FragmentTransaction tx = fm.beginTransaction();
        tx.replace(R.id.frame_layout, new Home_freg());
        tx.commit();

        Objects.requireNonNull( getSupportActionBar() ).setDisplayHomeAsUpEnabled(true);

        nv = findViewById(R.id.nv);
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

      /*  ordersRecyclerview.setLayoutManager( new LinearLayoutManager( this ) );
        ordersRecyclerview.setAdapter( adapter );*/







    }

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