package com.example.maheshwarilab2.homes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import com.example.maheshwarilab2.R;
import com.example.maheshwarilab2.RanaCheckoutActivity;

public class RanaSemiDetachedHomeActivity extends AppCompatActivity {

    // Full Name -- Maheshwari Rana
    // Student ID -- 301110467
    // Section -- 002

    private CheckBox cb1, cb2, cb3, cb4;
    private TextView txt1, txt2, txt3, txt4;
    private SharedPreferences spSemiDetached;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semi_detached_home);

        findAllViews();
        spSemiDetached = PreferenceManager.getDefaultSharedPreferences(this);
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

    public void onCheckoutClick(View view) {
        SharedPreferences.Editor editor = spSemiDetached.edit();

        if (cb1.isChecked()) {
            editor.putString("semi1", cb1.getText().toString());
            editor.putString("semiPrice1", txt1.getText().toString());
        }

        if (cb2.isChecked()) {
            editor.putString("semi2", cb2.getText().toString());
            editor.putString("semiPrice2", txt2.getText().toString());
        }

        if (cb3.isChecked()) {
            editor.putString("semi3", cb3.getText().toString());
            editor.putString("semiPrice3", txt3.getText().toString());
        }

        if (cb4.isChecked()) {
            editor.putString("semi4", cb4.getText().toString());
            editor.putString("semiPrice4", txt4.getText().toString());
        }

        editor.apply();

        startActivity(new Intent(getApplicationContext(), RanaCheckoutActivity.class));
    }
}