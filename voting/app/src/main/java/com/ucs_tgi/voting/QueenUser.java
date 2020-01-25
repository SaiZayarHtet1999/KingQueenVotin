package com.ucs_tgi.voting;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.crowdfire.cfalertdialog.CFAlertDialog;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class QueenUser extends AppCompatActivity {
//declaration
Button queen1,queen2,queen3,queen4,queen5,queen6,queen7,queen8,queen9,queen10,queen11,queen12;
      Button queen1more,queen2more,queen3more,queen4more,queen5more,queen6more,queen7more
              ,queen8more,queen9more,queen10more,queen11more;
      Dialog dialog1more,dialog2more,dialog3more,dialog4more,dialog5more,dialog6more
              ,dialog7more,dialog8more,dialog9more,dialog10more,dialog11more,dialog12more;

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
        setContentView(R.layout.activity_queen_user);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        queen1=findViewById(R.id.queen1Vote);

        dialog1more=new Dialog(this);
        dialog2more=new Dialog(this);
        dialog3more=new Dialog(this);
        dialog4more=new Dialog(this);
        dialog5more=new Dialog(this);
        dialog6more=new Dialog(this);
        dialog7more=new Dialog(this);
        dialog8more=new Dialog(this);
        dialog9more=new Dialog(this);
        dialog10more=new Dialog(this);
        dialog11more=new Dialog(this);
        dialog12more=new Dialog(this);


        queen1=findViewById(R.id.queen1Vote);
        queen2=findViewById(R.id.queen2Vote);
        queen3=findViewById(R.id.queen3Vote);
        queen4=findViewById(R.id.queen4Vote);
        queen5=findViewById(R.id.queen5Vote);
        queen6=findViewById(R.id.queen6Vote);
        queen7=findViewById(R.id.queen7Vote);
        queen8=findViewById(R.id.queen8Vote);
        queen9=findViewById(R.id.queen9Vote);
        queen10=findViewById(R.id.queen10Vote);
        queen11=findViewById(R.id.queen11Vote);

        queen1more=findViewById(R.id.queen1more);
        queen2more=findViewById(R.id.queen2more);
        queen3more=findViewById(R.id.queen3more);
        queen4more=findViewById(R.id.queen4more);
        queen5more=findViewById(R.id.queen5more);
        queen6more=findViewById(R.id.queen6more);
        queen7more=findViewById(R.id.queen7more);
        queen8more=findViewById(R.id.queen8more);
        queen9more=findViewById(R.id.queen9more);
        queen10more=findViewById(R.id.queen10more);
        queen11more=findViewById(R.id.queen11more);

        queen1more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog1more.setContentView(R.layout.queen1more);
                Button txtClose=dialog1more.findViewById(R.id.txtCloseQueen1);
                txtClose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog1more.dismiss();
                    }
                });
               dialog1more.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog1more.show();
            }
        });
        queen2more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog2more.setContentView(R.layout.queen2more);
                Button txtClose=dialog2more.findViewById(R.id.txtCloseQueen2);
                txtClose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog2more.dismiss();
                    }
                });
                dialog2more.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog2more.show();
            }
        });
        queen3more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog3more.setContentView(R.layout.queen3more);
                Button txtClose=dialog3more.findViewById(R.id.txtCloseQueen3);
                txtClose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog3more.dismiss();
                    }
                });
                dialog3more.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog3more.show();
            }
        });
        queen4more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog4more.setContentView(R.layout.queen4more);
                Button txtClose=dialog4more.findViewById(R.id.txtCloseQueen4);
                txtClose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog4more.dismiss();
                    }
                });
                dialog4more.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog4more.show();
            }
        });
        queen5more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog5more.setContentView(R.layout.queen5more);
                Button txtClose=dialog5more.findViewById(R.id.txtCloseQueen5);
                txtClose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog5more.dismiss();
                    }
                });
                dialog5more.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog5more.show();
            }
        });
        queen6more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog6more.setContentView(R.layout.queen6more);
                Button txtClose=dialog6more.findViewById(R.id.txtCloseQueen6);
                txtClose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog6more.dismiss();
                    }
                });
                dialog6more.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog6more.show();
            }
        });
        queen7more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog7more.setContentView(R.layout.queen7more);
                Button txtClose=dialog7more.findViewById(R.id.txtCloseQueen7);
                txtClose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog7more.dismiss();
                    }
                });
                dialog7more.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog7more.show();
            }
        });
        queen8more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog8more.setContentView(R.layout.queen8more);
                Button txtClose=dialog8more.findViewById(R.id.txtCloseQueen8);
                txtClose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog8more.dismiss();
                    }
                });
                dialog8more.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog8more.show();
            }
        });
        queen9more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog9more.setContentView(R.layout.queen9more);
                Button txtClose=dialog9more.findViewById(R.id.txtCloseQueen9);
                txtClose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog9more.dismiss();
                    }
                });
                dialog9more.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog9more.show();
            }
        });
        queen10more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog10more.setContentView(R.layout.queen10more);
                Button txtClose=dialog10more.findViewById(R.id.txtCloseQueen10);
                txtClose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog10more.dismiss();
                    }
                });
                dialog10more.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog10more.show();
            }
        });
        queen11more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog11more.setContentView(R.layout.queen11more);
                Button txtClose=dialog11more.findViewById(R.id.txtCloseQueen11);
                txtClose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog11more.dismiss();
                    }
                });
                dialog11more.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog11more.show();
            }
        });






        queen1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CFAlertDialog.Builder builder = new CFAlertDialog.Builder(QueenUser.this)
                        .setDialogStyle(CFAlertDialog.CFAlertStyle.ALERT)
                        .setTitle("Sure?")
                        .setTextGravity(Gravity.CENTER)
                        .setHeaderView(R.layout.header_for_dialog)
                        .setMessage("Are you sure you want to vote queen-1 ?")
                        .addButton("Vote", Color.rgb(255,255,255), Color.rgb(255,191,0), CFAlertDialog.CFAlertActionStyle.POSITIVE, CFAlertDialog.CFAlertActionAlignment.JUSTIFIED, (dialog, which) -> {
                            GlobalClass globalClass=(GlobalClass)getApplicationContext() ;
                            //firebase logics here
                            DatabaseReference rootRef = FirebaseDatabase.getInstance().getReference().child("Users");
                            String Roll=globalClass.getUserName();
                            rootRef.child(Roll).child("queenID").setValue("1");
                            rootRef.child(Roll).child("testerQueen").setValue("1");
                            Toast.makeText(QueenUser.this, "You voted queen 1", Toast.LENGTH_SHORT).show();

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


        queen2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CFAlertDialog.Builder builder = new CFAlertDialog.Builder(QueenUser.this)
                        .setDialogStyle(CFAlertDialog.CFAlertStyle.ALERT)
                        .setTitle("Sure?")
                        .setTextGravity(Gravity.CENTER)
                        .setHeaderView(R.layout.header_for_dialog)
                        .setMessage("Are you sure you want to vote queen-2 ?")
                        .addButton("Vote", Color.rgb(255,255,255), Color.rgb(255,191,0), CFAlertDialog.CFAlertActionStyle.POSITIVE, CFAlertDialog.CFAlertActionAlignment.JUSTIFIED, (dialog, which) -> {
                            GlobalClass globalClass=(GlobalClass)getApplicationContext() ;
                            //firebase logics here
                            DatabaseReference rootRef = FirebaseDatabase.getInstance().getReference().child("Users");
                            String Roll=globalClass.getUserName();
                            rootRef.child(Roll).child("queenID").setValue("2");
                            rootRef.child(Roll).child("testerQueen").setValue("1");
                            Toast.makeText(QueenUser.this, "You voted queen 2", Toast.LENGTH_SHORT).show();

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
        queen3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CFAlertDialog.Builder builder = new CFAlertDialog.Builder(QueenUser.this)
                        .setDialogStyle(CFAlertDialog.CFAlertStyle.ALERT)
                        .setTitle("Sure?")
                        .setTextGravity(Gravity.CENTER)
                        .setHeaderView(R.layout.header_for_dialog)
                        .setMessage("Are you sure you want to vote queen-3 ?")
                        .addButton("Vote", Color.rgb(255,255,255), Color.rgb(255,191,0), CFAlertDialog.CFAlertActionStyle.POSITIVE, CFAlertDialog.CFAlertActionAlignment.JUSTIFIED, (dialog, which) -> {
                            GlobalClass globalClass=(GlobalClass)getApplicationContext() ;
                            //firebase logics here
                            DatabaseReference rootRef = FirebaseDatabase.getInstance().getReference().child("Users");
                            String Roll=globalClass.getUserName();
                            rootRef.child(Roll).child("queenID").setValue("3");
                            rootRef.child(Roll).child("testerQueen").setValue("1");
                            Toast.makeText(QueenUser.this, "You voted queen 3", Toast.LENGTH_SHORT).show();

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
        queen4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CFAlertDialog.Builder builder = new CFAlertDialog.Builder(QueenUser.this)
                        .setDialogStyle(CFAlertDialog.CFAlertStyle.ALERT)
                        .setTitle("Sure?")
                        .setTextGravity(Gravity.CENTER)
                        .setHeaderView(R.layout.header_for_dialog)
                        .setMessage("Are you sure you want to vote queen-4 ?")
                        .addButton("Vote", Color.rgb(255,255,255), Color.rgb(255,191,0), CFAlertDialog.CFAlertActionStyle.POSITIVE, CFAlertDialog.CFAlertActionAlignment.JUSTIFIED, (dialog, which) -> {
                            GlobalClass globalClass=(GlobalClass)getApplicationContext() ;
                            //firebase logics here
                            DatabaseReference rootRef = FirebaseDatabase.getInstance().getReference().child("Users");
                            String Roll=globalClass.getUserName();
                            rootRef.child(Roll).child("queenID").setValue("4");
                            rootRef.child(Roll).child("testerQueen").setValue("1");
                            Toast.makeText(QueenUser.this, "You voted queen 4", Toast.LENGTH_SHORT).show();

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
        queen5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CFAlertDialog.Builder builder = new CFAlertDialog.Builder(QueenUser.this)
                        .setDialogStyle(CFAlertDialog.CFAlertStyle.ALERT)
                        .setTitle("Sure?")
                        .setTextGravity(Gravity.CENTER)
                        .setHeaderView(R.layout.header_for_dialog)
                        .setMessage("Are you sure you want to vote queen-5 ?")
                        .addButton("Vote", Color.rgb(255,255,255), Color.rgb(255,191,0), CFAlertDialog.CFAlertActionStyle.POSITIVE, CFAlertDialog.CFAlertActionAlignment.JUSTIFIED, (dialog, which) -> {
                            GlobalClass globalClass=(GlobalClass)getApplicationContext() ;
                            //firebase logics here
                            DatabaseReference rootRef = FirebaseDatabase.getInstance().getReference().child("Users");
                            String Roll=globalClass.getUserName();
                            rootRef.child(Roll).child("queenID").setValue("5");
                            rootRef.child(Roll).child("testerQueen").setValue("1");
                            Toast.makeText(QueenUser.this, "You voted queen 5", Toast.LENGTH_SHORT).show();

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
        queen6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CFAlertDialog.Builder builder = new CFAlertDialog.Builder(QueenUser.this)
                        .setDialogStyle(CFAlertDialog.CFAlertStyle.ALERT)
                        .setTitle("Sure?")
                        .setTextGravity(Gravity.CENTER)
                        .setHeaderView(R.layout.header_for_dialog)
                        .setMessage("Are you sure you want to vote queen-6 ?")
                        .addButton("Vote", Color.rgb(255,255,255), Color.rgb(255,191,0), CFAlertDialog.CFAlertActionStyle.POSITIVE, CFAlertDialog.CFAlertActionAlignment.JUSTIFIED, (dialog, which) -> {
                            GlobalClass globalClass=(GlobalClass)getApplicationContext() ;
                            //firebase logics here
                            DatabaseReference rootRef = FirebaseDatabase.getInstance().getReference().child("Users");
                            String Roll=globalClass.getUserName();
                            rootRef.child(Roll).child("queenID").setValue("6");
                            rootRef.child(Roll).child("testerQueen").setValue("1");
                            Toast.makeText(QueenUser.this, "You voted queen 6", Toast.LENGTH_SHORT).show();

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

        queen7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CFAlertDialog.Builder builder = new CFAlertDialog.Builder(QueenUser.this)
                        .setDialogStyle(CFAlertDialog.CFAlertStyle.ALERT)
                        .setTitle("Sure?")
                        .setTextGravity(Gravity.CENTER)
                        .setHeaderView(R.layout.header_for_dialog)
                        .setMessage("Are you sure you want to vote queen-7 ?")
                        .addButton("Vote", Color.rgb(255,255,255), Color.rgb(255,191,0), CFAlertDialog.CFAlertActionStyle.POSITIVE, CFAlertDialog.CFAlertActionAlignment.JUSTIFIED, (dialog, which) -> {
                            GlobalClass globalClass=(GlobalClass)getApplicationContext() ;
                            //firebase logics here
                            DatabaseReference rootRef = FirebaseDatabase.getInstance().getReference().child("Users");
                            String Roll=globalClass.getUserName();
                            rootRef.child(Roll).child("queenID").setValue("7");
                            rootRef.child(Roll).child("testerQueen").setValue("1");
                            Toast.makeText(QueenUser.this, "You voted queen 7", Toast.LENGTH_SHORT).show();

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

        queen8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CFAlertDialog.Builder builder = new CFAlertDialog.Builder(QueenUser.this)
                        .setDialogStyle(CFAlertDialog.CFAlertStyle.ALERT)
                        .setTitle("Sure?")
                        .setTextGravity(Gravity.CENTER)
                        .setHeaderView(R.layout.header_for_dialog)
                        .setMessage("Are you sure you want to vote queen-8 ?")
                        .addButton("Vote", Color.rgb(255,255,255), Color.rgb(255,191,0), CFAlertDialog.CFAlertActionStyle.POSITIVE, CFAlertDialog.CFAlertActionAlignment.JUSTIFIED, (dialog, which) -> {
                            GlobalClass globalClass=(GlobalClass)getApplicationContext() ;
                            //firebase logics here
                            DatabaseReference rootRef = FirebaseDatabase.getInstance().getReference().child("Users");
                            String Roll=globalClass.getUserName();
                            rootRef.child(Roll).child("queenID").setValue("8");
                            rootRef.child(Roll).child("testerQueen").setValue("1");
                            Toast.makeText(QueenUser.this, "You voted queen 8", Toast.LENGTH_SHORT).show();

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
        queen9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CFAlertDialog.Builder builder = new CFAlertDialog.Builder(QueenUser.this)
                        .setDialogStyle(CFAlertDialog.CFAlertStyle.ALERT)
                        .setTitle("Sure?")
                        .setTextGravity(Gravity.CENTER)
                        .setHeaderView(R.layout.header_for_dialog)
                        .setMessage("Are you sure you want to vote queen-9 ?")
                        .addButton("Vote", Color.rgb(255,255,255), Color.rgb(255,191,0), CFAlertDialog.CFAlertActionStyle.POSITIVE, CFAlertDialog.CFAlertActionAlignment.JUSTIFIED, (dialog, which) -> {
                            GlobalClass globalClass=(GlobalClass)getApplicationContext() ;
                            //firebase logics here
                            DatabaseReference rootRef = FirebaseDatabase.getInstance().getReference().child("Users");
                            String Roll=globalClass.getUserName();
                            rootRef.child(Roll).child("queenID").setValue("9");
                            rootRef.child(Roll).child("testerQueen").setValue("1");
                            Toast.makeText(QueenUser.this, "You voted queen 9", Toast.LENGTH_SHORT).show();

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
        queen10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CFAlertDialog.Builder builder = new CFAlertDialog.Builder(QueenUser.this)
                        .setDialogStyle(CFAlertDialog.CFAlertStyle.ALERT)
                        .setTitle("Sure?")
                        .setTextGravity(Gravity.CENTER)
                        .setHeaderView(R.layout.header_for_dialog)
                        .setMessage("Are you sure you want to vote queen-10 ?")
                        .addButton("Vote", Color.rgb(255,255,255), Color.rgb(255,191,0), CFAlertDialog.CFAlertActionStyle.POSITIVE, CFAlertDialog.CFAlertActionAlignment.JUSTIFIED, (dialog, which) -> {
                            GlobalClass globalClass=(GlobalClass)getApplicationContext() ;
                            //firebase logics here
                            DatabaseReference rootRef = FirebaseDatabase.getInstance().getReference().child("Users");
                            String Roll=globalClass.getUserName();
                            rootRef.child(Roll).child("queenID").setValue("10");
                            rootRef.child(Roll).child("testerQueen").setValue("1");
                            Toast.makeText(QueenUser.this, "You voted queen 10", Toast.LENGTH_SHORT).show();

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
        queen11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CFAlertDialog.Builder builder = new CFAlertDialog.Builder(QueenUser.this)
                        .setDialogStyle(CFAlertDialog.CFAlertStyle.ALERT)
                        .setTitle("Sure?")
                        .setTextGravity(Gravity.CENTER)
                        .setHeaderView(R.layout.header_for_dialog)
                        .setMessage("Are you sure you want to vote queen-11 ?")
                        .addButton("Vote", Color.rgb(255,255,255), Color.rgb(255,191,0), CFAlertDialog.CFAlertActionStyle.POSITIVE, CFAlertDialog.CFAlertActionAlignment.JUSTIFIED, (dialog, which) -> {
                            GlobalClass globalClass=(GlobalClass)getApplicationContext() ;
                            //firebase logics here
                            DatabaseReference rootRef = FirebaseDatabase.getInstance().getReference().child("Users");
                            String Roll=globalClass.getUserName();
                            rootRef.child(Roll).child("queenID").setValue("11");
                            rootRef.child(Roll).child("testerQueen").setValue("1");
                            Toast.makeText(QueenUser.this, "You voted queen 11", Toast.LENGTH_SHORT).show();

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
}
