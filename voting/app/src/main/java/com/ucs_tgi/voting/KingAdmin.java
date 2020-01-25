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

public class KingAdmin extends AppCompatActivity {
    //declaration

    TextView king1Count,king2Count,king3Count,king4Count,
            king5Count,king6Count,king7Count,king8Count,
            king11Count,king12Count,
            king9Count,king10Count,kingNoCount;


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
        setContentView(R.layout.activity_king_admin);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        king1Count=findViewById(R.id.king1Count);
        king2Count=findViewById(R.id.king2Count);
        king3Count=findViewById(R.id.king3Count);
        king4Count=findViewById(R.id.king4Count);
        king5Count=findViewById(R.id.king5Count);
        king6Count=findViewById(R.id.king6Count);
        king7Count=findViewById(R.id.king7Count);
        king8Count=findViewById(R.id.king8Count);
        king9Count=findViewById(R.id.king9Count);
        king10Count=findViewById(R.id.king10Count);
        king11Count=findViewById(R.id.king11Count);
        king12Count=findViewById(R.id.king12Count);
        kingNoCount=findViewById(R.id.NokingCount);
        DatabaseReference rootRef = FirebaseDatabase.getInstance().getReference().child("Users");

        //for king 1
        final Query query1 = rootRef.orderByChild("kingID").equalTo("1");
        ValueEventListener valueEventListener1 = new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                int count1 = (int) dataSnapshot.getChildrenCount();
                king1Count.setText("King1 vote = " + count1);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        };
        query1.addListenerForSingleValueEvent(valueEventListener1);
        //for king 2
        final Query query2 = rootRef.orderByChild("kingID").equalTo("2");
        ValueEventListener valueEventListener2 = new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                int count2 = (int) dataSnapshot.getChildrenCount();
                king2Count.setText("King2 vote = " + count2);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        };
        query2.addListenerForSingleValueEvent(valueEventListener2);
        //for king 3
        final Query query3 = rootRef.orderByChild("kingID").equalTo("3");
        ValueEventListener valueEventListener3 = new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                int count3 = (int) dataSnapshot.getChildrenCount();
                king3Count.setText("King 3 vote = " + count3);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        };
        query3.addListenerForSingleValueEvent(valueEventListener3);
        //for king 4
        final Query query4 = rootRef.orderByChild("kingID").equalTo("4");
        ValueEventListener valueEventListener4 = new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                int count4 = (int) dataSnapshot.getChildrenCount();
                king4Count.setText("King 4 vote = " + count4);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        };
        query4.addListenerForSingleValueEvent(valueEventListener4);
        //for king 5
        final Query query5 = rootRef.orderByChild("kingID").equalTo("5");
        ValueEventListener valueEventListener5 = new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                int count5 = (int) dataSnapshot.getChildrenCount();
                king5Count.setText("King5 vote = " + count5);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        };
        query5.addListenerForSingleValueEvent(valueEventListener5);
        //for king 6
        final Query query6 = rootRef.orderByChild("kingID").equalTo("6");
        ValueEventListener valueEventListener6 = new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                int count6 = (int) dataSnapshot.getChildrenCount();
                king6Count.setText("King6 vote = " + count6);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        };
        query6.addListenerForSingleValueEvent(valueEventListener6);
        //for king 7
        final Query query7 = rootRef.orderByChild("kingID").equalTo("7");
        ValueEventListener valueEventListener7 = new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                int count7 = (int) dataSnapshot.getChildrenCount();
                king7Count.setText("King7 vote = " + count7);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        };
        query7.addListenerForSingleValueEvent(valueEventListener7);
        //for king 8
        final Query query8 = rootRef.orderByChild("kingID").equalTo("8");
        ValueEventListener valueEventListener8 = new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                int count8 = (int) dataSnapshot.getChildrenCount();
                king8Count.setText("King8 vote = " + count8);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        };
        query8.addListenerForSingleValueEvent(valueEventListener8);
        //for king 9
        final Query query9 = rootRef.orderByChild("kingID").equalTo("9");
        ValueEventListener valueEventListener9 = new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                int count9 = (int) dataSnapshot.getChildrenCount();
                king9Count.setText("King9 vote = " + count9);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        };
        query9.addListenerForSingleValueEvent(valueEventListener9);
        //for king 10
        final Query query10 = rootRef.orderByChild("kingID").equalTo("10");
        ValueEventListener valueEventListener10 = new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                int count10 = (int) dataSnapshot.getChildrenCount();
                king10Count.setText("King10 vote = " + count10);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        };
        query10.addListenerForSingleValueEvent(valueEventListener10);
        //for king 10
        final Query query11 = rootRef.orderByChild("kingID").equalTo("11");
        ValueEventListener valueEventListener11 = new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                int count11 = (int) dataSnapshot.getChildrenCount();
                king11Count.setText("King11 vote = " + count11);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        };
        query11.addListenerForSingleValueEvent(valueEventListener11);
//for king 12
        final Query query12 = rootRef.orderByChild("kingID").equalTo("12");
        ValueEventListener valueEventListener12 = new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                int count12 = (int) dataSnapshot.getChildrenCount();
                king12Count.setText("King12 vote = " + count12);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        };
        query12.addListenerForSingleValueEvent(valueEventListener12);




        //for king NO voTE
        final Query query0 = rootRef.orderByChild("kingID").equalTo("0");
        ValueEventListener valueEventListener0 = new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                int count0 = (int) dataSnapshot.getChildrenCount();
               kingNoCount.setText("no of user left to vote = " + count0);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
        };
        query0.addListenerForSingleValueEvent(valueEventListener0);

    }
}
