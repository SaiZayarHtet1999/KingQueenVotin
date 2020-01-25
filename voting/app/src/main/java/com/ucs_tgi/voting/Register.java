package com.ucs_tgi.voting;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.database.DatabaseError;
import com.ucs_tgi.voting.Model.User;

public class Register extends AppCompatActivity {
    //declaration
    EditText name_reg,pass_reg;
    Button btn_reg,btn_cancel;

    //firebase
    FirebaseDatabase database;
    DatabaseReference users;

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
        setContentView(R.layout.activity_register);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        database = FirebaseDatabase.getInstance();
        users = FirebaseDatabase.getInstance().getReference().child("Users");

        name_reg=findViewById(R.id.username_register);
        pass_reg=findViewById(R.id.password_Register);
        btn_cancel=findViewById(R.id.cancel_btn_Register);
        btn_reg=findViewById(R.id.register_btn);
        btn_reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final User user=new User(
                        name_reg.getText().toString(),
                        pass_reg.getText().toString(),
                        "0",
                        "0",
                        "0",
                        "0");
                users.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        if(dataSnapshot.child(user.getUserName()).exists()){
                            Toast.makeText(Register.this,"Roll No is exist,Try Again!",Toast.LENGTH_SHORT).show();
                        }
                            else {
                                users.child(user.getUserName()).setValue(user);
                                Toast.makeText(Register.this,"Successful Registration",Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {
                        Toast.makeText(Register.this,databaseError+" plz contact to admin team ",Toast.LENGTH_LONG).show();
                    }
                });


            }
        });

    }
}
