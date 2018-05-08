package br.com.talesb.andoidsimplecrud;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import constant.UsersConstant;
import model.User;

public class UpdateActivity extends AppCompatActivity {

    EditText edtnameup2 ;
    EditText edtemailup ;
    EditText edtcpfup ;
    Button b1up;
    User u ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);
        u = UsersConstant.findByName(UsersConstant.getUseraux());
        edtnameup2= findViewById(R.id.edtnameup2);
        edtemailup= findViewById(R.id.edtemailup);
        edtcpfup= findViewById(R.id.edtcpfup);


        edtnameup2.setText(u.getName());
        edtemailup.setText(u.getEmail());
        edtcpfup.setText(u.getCpf());

    }


    public void save(View view) {
        b1up = findViewById(R.id.btnup);
        b1up.setBackgroundDrawable(getResources().getDrawable(R.drawable.ic_check_box_black_24dp2));

        u.setName(edtnameup2.getText().toString());
        u.setEmail(edtemailup.getText().toString());
        u.setCpf(edtcpfup.getText().toString());
        UsersConstant.update(u);
        Toast.makeText(getApplicationContext(),"Sucess!!",Toast.LENGTH_LONG).show();
        finish();
    }
}
