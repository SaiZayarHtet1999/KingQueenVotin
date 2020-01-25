package com.ucs_tgi.voting;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Contact extends AppCompatActivity {
    private static final int REQUEST_CALL = 1;
    ListView listView;
    String mTitle[] = {"Sai Zayar Htet ", "Zaw Thu Ya", "Arkar Min Naing", "Ma Aye Thwe Phyo", "Ma Lin Zarni Zaw", "Ma Nway Nway Hlaing", "Ma Nyein Nyein Aung"};
    String mDescription[] = {"Clicked to Contact", "Clicked to Contact", "Clicked to Contact", "Clicked to Contact", "Clicked to Contact", "Clicked to Contact", "Clicked to Contact"};
    int images[] = {R.drawable.ckosai, R.drawable.czaw, R.drawable.ckar, R.drawable.caye, R.drawable.clin, R.drawable.cnway, R.drawable.cnyein};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        listView = findViewById(R.id.listView);
        final Dialog dialogsai = new Dialog(this);
        dialogsai.setContentView(R.layout.activity_sai);

        //endsai

        //zawthuya
        final Dialog dialogzaw = new Dialog(this);
        dialogzaw.setContentView(R.layout.activity_zaw);
        //endzaw

        //arkar
        final Dialog dialogarkar = new Dialog(this);
        dialogarkar.setContentView(R.layout.activity_arkar);
        //endarkar

        //ayethwe
        final Dialog dialogaye = new Dialog(this);
        dialogaye.setContentView(R.layout.activity_aye);
        //endthwe

        //miwine
        final Dialog dialogwine = new Dialog(this);
        dialogwine.setContentView(R.layout.activity_wine);
        //endwine

        //nwayhlaing
        final Dialog dialognway = new Dialog(this);
        dialognway.setContentView(R.layout.activity_nway);
        //endnway

        //nyeinnyein
        final Dialog dialognyein = new Dialog(this);
        dialognyein.setContentView(R.layout.activity_nyein);
        //endnyein

        listView = findViewById(R.id.listView);


        MyAdapter adapter = new MyAdapter(this, mTitle, mDescription, images);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Toast.makeText(Contact.this, "Sai Zayar Htet Description", Toast.LENGTH_SHORT).show();
                    dialogsai.show();
                }
                if (position == 1) {
                    Toast.makeText(Contact.this, "Zaw Thu Ya Description", Toast.LENGTH_SHORT).show();
                    dialogzaw.show();
                }
                if (position == 2) {
                    Toast.makeText(Contact.this, "Arkar Min Naing Description", Toast.LENGTH_SHORT).show();
                    dialogarkar.show();
                }
                if (position == 3) {
                    Toast.makeText(Contact.this, "Aye Thwe Phyo Description", Toast.LENGTH_SHORT).show();
                    dialogaye.show();
                }
                if (position == 4) {
                    Toast.makeText(Contact.this, "Lin Zarni Zaw Description", Toast.LENGTH_SHORT).show();
                    dialogwine.show();
                }
                if (position == 5) {
                    Toast.makeText(Contact.this, "Nway Nway Hlaing Description", Toast.LENGTH_SHORT).show();
                    dialognway.show();
                }
                if (position == 6) {
                    Toast.makeText(Contact.this, "Nyein Nyein Aung Description", Toast.LENGTH_SHORT).show();
                    dialognyein.show();
                }
            }
        });


        adapter = new MyAdapter(this, mTitle, mDescription, images);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Toast.makeText(Contact.this, "Sai Zayar Htet Description", Toast.LENGTH_SHORT).show();
                    dialogsai.show();
                }
                if (position == 1) {
                    Toast.makeText(Contact.this, "Zaw Thu Ya Description", Toast.LENGTH_SHORT).show();
                    dialogzaw.show();
                }
                if (position == 2) {
                    Toast.makeText(Contact.this, "Arkar Min Naing Description", Toast.LENGTH_SHORT).show();
                    dialogarkar.show();
                }
                if (position == 3) {
                    Toast.makeText(Contact.this, "Aye Thwe Phyo Description", Toast.LENGTH_SHORT).show();
                    dialogaye.show();
                }
                if (position == 4) {
                    Toast.makeText(Contact.this, "Lin Zarni Zaw Description", Toast.LENGTH_SHORT).show();
                    dialogwine.show();
                }
                if (position == 5) {
                    Toast.makeText(Contact.this, "Nway Nway Hlaing Description", Toast.LENGTH_SHORT).show();
                    dialognway.show();
                }
                if (position == 6) {
                    Toast.makeText(Contact.this, "Nyein Nyein Aung Description", Toast.LENGTH_SHORT).show();
                    dialognyein.show();
                }
            }
        });

    }

    class MyAdapter extends ArrayAdapter<String> {
        Context context;
        String rTitle[];
        String rDescription[];
        int rImage[];

        MyAdapter(Context c, String title[], String description[], int imgs[]) {
            super(c, R.layout.row, R.id.textView1, title);
            this.context = c;
            this.rTitle = title;
            this.rDescription = description;
            this.rImage = imgs;
        }
        @NonNull
        @Override
        public View getView(int position,@NonNull View covertView,@NonNull ViewGroup parent){
            LayoutInflater layoutInflater=(LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row= getLayoutInflater().inflate(R.layout.row,parent,false);
            ImageView images=row.findViewById(R.id.image);
            TextView myTitle=row.findViewById(R.id.textView1);
            TextView myDescription=row.findViewById(R.id.textView2);

            images.setImageResource(rImage[position]);
            myTitle.setText(rTitle[position]);
            myDescription.setText(rDescription[position]);

            return row;
        }
    }
}
