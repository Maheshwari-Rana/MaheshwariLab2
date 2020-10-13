package com.example.maheshwarilab2.homes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import com.example.maheshwarilab2.R;
import com.example.maheshwarilab2.RanaCheckoutActivity;

public class RanaApartmentActivity extends AppCompatActivity {

    // Full Name -- Maheshwari Rana
    // Student ID -- 301110467
    // Section -- 002

    private CheckBox cb1, cb2, cb3, cb4;
    private TextView txt1, txt2, txt3, txt4;
    private SharedPreferences spApartment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rana_apartment);

        findAllViews();
        spApartment = PreferenceManager.getDefaultSharedPreferences(this);
    }

    private void findAllViews() {
        cb1 = findViewById(R.id.maheshwariCb1);
        cb2 = findViewById(R.id.maheshwariCb2);
        cb3 = findViewById(R.id.maheshwariCb3);
        cb4 = findViewById(R.id.maheshwariCb4);

        txt1 = findViewById(R.id.maheshwariPrice1);
        txt2 = findViewById(R.id.maheshwariPrice2);
        txt3 = findViewById(R.id.maheshwariPrice3);
        txt4 = findViewById(R.id.maheshwariPrice4);

    }

    public void onCheckoutClick(View view){
        SharedPreferences.Editor editor = spApartment.edit();

        if (cb1.isChecked()){
            editor.putString("cb1", cb1.getText().toString());
            editor.putString("price1", txt1.getText().toString());
        }

        if (cb2.isChecked()){
            editor.putString("cb2", cb2.getText().toString());
            editor.putString("price2", txt2.getText().toString());
        }

        if (cb3.isChecked()){
            editor.putString("cb3", cb3.getText().toString());
            editor.putString("price3", txt3.getText().toString());
        }

        if (cb4.isChecked()){
            editor.putString("cb4", cb4.getText().toString());
            editor.putString("price4", txt4.getText().toString());
        }

        editor.apply();

        if ((cb1.isChecked()) || (cb2.isChecked()) || (cb3.isChecked()) || (cb4.isChecked())){
            startActivity(new Intent(getApplicationContext(), RanaCheckoutActivity.class));
        } else {
            Toast.makeText(this, "Please do appropriate selection.", Toast.LENGTH_SHORT).show();
        }
    }
}