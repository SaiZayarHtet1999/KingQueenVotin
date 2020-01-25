package com.ucs_tgi.voting;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;


public class QueenAdmin extends AppCompatActivity {
    TextView queen1Count,queen2Count,queen3Count,queen4Count,
            queen5Count,queen6Count,queen7Count,queen8Count,
    queen11Count,queen12Count,
            queen9Count,queen10Count,queenNoCount;
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
        setContentView(R.layout.activity_queen_admin);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        queen1Count=findViewById(R.id.queen1Count);
        queen2Count=findViewById(R.id.queen2Count);
        queen3Count=findViewById(R.id.queen3Count);
        queen4Count=findViewById(R.id.queen4Count);
        queen5Count=findViewById(R.id.queen5Count);
        queen6Count=findViewById(R.id.queen6Count);
        queen7Count=findViewById(R.id.queen7Count);
        queen8Count=findViewById(R.id.queen8Count);
        queen9Count=findViewById(R.id.queen9Count);
        queen10Count=findViewById(R.id.queen10Count);
        queen11Count=findViewById(R.id.queen11Count);
        queenNoCount=findViewById(R.id.NoqueenCount);
        DatabaseReference rootRef = FirebaseDatabase.getInstance().getReference().child("Users");
        //for queen 1
        final Query query1 = rootRef.orderByChild("queenID").equalTo("1");
        ValueEventListener valueEventListener1 = new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                int count1 = (int) dataSnapshot.getChildrenCount();
                queen1Count.setText("queen1 vote = " + count1);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        };
        query1.addListenerForSingleValueEvent(valueEventListener1);

        //for queen 2
        final Query query2 = rootRef.orderByChild("queenID").equalTo("2");
        ValueEventListener valueEventListener2 = new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                int count2 = (int) dataSnapshot.getChildrenCount();
                queen2Count.setText("queen2 vote = " + count2);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        };
        query2.addListenerForSingleValueEvent(valueEventListener2);
        //for queen 3
        final Query query3 = rootRef.orderByChild("queenID").equalTo("3");
        ValueEventListener valueEventListener3 = new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                int count3 = (int) dataSnapshot.getChildrenCount();
                queen3Count.setText("queen 3 vote = " + count3);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        };
        query3.addListenerForSingleValueEvent(valueEventListener3);
        //for queen 4
        final Query query4 = rootRef.orderByChild("queenID").equalTo("4");
        ValueEventListener valueEventListener4 = new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                int count4 = (int) dataSnapshot.getChildrenCount();
                queen4Count.setText("queen 4 vote = " + count4);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        };
        query4.addListenerForSingleValueEvent(valueEventListener4);
        //for queen 5
        final Query query5 = rootRef.orderByChild("queenID").equalTo("5");
        ValueEventListener valueEventListener5 = new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                int count5 = (int) dataSnapshot.getChildrenCount();
                queen5Count.setText("queen5 vote = " + count5);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        };
        query5.addListenerForSingleValueEvent(valueEventListener5);
        //for queen 6
        final Query query6 = rootRef.orderByChild("queenID").equalTo("6");
        ValueEventListener valueEventListener6 = new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                int count6 = (int) dataSnapshot.getChildrenCount();
                queen6Count.setText("queen6 vote = " + count6);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        };
        query6.addListenerForSingleValueEvent(valueEventListener6);
        //for queen 7
        final Query query7 = rootRef.orderByChild("queenID").equalTo("7");
        ValueEventListener valueEventListener7 = new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                int count7 = (int) dataSnapshot.getChildrenCount();
                queen7Count.setText("queen7 vote = " + count7);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        };
        query7.addListenerForSingleValueEvent(valueEventListener7);
        //for queen 8
        final Query query8 = rootRef.orderByChild("queenID").equalTo("8");
        ValueEventListener valueEventListener8 = new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                int count8 = (int) dataSnapshot.getChildrenCount();
                queen8Count.setText("queen8 vote = " + count8);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        };
        query8.addListenerForSingleValueEvent(valueEventListener8);
        //for queen 9
        final Query query9 = rootRef.orderByChild("queenID").equalTo("9");
        ValueEventListener valueEventListener9 = new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                int count9 = (int) dataSnapshot.getChildrenCount();
                queen9Count.setText("queen9 vote = " + count9);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        };
        query9.addListenerForSingleValueEvent(valueEventListener9);
        //for queen 10
        final Query query10 = rootRef.orderByChild("queenID").equalTo("10");
        ValueEventListener valueEventListener10 = new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                int count10 = (int) dataSnapshot.getChildrenCount();
                queen10Count.setText("queen10 vote = " + count10);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        };
        query10.addListenerForSingleValueEvent(valueEventListener10);
        //for queen 11
        final Query query11 = rootRef.orderByChild("queenID").equalTo("11");
        ValueEventListener valueEventListener11 = new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                int count11 = (int) dataSnapshot.getChildrenCount();
                queen11Count.setText("queen11 vote = " + count11);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        };
        query11.addListenerForSingleValueEvent(valueEventListener11);

        //for queen NO voTE
        final Query query0 = rootRef.orderByChild("queenID").equalTo("0");
        ValueEventListener valueEventListener0 = new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                int count0 = (int) dataSnapshot.getChildrenCount();
                queenNoCount.setText("no of user left to vote = " + count0);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        };
        query0.addListenerForSingleValueEvent(valueEventListener0);

    }
    }

