package br.com.talesb.andoidsimplecrud;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import constant.UsersConstant;
import model.User;

public class CreateActivity extends AppCompatActivity {

    EditText edtname ;
    EditText edtemail ;
    EditText edtcpf ;
    Button b1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);


    }

    public void save(View view){
        //Changing button color on click
        b1 = findViewById(R.id.buttoncreate);
        b1.setBackgroundDrawable(getResources().getDrawable(R.drawable.ic_check_box_black_24dp2));

        //Saving User on constant USERS
        edtname= findViewById(R.id.edtname);
        edtemail = findViewById(R.id.edtemail);
        edtcpf=  findViewById(R.id.edtcpf);
        String name = edtname.getText().toString();
        String email = edtemail.getText().toString();
        String cpf =edtcpf.getText().toString();
        User u = new User(null,name,email,cpf);
        UsersConstant.save(u);
        Toast.makeText(getApplicationContext(),"Sucess!!",Toast.LENGTH_LONG).show();
        finish();
    }
}
