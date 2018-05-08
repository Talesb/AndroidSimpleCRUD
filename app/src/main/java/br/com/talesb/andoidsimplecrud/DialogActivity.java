package br.com.talesb.andoidsimplecrud;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import constant.UsersConstant;
import model.User;

public class DialogActivity extends Activity {
    Button btnok, btncancel;
    EditText edtnameup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
        UsersConstant.setUseraux(null);

    }


//this class was created to facilitate the use of class "Update Activity"
    public void finduser(View view) {
        btnok = findViewById(R.id.btnok);
        edtnameup = findViewById(R.id.edtnameup);
        UsersConstant.setUseraux(edtnameup.getText().toString());
        User u = UsersConstant.findByName(UsersConstant.getUseraux());
        if(u==null){
            Toast.makeText(getApplicationContext(),"User not Found!!",Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(getApplicationContext(),"User Found!!",Toast.LENGTH_LONG).show();
            Intent it = new Intent(getApplicationContext(),UpdateActivity.class);
            startActivityForResult(it,1);
            finish();

        }




    }

    public void cancelaction(View view) {
        finish();
    }
}


