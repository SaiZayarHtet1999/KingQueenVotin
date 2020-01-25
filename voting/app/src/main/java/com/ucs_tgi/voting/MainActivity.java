package com.ucs_tgi.voting;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.database.DatabaseError;
import com.ucs_tgi.voting.Model.User;


public class MainActivity extends AppCompatActivity {
    //firebase
    FirebaseDatabase database;
    DatabaseReference users;

    //Declaration of android Edittext
    EditText editName, editPass;
    Button btnLogin, btnCancel;
    TextView main;
    //for error

    //for admin
    Button btnAdmin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //firebase
        database = FirebaseDatabase.getInstance();
        users = FirebaseDatabase.getInstance().getReference().child("Users");
        editName = findViewById(R.id.username_edit_text);
        editPass = findViewById(R.id.password_edit_text);
        btnLogin = findViewById(R.id.login_btn);
        btnCancel = findViewById(R.id.cancel_btn);
        main=findViewById(R.id.mainAlert);

        //to check internet connection


        //for data add;
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //for log in
                final String name = editName.getText().toString().trim();
                final String pass = editPass.getText().toString().trim();

                users.child(name).addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        if (dataSnapshot.exists()) {

                            User login = dataSnapshot.getValue(User.class);
                            assert login != null;

                            if(login.getTesterKing().equals("0")||login.getTesterQueen().equals("0")) {
                                GlobalClass globalClass=(GlobalClass)getApplicationContext();
                                if (login.getPassword().equals(pass)) {
                                    main.setText("Success LogIn");
                                    main.setTextColor(Color.rgb(0,200,50));
                                    Toast.makeText(MainActivity.this, name + " Login Success", Toast.LENGTH_SHORT).show();
                                    globalClass.setUserName(name);
                                    startActivity(new Intent(getApplicationContext(), KQUser.class));
                                } else {
                                    Toast.makeText(MainActivity.this, "Password wrong", Toast.LENGTH_SHORT).show();
                                    main.setText("Password Wrong!");
                                    main.setTextColor(Color.rgb(171,46,70));
                                }
                            }
                            else{
                                Toast.makeText(MainActivity.this, "You have Voted! So you cannot vote again,ThankYou", Toast.LENGTH_LONG).show();
                                main.setText("You have Voted! \n So you cannot vote again,ThankYou");
                                main.setTextColor(Color.rgb(171,46,70));
                            }
                        } else {
                            Toast.makeText(MainActivity.this, "User name is not registered!", Toast.LENGTH_SHORT).show();
                            main.setText("User name is \n not registered!");
                            main.setTextColor(Color.rgb(171,46,70));
                        }

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });


            }
        });


        //for btnAdmin
        btnAdmin = findViewById(R.id.admin_mode);
        btnAdmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, slider.class);
                startActivity(intent);
            }
        });
        btnAdmin.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
               Intent intent=new Intent(MainActivity.this,AdminMode.class);
               startActivity(intent);
               return true;
            }
        });
        Button button=findViewById(R.id.contact);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Contact.class);
                startActivity(intent);
            }
        });
    }


}
