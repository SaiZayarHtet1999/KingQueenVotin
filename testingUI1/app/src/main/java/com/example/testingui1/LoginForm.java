package com.example.testingui1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginForm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_form);
        EditText userName=findViewById(R.id.userEditText);
        EditText password=findViewById(R.id.passwordEditText);
        Button btn=findViewById(R.id.btnLoin);

        final String user1=userName.getText().toString();
        final String pass1=password.getText().toString().trim();

        final String trueUser="sai";
        final String truePass="123";
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                auth(user1,pass1);
            }
        });



        }



    private void auth(String user, String pass) {
        if (user=="sai"&& pass==("sai")){
            Toast.makeText(getApplicationContext(),"Login success!",Toast.LENGTH_LONG).show();
            Intent intent=new Intent(LoginForm.this,MainActivity.class);
            startActivity(intent);
        }else if(!(user.equals("sai") && pass.equals("sai")))
        {
            Toast.makeText(getApplicationContext(),"Login Failed!",Toast.LENGTH_LONG).show();
        }
    }
}



