package com.ucs_tgi.voting;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.ucs_tgi.voting.Model.User;

public class KQUser extends AppCompatActivity {
//declaration
    ImageView king,queen;

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
        setContentView(R.layout.activity_kquser);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        king=findViewById(R.id.kqkingUser);
        queen=findViewById(R.id.kqQueenUser);
        king.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalClass globalClass=(GlobalClass)getApplicationContext();
                final DatabaseReference users = FirebaseDatabase.getInstance().getReference().child("Users");
                final String Roll=globalClass.getUserName();

                users.child(Roll).addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        User login = dataSnapshot.getValue(User.class);
                        assert login != null;

                        if(login.getTesterKing().equals("0")) {
                            startActivity(new Intent(KQUser.this, KingUser.class));
                        }
                        else {
                            Toast.makeText(KQUser.this, "You had voted for king,so you cannot vote again,Thank You "+Roll, Toast.LENGTH_LONG).show();
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });


            }
        });

        queen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GlobalClass globalClass=(GlobalClass)getApplicationContext();
                final DatabaseReference users = FirebaseDatabase.getInstance().getReference().child("Users");
                final String Roll=globalClass.getUserName();

                users.child(Roll).addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        User login = dataSnapshot.getValue(User.class);
                        assert login != null;

                        if(login.getTesterQueen().equals("0")) {
                            startActivity(new Intent(KQUser.this, QueenUser.class));
                        }
                        else {
                            Toast.makeText(KQUser.this, "You had voted for Queen,so you cannot vote again,Thank You "+Roll, Toast.LENGTH_LONG).show();
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });

            }
        });
    }
}
