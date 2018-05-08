package br.com.talesb.andoidsimplecrud;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import constant.UsersConstant;
import model.User;

public class ListActivity extends AppCompatActivity {
    ListView listvuser;
    ArrayAdapter adapter;
    ArrayList<User> users = UsersConstant.getUSERS();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        android.util.Log.d("MyApp=========","I am here"+users);
        listvuser = findViewById(R.id.userlist);
        adapter = new ArrayAdapter<User>(this,android.R.layout.simple_dropdown_item_1line,users );
        listvuser.setAdapter(adapter);

    }




}
