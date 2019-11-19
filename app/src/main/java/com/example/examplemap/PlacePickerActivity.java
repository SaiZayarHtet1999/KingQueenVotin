package com.example.examplemap;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.location.places.ui.PlacePicker;

public class PlacePickerActivity extends AppCompatActivity {

    int PLACE_PICKER_REQUEST=1;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_picker);
        text=findViewById(R.id.text);
    }

    public void ClickButton(View view) {
        PlacePicker.IntentBuilder builder=new PlacePicker.IntentBuilder();
        try {
            startActivityForResult(builder.build(PlacePickerActivity.this),PLACE_PICKER_REQUEST);
        } catch (GooglePlayServicesNotAvailableException e) {
            e.printStackTrace();
        } catch (GooglePlayServicesRepairableException e) {
            e.printStackTrace();
        }
    }

   @Override
    protected void onActivityResult(int requestCode,int resultCode,Intent data) {

       super.onActivityResult(requestCode, resultCode, data);
       if (resultCode==PLACE_PICKER_REQUEST){
           if (resultCode==RESULT_OK){
               Place place=PlacePicker.getPlace(PlacePickerActivity.this,data);
               text.setText(place.getAddress()+""+place.getLatLng()+""+place.getName());
           }

       }
   }
}
