package com.ucs_tgi.voting;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.crowdfire.cfalertdialog.CFAlertDialog;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.shreyaspatil.MaterialDialog.BottomSheetMaterialDialog;
import com.shreyaspatil.MaterialDialog.MaterialDialog;
import com.shreyaspatil.MaterialDialog.interfaces.OnCancelListener;
import com.shreyaspatil.MaterialDialog.interfaces.OnDismissListener;
import com.shreyaspatil.MaterialDialog.interfaces.OnShowListener;


public class KingUser extends AppCompatActivity implements View.OnClickListener, OnShowListener, OnCancelListener, OnDismissListener {
    //declaration
    Button king1, king2,king3,king4,king5,king6,king7,king8,king9,king10,king11,king12;
    ScrollView scrollView;
    CardView cardView1;

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
        setContentView(R.layout.activity_king_user);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        king1=findViewById(R.id.king1Vote);
        king2=findViewById(R.id.king2Vote);
        king3=findViewById(R.id.king3Vote);
        king4=findViewById(R.id.king4Vote);
        king5=findViewById(R.id.king5Vote);
        king6=findViewById(R.id.king6Vote);
        king7=findViewById(R.id.king7Vote);
        king8=findViewById(R.id.king8Vote);
        king9=findViewById(R.id.king9Vote);
        king10=findViewById(R.id.king10Vote);
        king11=findViewById(R.id.king11Vote);
        king12=findViewById(R.id.king12Vote);
        scrollView=findViewById(R.id.scrollKing);
        cardView1=findViewById(R.id.cardKing1);

        king1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CFAlertDialog.Builder builder = new CFAlertDialog.Builder(KingUser.this)
                        .setDialogStyle(CFAlertDialog.CFAlertStyle.ALERT)
                        .setTitle("Sure?")
                        .setTextGravity(Gravity.CENTER)
                        .setHeaderView(R.layout.header_for_dialog)
                        .setMessage("Are you sure you want to vote king-1 ?")
                        .addButton("Vote", Color.rgb(255,255,255), Color.rgb(255,191,0), CFAlertDialog.CFAlertActionStyle.POSITIVE, CFAlertDialog.CFAlertActionAlignment.JUSTIFIED, (dialog, which) -> {
                            GlobalClass globalClass=(GlobalClass)getApplicationContext() ;
                                //firebase logics here
                               DatabaseReference rootRef = FirebaseDatabase.getInstance().getReference().child("Users");
                               String Roll=globalClass.getUserName();
                                rootRef.child(Roll).child("kingID").setValue("1");
                                rootRef.child(Roll).child("testerKing").setValue("1");
                                Toast.makeText(KingUser.this, "You voted King 1", Toast.LENGTH_SHORT).show();

                                finish();
                            dialog.dismiss();
                        })
                        .addButton("Cancel", Color.rgb(255,191,0), Color.rgb(255,255,255), CFAlertDialog.CFAlertActionStyle.DEFAULT, CFAlertDialog.CFAlertActionAlignment.JUSTIFIED, (dialog, which) -> {
                            dialog.dismiss();
                        });
// Show the alert
                builder.show();
            }
        });


        king2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CFAlertDialog.Builder builder = new CFAlertDialog.Builder(KingUser.this)
                        .setDialogStyle(CFAlertDialog.CFAlertStyle.ALERT)
                        .setTitle("Sure?")
                        .setHeaderView(R.layout.header_for_dialog)
                        .setTextGravity(Gravity.CENTER)
                        .setMessage("Are you sure you want to vote king-2 ?")
                        .addButton("Vote", Color.rgb(255,255,255), Color.rgb(255,191,0), CFAlertDialog.CFAlertActionStyle.POSITIVE, CFAlertDialog.CFAlertActionAlignment.JUSTIFIED, (dialog, which) -> {
                            GlobalClass globalClass=(GlobalClass)getApplicationContext() ;
                            //firebase logics here
                            DatabaseReference rootRef = FirebaseDatabase.getInstance().getReference().child("Users");
                            String Roll=globalClass.getUserName();
                            rootRef.child(Roll).child("kingID").setValue("2");
                            rootRef.child(Roll).child("testerKing").setValue("1");
                            Toast.makeText(KingUser.this, "You voted King 2", Toast.LENGTH_SHORT).show();

                            finish();
                            dialog.dismiss();
                        })
                        .addButton("Cancel", Color.rgb(255,191,0), Color.rgb(255,255,255), CFAlertDialog.CFAlertActionStyle.DEFAULT, CFAlertDialog.CFAlertActionAlignment.JUSTIFIED, (dialog, which) -> {
                            dialog.dismiss();
                        });
                // Show the alert
                builder.show();
            }
        });
        king3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CFAlertDialog.Builder builder = new CFAlertDialog.Builder(KingUser.this)
                        .setDialogStyle(CFAlertDialog.CFAlertStyle.ALERT)
                        .setTitle("Sure?")
                        .setTextGravity(Gravity.CENTER)
                        .setHeaderView(R.layout.header_for_dialog)
                        .setMessage("Are you sure you want to vote king-3 ?")
                        .addButton("Vote", Color.rgb(255,255,255), Color.rgb(255,191,0), CFAlertDialog.CFAlertActionStyle.POSITIVE, CFAlertDialog.CFAlertActionAlignment.JUSTIFIED, (dialog, which) -> {
                            GlobalClass globalClass=(GlobalClass)getApplicationContext() ;
                            //firebase logics here
                            DatabaseReference rootRef = FirebaseDatabase.getInstance().getReference().child("Users");
                            String Roll=globalClass.getUserName();
                            rootRef.child(Roll).child("kingID").setValue("3");
                            rootRef.child(Roll).child("testerKing").setValue("1");
                            Toast.makeText(KingUser.this, "You voted King 3", Toast.LENGTH_SHORT).show();

                            finish();
                            dialog.dismiss();
                        })
                        .addButton("Cancel", Color.rgb(255,191,0), Color.rgb(255,255,255), CFAlertDialog.CFAlertActionStyle.DEFAULT, CFAlertDialog.CFAlertActionAlignment.JUSTIFIED, (dialog, which) -> {
                            dialog.dismiss();
                        });
// Show the alert
                builder.show();
            }
        });
        king4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CFAlertDialog.Builder builder = new CFAlertDialog.Builder(KingUser.this)
                        .setDialogStyle(CFAlertDialog.CFAlertStyle.ALERT)
                        .setTitle("Sure?")
                        .setTextGravity(Gravity.CENTER)
                        .setHeaderView(R.layout.header_for_dialog)
                        .setMessage("Are you sure you want to vote king-4 ?")
                        .addButton("Vote", Color.rgb(255,255,255), Color.rgb(255,191,0), CFAlertDialog.CFAlertActionStyle.POSITIVE, CFAlertDialog.CFAlertActionAlignment.JUSTIFIED, (dialog, which) -> {
                            GlobalClass globalClass=(GlobalClass)getApplicationContext() ;
                            //firebase logics here
                            DatabaseReference rootRef = FirebaseDatabase.getInstance().getReference().child("Users");
                            String Roll=globalClass.getUserName();
                            rootRef.child(Roll).child("kingID").setValue("4");
                            rootRef.child(Roll).child("testerKing").setValue("1");
                            Toast.makeText(KingUser.this, "You voted King 4", Toast.LENGTH_SHORT).show();

                            finish();
                            dialog.dismiss();
                        })
                        .addButton("Cancel", Color.rgb(255,191,0), Color.rgb(255,255,255), CFAlertDialog.CFAlertActionStyle.DEFAULT, CFAlertDialog.CFAlertActionAlignment.JUSTIFIED, (dialog, which) -> {
                            dialog.dismiss();
                        });
// Show the alert
                builder.show();
            }
        });
        king5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CFAlertDialog.Builder builder = new CFAlertDialog.Builder(KingUser.this)
                        .setDialogStyle(CFAlertDialog.CFAlertStyle.ALERT)
                        .setTitle("Sure?")
                        .setTextGravity(Gravity.CENTER)
                        .setHeaderView(R.layout.header_for_dialog)
                        .setMessage("Are you sure you want to vote king-5 ?")
                        .addButton("Vote", Color.rgb(255,255,255), Color.rgb(255,191,0), CFAlertDialog.CFAlertActionStyle.POSITIVE, CFAlertDialog.CFAlertActionAlignment.JUSTIFIED, (dialog, which) -> {
                            GlobalClass globalClass=(GlobalClass)getApplicationContext() ;
                            //firebase logics here
                            DatabaseReference rootRef = FirebaseDatabase.getInstance().getReference().child("Users");
                            String Roll=globalClass.getUserName();
                            rootRef.child(Roll).child("kingID").setValue("5");
                            rootRef.child(Roll).child("testerKing").setValue("1");
                            Toast.makeText(KingUser.this, "You voted King 5", Toast.LENGTH_SHORT).show();

                            finish();
                            dialog.dismiss();
                        })
                        .addButton("Cancel", Color.rgb(255,191,0), Color.rgb(255,255,255), CFAlertDialog.CFAlertActionStyle.DEFAULT, CFAlertDialog.CFAlertActionAlignment.JUSTIFIED, (dialog, which) -> {
                            dialog.dismiss();
                        });
// Show the alert
                builder.show();
            }
        });
        king6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CFAlertDialog.Builder builder = new CFAlertDialog.Builder(KingUser.this)
                        .setDialogStyle(CFAlertDialog.CFAlertStyle.ALERT)
                        .setTitle("Sure?")
                        .setTextGravity(Gravity.CENTER)
                        .setHeaderView(R.layout.header_for_dialog)
                        .setMessage("Are you sure you want to vote king-6 ?")
                        .addButton("Vote", Color.rgb(255,255,255), Color.rgb(255,191,0), CFAlertDialog.CFAlertActionStyle.POSITIVE, CFAlertDialog.CFAlertActionAlignment.JUSTIFIED, (dialog, which) -> {
                            GlobalClass globalClass=(GlobalClass)getApplicationContext() ;
                            //firebase logics here
                            DatabaseReference rootRef = FirebaseDatabase.getInstance().getReference().child("Users");
                            String Roll=globalClass.getUserName();
                            rootRef.child(Roll).child("kingID").setValue("6");
                            rootRef.child(Roll).child("testerKing").setValue("1");
                            Toast.makeText(KingUser.this, "You voted King 6", Toast.LENGTH_SHORT).show();

                            finish();
                            dialog.dismiss();
                        })
                        .addButton("Cancel", Color.rgb(255,191,0), Color.rgb(255,255,255), CFAlertDialog.CFAlertActionStyle.DEFAULT, CFAlertDialog.CFAlertActionAlignment.JUSTIFIED, (dialog, which) -> {
                            dialog.dismiss();
                        });
// Show the alert
                builder.show();
            }
        });

        king7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CFAlertDialog.Builder builder = new CFAlertDialog.Builder(KingUser.this)
                        .setDialogStyle(CFAlertDialog.CFAlertStyle.ALERT)
                        .setTitle("Sure?")
                        .setTextGravity(Gravity.CENTER)
                        .setHeaderView(R.layout.header_for_dialog)
                        .setMessage("Are you sure you want to vote king-7 ?")
                        .addButton("Vote", Color.rgb(255,255,255), Color.rgb(255,191,0), CFAlertDialog.CFAlertActionStyle.POSITIVE, CFAlertDialog.CFAlertActionAlignment.JUSTIFIED, (dialog, which) -> {
                            GlobalClass globalClass=(GlobalClass)getApplicationContext() ;
                            //firebase logics here
                            DatabaseReference rootRef = FirebaseDatabase.getInstance().getReference().child("Users");
                            String Roll=globalClass.getUserName();
                            rootRef.child(Roll).child("kingID").setValue("7");
                            rootRef.child(Roll).child("testerKing").setValue("1");
                            Toast.makeText(KingUser.this, "You voted King 7", Toast.LENGTH_SHORT).show();

                            finish();
                            dialog.dismiss();
                        })
                        .addButton("Cancel", Color.rgb(255,191,0), Color.rgb(255,255,255), CFAlertDialog.CFAlertActionStyle.DEFAULT, CFAlertDialog.CFAlertActionAlignment.JUSTIFIED, (dialog, which) -> {
                            dialog.dismiss();
                        });
// Show the alert
                builder.show();
            }
        });

        king8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CFAlertDialog.Builder builder = new CFAlertDialog.Builder(KingUser.this)
                        .setDialogStyle(CFAlertDialog.CFAlertStyle.ALERT)
                        .setTitle("Sure?")
                        .setTextGravity(Gravity.CENTER)
                        .setHeaderView(R.layout.header_for_dialog)
                        .setMessage("Are you sure you want to vote king-8 ?")
                        .addButton("Vote", Color.rgb(255,255,255), Color.rgb(255,191,0), CFAlertDialog.CFAlertActionStyle.POSITIVE, CFAlertDialog.CFAlertActionAlignment.JUSTIFIED, (dialog, which) -> {
                            GlobalClass globalClass=(GlobalClass)getApplicationContext() ;
                            //firebase logics here
                            DatabaseReference rootRef = FirebaseDatabase.getInstance().getReference().child("Users");
                            String Roll=globalClass.getUserName();
                            rootRef.child(Roll).child("kingID").setValue("8");
                            rootRef.child(Roll).child("testerKing").setValue("1");
                            Toast.makeText(KingUser.this, "You voted King 8", Toast.LENGTH_SHORT).show();

                            finish();
                            dialog.dismiss();
                        })
                        .addButton("Cancel", Color.rgb(255,191,0), Color.rgb(255,255,255), CFAlertDialog.CFAlertActionStyle.DEFAULT, CFAlertDialog.CFAlertActionAlignment.JUSTIFIED, (dialog, which) -> {
                            dialog.dismiss();
                        });
// Show the alert
                builder.show();
            }
        });
        king9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CFAlertDialog.Builder builder = new CFAlertDialog.Builder(KingUser.this)
                        .setDialogStyle(CFAlertDialog.CFAlertStyle.ALERT)
                        .setTitle("Sure?")
                        .setTextGravity(Gravity.CENTER)
                        .setHeaderView(R.layout.header_for_dialog)
                        .setMessage("Are you sure you want to vote king-9 ?")
                        .addButton("Vote", Color.rgb(255,255,255), Color.rgb(255,191,0), CFAlertDialog.CFAlertActionStyle.POSITIVE, CFAlertDialog.CFAlertActionAlignment.JUSTIFIED, (dialog, which) -> {
                            GlobalClass globalClass=(GlobalClass)getApplicationContext() ;
                            //firebase logics here
                            DatabaseReference rootRef = FirebaseDatabase.getInstance().getReference().child("Users");
                            String Roll=globalClass.getUserName();
                            rootRef.child(Roll).child("kingID").setValue("9");
                            rootRef.child(Roll).child("testerKing").setValue("1");
                            Toast.makeText(KingUser.this, "You voted King 9", Toast.LENGTH_SHORT).show();

                            finish();
                            dialog.dismiss();
                        })
                        .addButton("Cancel", Color.rgb(255,191,0), Color.rgb(255,255,255), CFAlertDialog.CFAlertActionStyle.DEFAULT, CFAlertDialog.CFAlertActionAlignment.JUSTIFIED, (dialog, which) -> {
                            dialog.dismiss();
                        });
// Show the alert
                builder.show();
            }
        });
        king10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CFAlertDialog.Builder builder = new CFAlertDialog.Builder(KingUser.this)
                        .setDialogStyle(CFAlertDialog.CFAlertStyle.ALERT)
                        .setTitle("Sure?")
                        .setTextGravity(Gravity.CENTER)
                        .setHeaderView(R.layout.header_for_dialog)
                        .setMessage("Are you sure you want to vote king-10 ?")
                        .addButton("Vote", Color.rgb(255,255,255), Color.rgb(255,191,0), CFAlertDialog.CFAlertActionStyle.POSITIVE, CFAlertDialog.CFAlertActionAlignment.JUSTIFIED, (dialog, which) -> {
                            GlobalClass globalClass=(GlobalClass)getApplicationContext() ;
                            //firebase logics here
                            DatabaseReference rootRef = FirebaseDatabase.getInstance().getReference().child("Users");
                            String Roll=globalClass.getUserName();
                            rootRef.child(Roll).child("kingID").setValue("10");
                            rootRef.child(Roll).child("testerKing").setValue("1");
                            Toast.makeText(KingUser.this, "You voted King 10", Toast.LENGTH_SHORT).show();

                            finish();
                            dialog.dismiss();
                        })
                        .addButton("Cancel", Color.rgb(255,191,0), Color.rgb(255,255,255), CFAlertDialog.CFAlertActionStyle.DEFAULT, CFAlertDialog.CFAlertActionAlignment.JUSTIFIED, (dialog, which) -> {
                            dialog.dismiss();
                        });
// Show the alert
                builder.show();
            }
        });king11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CFAlertDialog.Builder builder = new CFAlertDialog.Builder(KingUser.this)
                        .setDialogStyle(CFAlertDialog.CFAlertStyle.ALERT)
                        .setTitle("Sure?")
                        .setTextGravity(Gravity.CENTER)
                        .setHeaderView(R.layout.header_for_dialog)
                        .setMessage("Are you sure you want to vote king-11 ?")
                        .addButton("Vote", Color.rgb(255,255,255), Color.rgb(255,191,0), CFAlertDialog.CFAlertActionStyle.POSITIVE, CFAlertDialog.CFAlertActionAlignment.JUSTIFIED, (dialog, which) -> {
                            GlobalClass globalClass=(GlobalClass)getApplicationContext() ;
                            //firebase logics here
                            DatabaseReference rootRef = FirebaseDatabase.getInstance().getReference().child("Users");
                            String Roll=globalClass.getUserName();
                            rootRef.child(Roll).child("kingID").setValue("11");
                            rootRef.child(Roll).child("testerKing").setValue("1");
                            Toast.makeText(KingUser.this, "You voted King 11", Toast.LENGTH_SHORT).show();

                            finish();
                            dialog.dismiss();
                        })
                        .addButton("Cancel", Color.rgb(255,191,0), Color.rgb(255,255,255), CFAlertDialog.CFAlertActionStyle.DEFAULT, CFAlertDialog.CFAlertActionAlignment.JUSTIFIED, (dialog, which) -> {
                            dialog.dismiss();
                        });
// Show the alert
                builder.show();
            }
        });
        king12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CFAlertDialog.Builder builder = new CFAlertDialog.Builder(KingUser.this)
                        .setDialogStyle(CFAlertDialog.CFAlertStyle.ALERT)
                        .setTitle("Sure?")
                        .setTextGravity(Gravity.CENTER)
                        .setHeaderView(R.layout.header_for_dialog)
                        .setMessage("Are you sure you want to vote king-12 ?")
                        .addButton("Vote", Color.rgb(255,255,255), Color.rgb(255,191,0), CFAlertDialog.CFAlertActionStyle.POSITIVE, CFAlertDialog.CFAlertActionAlignment.JUSTIFIED, (dialog, which) -> {
                            GlobalClass globalClass=(GlobalClass)getApplicationContext() ;
                            //firebase logics here
                            DatabaseReference rootRef = FirebaseDatabase.getInstance().getReference().child("Users");
                            String Roll=globalClass.getUserName();
                            rootRef.child(Roll).child("kingID").setValue("12");
                            rootRef.child(Roll).child("testerKing").setValue("1");
                            Toast.makeText(KingUser.this, "You voted King 12", Toast.LENGTH_SHORT).show();

                            finish();
                            dialog.dismiss();
                        })
                        .addButton("Cancel", Color.rgb(255,191,0), Color.rgb(255,255,255), CFAlertDialog.CFAlertActionStyle.DEFAULT, CFAlertDialog.CFAlertActionAlignment.JUSTIFIED, (dialog, which) -> {
                            dialog.dismiss();
                        });
// Show the alert
                builder.show();
            }
        });







    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public void onCancel(com.shreyaspatil.MaterialDialog.interfaces.DialogInterface dialogInterface) {

    }

    @Override
    public void onDismiss(com.shreyaspatil.MaterialDialog.interfaces.DialogInterface dialogInterface) {

    }

    @Override
    public void onShow(com.shreyaspatil.MaterialDialog.interfaces.DialogInterface dialogInterface) {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
