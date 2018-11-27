package com.vanisb.venderapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class Register extends AppCompatActivity {

    EditText Name, Email, Phone, Address, Pin, Password;
    Button Sign_Up;
    public static final String url = "";
    public static final String key_name = "name";
    public static final String key_password = "password";
    public static final String key_email = "email";
    public static final String key_phone = "phone";
    public static final String key_adress = "address";
    public static final String key_pin = "pin";

    private String name;
    private String phone;
    private String email;
    private String address;
    private String pin;
    private String password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_register );

        Password = (EditText) findViewById( R.id.password );
        Name = (EditText) findViewById( R.id.username );
        Phone = (EditText) findViewById( R.id.phone );
        Email = (EditText) findViewById( R.id.email );
        Address = (EditText) findViewById( R.id.address );
        Pin = (EditText) findViewById( R.id.pincode );
        Sign_Up = (Button) findViewById( R.id.sign_up );

        Sign_Up.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              //  Sing_up();

                Intent intent=new Intent( Register.this,Home_Page.class );
                startActivity( intent );
            }
        } );
    }

 /*  *//* private void Sing_up() {
        final String name = Name.getText().toString().trim();
        final String password = Password.getText().toString().trim();
        final String email = Email.getText().toString().trim();
        final String phone = Phone.getText().toString().trim();
        final String address = Address.getText().toString().trim();
        final String pin = Pin.getText().toString().trim();

        StringRequest stringRequest = new StringRequest( Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Toast.makeText( Register.this, response, Toast.LENGTH_LONG ).show();

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText( Register.this, error.toString(), Toast.LENGTH_LONG ).show();

            }
        } ) {

            protected Map<String, String> getPramas() {

                Map<String, String> maps = new HashMap<>();
                maps.put( key_name, name );
                maps.put( key_phone, phone );
                maps.put( key_email, email );
                maps.put( key_adress, address );
                maps.put( key_pin, pin );
                maps.put( key_password, password );

                return maps;

            }

        };
        RequestQueue requestQueue = Volley.newRequestQueue( this );
        requestQueue.add( stringRequest );*//*
    }*/

}