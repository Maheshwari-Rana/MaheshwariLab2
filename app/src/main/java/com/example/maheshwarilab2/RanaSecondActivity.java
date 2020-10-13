package com.example.maheshwarilab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.maheshwarilab2.homes.RanaApartmentActivity;
import com.example.maheshwarilab2.homes.RanaCondoActivity;
import com.example.maheshwarilab2.homes.RanaDetachedHomeActivity;
import com.example.maheshwarilab2.homes.RanaSemiDetachedHomeActivity;
import com.example.maheshwarilab2.homes.RanaTownHouseActivity;

public class RanaSecondActivity extends AppCompatActivity {

    // Full Name -- Maheshwari Rana
    // Student ID -- 301110467
    // Section -- 002

    private TextView tvMenuText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rana_second);

        tvMenuText = findViewById(R.id.maheshwariMenuText);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.options_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.maheshwariApartment:
                startActivity(new Intent(getApplicationContext(), RanaApartmentActivity.class));
                return true;
            case R.id.masheshwariDetached_home:
                startActivity(new Intent(getApplicationContext(), RanaDetachedHomeActivity.class));
                return true;
            case R.id.maheshwariSemi_detached_home:
                startActivity(new Intent(getApplicationContext(), RanaSemiDetachedHomeActivity.class));
                return true;
            case R.id.maheshwariCondo_apartment:
                startActivity(new Intent(getApplicationContext(), RanaCondoActivity.class));
                return true;
            case R.id.maheshwariTown_house:
                startActivity(new Intent(getApplicationContext(), RanaTownHouseActivity.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}