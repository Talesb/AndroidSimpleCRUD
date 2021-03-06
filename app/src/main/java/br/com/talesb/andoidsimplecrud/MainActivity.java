package br.com.talesb.andoidsimplecrud;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void create(View view) {
        Intent it = new Intent(getApplicationContext(),CreateActivity.class);
        startActivityForResult(it,1);
    }

    public void update(View view) {
        Intent it = new Intent(getApplicationContext(),DialogActivity.class);
        startActivityForResult(it,1);
    }

    public void delete(View view) {
        Intent it = new Intent(getApplicationContext(),DialogActivity2.class);
        startActivityForResult(it,1);
    }

    public void find(View view) {
        Intent it = new Intent(getApplicationContext(),ListActivity.class);
        startActivityForResult(it,1);
    }

    public void quit(View view) {
        finish();
    }
}
