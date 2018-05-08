package br.com.talesb.andoidsimplecrud;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import constant.UsersConstant;
import model.User;

public class DialogActivity2 extends Activity {
    Button btnokrmv;
    EditText edtnamermv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog2);
        UsersConstant.setUseraux(null);

    }

    //this class was created to facilitate the Delete/Remove action
    public void finduser(View view) {
        btnokrmv = findViewById(R.id.btnokrmv);
        edtnamermv = findViewById(R.id.edtnamermv);
        UsersConstant.setUseraux(edtnamermv.getText().toString());
        User u = UsersConstant.findByName(UsersConstant.getUseraux());
        if(u==null){
            Toast.makeText(getApplicationContext(),"User not Found!!",Toast.LENGTH_LONG).show();
        }else{
            confirmDialog();

        }




    }

    private void confirmDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder
                .setMessage("Are you sure?")
                .setPositiveButton("Yes",  new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        User u =UsersConstant.findByName(UsersConstant.getUseraux());
                        UsersConstant.delete(u);
                        finish();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog,int id) {
                        dialog.cancel();
                    }
                })
                .show();
    }

    public void cancelaction(View view) {
        finish();
    }
}

