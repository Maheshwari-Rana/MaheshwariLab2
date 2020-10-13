package com.example.maheshwarilab2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class RanaCheckoutActivity extends AppCompatActivity {

    // Full Name -- Maheshwari Rana
    // Student ID -- 301110467
    // Section -- 002

    private RadioGroup radioGroup;
    private TextView rbtxt1, rbtxt2, rbtxt3, rbtxt4;
    private SharedPreferences spCheckout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rana_checkout);

        findAllViews();
        spCheckout = PreferenceManager.getDefaultSharedPreferences(this);
        String cb1 = spCheckout.getString("cb1", "");
        String cb2 = spCheckout.getString("cb2", "");
        String cb3 = spCheckout.getString("cb3", "");
        String cb4 = spCheckout.getString("cb4", "");

        String condo1 = spCheckout.getString("condo1", "");
        String condo2 = spCheckout.getString("condo2", "");
        String condo3 = spCheckout.getString("condo3", "");
        String condo4 = spCheckout.getString("condo4", "");

        String detached1 = spCheckout.getString("detached1", "");
        String detached2 = spCheckout.getString("detached2", "");
        String detached3 = spCheckout.getString("detached3", "");
        String detached4 = spCheckout.getString("detached4", "");

        String semi1 = spCheckout.getString("semi1", "");
        String semi2 = spCheckout.getString("semi2", "");
        String semi3 = spCheckout.getString("semi3", "");
        String semi4 = spCheckout.getString("semi4", "");

        String town1 = spCheckout.getString("town1", "");
        String town2 = spCheckout.getString("town2", "");
        String town3 = spCheckout.getString("town3", "");
        String town4 = spCheckout.getString("town4", "");


        RadioButton rb1 = ((RadioButton) radioGroup.getChildAt(0));
        RadioButton rb2 = ((RadioButton) radioGroup.getChildAt(2));
        RadioButton rb3 = ((RadioButton) radioGroup.getChildAt(4));
        RadioButton rb4 = ((RadioButton) radioGroup.getChildAt(6));


        // radio button 1
        if (cb1 != null && !cb1.trim().isEmpty()) {
            rb1.setVisibility(View.VISIBLE);
            rbtxt1.setVisibility(View.VISIBLE);

            rb1.setText(cb1);
            rbtxt1.setText(spCheckout.getString("price1", ""));
        } else if (condo1 != null && !condo1.trim().isEmpty()) {
            rb1.setVisibility(View.VISIBLE);
            rbtxt1.setVisibility(View.VISIBLE);

            rb1.setText(condo1);
            rbtxt1.setText(spCheckout.getString("condoPrice1", ""));
        } else if (detached1 != null && !detached1.trim().isEmpty()) {
            rb1.setVisibility(View.VISIBLE);
            rbtxt1.setVisibility(View.VISIBLE);

            rb1.setText(detached1);
            rbtxt1.setText(spCheckout.getString("detachedPrice1", ""));
        } else if (semi1 != null && !semi1.trim().isEmpty()) {
            rb1.setVisibility(View.VISIBLE);
            rbtxt1.setVisibility(View.VISIBLE);

            rb1.setText(semi1);
            rbtxt1.setText(spCheckout.getString("semiPrice1", ""));
        } else if (town1 != null && !town1.trim().isEmpty()) {
            rb1.setVisibility(View.VISIBLE);
            rbtxt1.setVisibility(View.VISIBLE);

            rb1.setText(town1);
            rbtxt1.setText(spCheckout.getString("townPrice1", ""));
        }

        //radio button 2
        if (cb2 != null && !cb2.trim().isEmpty()) {
            rb2.setVisibility(View.VISIBLE);
            rbtxt2.setVisibility(View.VISIBLE);

            rb2.setText(cb2);
            rbtxt2.setText(spCheckout.getString("price2", ""));
        } else if (condo2 != null && !condo2.trim().isEmpty()) {
            rb2.setVisibility(View.VISIBLE);
            rbtxt2.setVisibility(View.VISIBLE);

            rb2.setText(condo2);
            rbtxt2.setText(spCheckout.getString("condoPrice2", ""));
        } else if (detached2 != null && !detached2.trim().isEmpty()) {
            rb2.setVisibility(View.VISIBLE);
            rbtxt2.setVisibility(View.VISIBLE);

            rb2.setText(detached2);
            rbtxt2.setText(spCheckout.getString("detachedPrice2", ""));
        } else if (semi2 != null && !semi2.trim().isEmpty()) {
            rb2.setVisibility(View.VISIBLE);
            rbtxt2.setVisibility(View.VISIBLE);

            rb2.setText(semi2);
            rbtxt2.setText(spCheckout.getString("semiPrice2", ""));
        } else if (town2 != null && !town2.trim().isEmpty()) {
            rb2.setVisibility(View.VISIBLE);
            rbtxt2.setVisibility(View.VISIBLE);

            rb2.setText(town2);
            rbtxt2.setText(spCheckout.getString("townPrice2", ""));
        }

        // radio button 3
        if (cb3 != null && !cb3.trim().isEmpty()) {
            rb3.setVisibility(View.VISIBLE);
            rbtxt3.setVisibility(View.VISIBLE);

            rb3.setText(cb3);
            rbtxt3.setText(spCheckout.getString("price3", ""));
        } else if (condo3 != null && !condo3.trim().isEmpty()) {
            rb3.setVisibility(View.VISIBLE);
            rbtxt3.setVisibility(View.VISIBLE);

            rb3.setText(condo3);
            rbtxt3.setText(spCheckout.getString("condoPrice3", ""));
        } else if (detached3 != null && !detached3.trim().isEmpty()) {
            rb3.setVisibility(View.VISIBLE);
            rbtxt3.setVisibility(View.VISIBLE);

            rb3.setText(detached3);
            rbtxt3.setText(spCheckout.getString("detachedPrice3", ""));
        } else if (semi3 != null && !semi3.trim().isEmpty()) {
            rb3.setVisibility(View.VISIBLE);
            rbtxt3.setVisibility(View.VISIBLE);

            rb3.setText(semi3);
            rbtxt3.setText(spCheckout.getString("semiPrice3", ""));
        } else if (town3 != null && !town3.trim().isEmpty()) {
            rb3.setVisibility(View.VISIBLE);
            rbtxt3.setVisibility(View.VISIBLE);

            rb3.setText(town3);
            rbtxt3.setText(spCheckout.getString("townPrice3", ""));
        }

        // radio button 4
        if (cb4 != null && !cb4.trim().isEmpty()) {
            rb4.setVisibility(View.VISIBLE);
            rbtxt4.setVisibility(View.VISIBLE);

            rb4.setText(cb4);
            rbtxt4.setText(spCheckout.getString("price4", ""));
        } else if (condo4 != null && !condo4.trim().isEmpty()) {
            rb4.setVisibility(View.VISIBLE);
            rbtxt4.setVisibility(View.VISIBLE);

            rb4.setText(condo4);
            rbtxt4.setText(spCheckout.getString("condoPrice4", ""));
        } else if (detached4 != null && !detached4.trim().isEmpty()) {
            rb4.setVisibility(View.VISIBLE);
            rbtxt4.setVisibility(View.VISIBLE);

            rb4.setText(detached1);
            rbtxt4.setText(spCheckout.getString("detachedPrice4", ""));
        } else if (semi1 != null && !semi1.trim().isEmpty()) {
            rb4.setVisibility(View.VISIBLE);
            rbtxt4.setVisibility(View.VISIBLE);

            rb4.setText(semi1);
            rbtxt4.setText(spCheckout.getString("semiPrice4", ""));
        } else if (town4 != null && !town4.trim().isEmpty()) {
            rb4.setVisibility(View.VISIBLE);
            rbtxt4.setVisibility(View.VISIBLE);

            rb4.setText(town1);
            rbtxt4.setText(spCheckout.getString("townPrice4", ""));
        }

    }

    private void findAllViews() {
        radioGroup = findViewById(R.id.maheshwariRg);
        rbtxt1 = findViewById(R.id.maheshwariRp1);
        rbtxt2 = findViewById(R.id.maheshwariRp2);
        rbtxt3 = findViewById(R.id.maheshwariRp3);
        rbtxt4 = findViewById(R.id.maheshwariRp4);
    }

    public void onClickPayment(View view) {

        int selectedButton = radioGroup.getCheckedRadioButtonId();

        if (selectedButton > 0) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);

            builder.setTitle("Start Payment");
            builder.setMessage("Are you sure?");

            builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {

                public void onClick(DialogInterface dialog, int which) {
                    startActivity(new Intent(getApplicationContext(), RanaPaymentActivity.class));
                }
            });

            builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {

                @Override
                public void onClick(DialogInterface dialog, int which) {

                    // Do nothing
                    dialog.dismiss();
                }
            });

            AlertDialog alert = builder.create();
            alert.show();

        } else {
            Toast.makeText(getApplicationContext(), "Select the option you want to go with!", Toast.LENGTH_SHORT).show();
        }
    }
}