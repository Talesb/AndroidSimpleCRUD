package br.com.talesb.andoidsimplecrud;

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
    }

    public void update(View view) {
    }

    public void delete(View view) {
    }

    public void find(View view) {
    }

    public void quit(View view) {
        finish();
    }
}
