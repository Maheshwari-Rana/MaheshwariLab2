package com.example.maheshwarilab2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RanaPaymentActivity extends AppCompatActivity {

    // Full Name -- Maheshwari Rana
    // Student ID -- 301110467
    // Section -- 002

    private EditText name, cardNumber, carInput, cardDate, cardCVV, foodInput, fistSchool, feedBack;
    private RadioGroup rgPayType;
    private String payType;
    private SharedPreferences spFinished;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rana_payment);

        findAllViews();
        spFinished = PreferenceManager.getDefaultSharedPreferences(this);

        rgPayType.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton b = findViewById(checkedId);

                payType = b.getText().toString().trim();
                if (b.getText().toString().trim().equals("Cash")) {
                    cardNumber.setEnabled(false);
                    cardDate.setEnabled(false);
                    cardCVV.setEnabled(false);

                } else {
                    cardNumber.setEnabled(true);
                    cardDate.setEnabled(true);
                    cardCVV.setEnabled(true);
                }
            }
        });
    }

    private void findAllViews() {
        name = findViewById(R.id.maheshwariEtName);
        cardNumber = findViewById(R.id.maheshwariEtCard);
        carInput = findViewById(R.id.maheshwariEtFavCar);
        cardDate = findViewById(R.id.maheshwariEtExDate);
        cardCVV = findViewById(R.id.maheshwariEtCVV);
        foodInput = findViewById(R.id.maheshwariEtFavFood);
        fistSchool = findViewById(R.id.maheshwariEtFirstSchool);
        feedBack = findViewById(R.id.maheshwariEtFeedback);

        rgPayType = findViewById(R.id.maheshwariRg);
    }

    public void onClickPayment(View view) {
        showAlertDialog();
    }

    public void showAlertDialog() {

        String msg = "Name: " + name.getText().toString() + "\n" +
                "Card Number: " + cardNumber.getText().toString() + "\n" +
                "Payment Type: " + payType + "\n" +
                "Expiry Date: " + cardDate.getText().toString() + "\n" +
                "Security Code: " + cardCVV.getText().toString() + "\n" +
                "Favorite Car: " + carInput.getText().toString() + "\n" +
                "Favorite Food: " + foodInput.getText().toString() + "\n" +
                "School: " + fistSchool.getText().toString() + "\n" +
                "Feedback: " + feedBack.getText().toString();

        String msg1 = "Name: " + name.getText().toString() + "\n" +
                "Card Number: " + cardNumber.getText().toString() + "\n" +
                "Payment Type: " + payType + "\n" +
                "Favorite Car: " + carInput.getText().toString() + "\n" +
                "Favorite Food: " + foodInput.getText().toString() + "\n" +
                "School: " + fistSchool.getText().toString() + "\n" +
                "Feedback: " + feedBack.getText().toString();

        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle("Review Payment");
        if (!(payType.equals("Cash"))) {
            builder.setMessage(msg);
        } else {
            builder.setMessage(msg1);
        }

        builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(RanaPaymentActivity.this, "Purchase Complete! \nThank you.", Toast.LENGTH_LONG).show();
                SharedPreferences.Editor editor = spFinished.edit();
                editor.clear().apply();

                startActivity(new Intent(getApplicationContext(), MaheshwariActivity.class));
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
    }
}