package com.ucs_tgi.voting;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AdminMode extends AppCompatActivity {
        Button cancelBtn,loginBtn;
        EditText name,pass;

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_mode);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        cancelBtn=findViewById(R.id.cancel_admin);
        loginBtn=findViewById(R.id.login_admin);
        name=findViewById(R.id.username_admin);
        pass=findViewById(R.id.password_admin);
        cancelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               AdminMode.this.finish();
            }
        });
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String AdminName=name.getText().toString().trim();
                String Password=pass.getText().toString().trim();
                if (TextUtils.isEmpty(AdminName)&&TextUtils.isEmpty(Password)) {
                    Toast.makeText(AdminMode.this, "Please enter Admin Name and Password", Toast.LENGTH_SHORT).show();
                }

                    else {
                        if (AdminName.equals("admin")&&Password.equals("ucst")){
                            Toast.makeText(AdminMode.this, "Welcome Admin!", Toast.LENGTH_SHORT).show();
                            Intent intent=new Intent(AdminMode.this,KQAdmin.class);
                            startActivity(intent);
                        }
                        else {
                            Toast.makeText(AdminMode.this, "Error User Name And Password!", Toast.LENGTH_SHORT).show();
                        }
                    }
                }

        });

    }
}
