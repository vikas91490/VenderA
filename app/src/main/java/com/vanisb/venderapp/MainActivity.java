package com.vanisb.venderapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText Username, Password;
    Button SignIn;
    public static final String url="";
    public static final String key_username="username";
    public static final String key_password="password";

    private String username;
    private String password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        Password=(EditText) findViewById( R.id.password );
       Username=(EditText) findViewById( R.id.username );
        findViewById(R.id.sign_in).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //userLogin();
                Intent intent=new Intent( MainActivity.this,Home_Page.class );
                startActivity( intent );
            }
        });
    }

   /* private void userLogin() {
        final String username = Username.getText().toString().trim();
        final String password = Password.getText().toString().trim();

        if (TextUtils.isEmpty(username)) {
            Username.setError("Please enter your username");
            Username.requestFocus();
            return;
        }

        if (TextUtils.isEmpty(password)) {
            Password.setError("Please enter your password");
            Password.requestFocus();
            return;
        }


        StringRequest stringRequest = new StringRequest( Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

                if (response.trim().equals( "success" )) {

                    //open next activity
                    Opennext();
                } else {

                    Toast.makeText( MainActivity.this, "error", Toast.LENGTH_LONG ).show();
                }

            }


        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {


                Toast.makeText( MainActivity.this,error.toString(),Toast.LENGTH_LONG ).show();
            }
        } )
        {

            protected Map<String,String>getPramas() {

             Map<String ,String>map=new HashMap<>();
             map.put( key_username ,username );
             map.put( key_password,password );
             return map;
             
            }

        };

        RequestQueue requestQueue = Volley.newRequestQueue( MainActivity.this );
        requestQueue.add( stringRequest );

    }

    private void Opennext() {

        Intent intent=new Intent(MainActivity.this,Register.class);
        intent.putExtra( key_username,username );
        startActivity( intent );
    }*/




}
