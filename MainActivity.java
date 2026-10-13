package com.kalachat.app;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * KALA CHAT UI scaffold.
 * Phone OTP and live chat are intentionally not faked; connect Firebase Auth/Firestore
 * and handle their callbacks before treating this as a working messenger.
 */
public class MainActivity extends Activity {
    private LinearLayout root;
    private EditText phoneInput;

    private int dp(int value) {
        return (int) (value * getResources().getDisplayMetrics().density + 0.5f);
    }

    @Override
    public void onCreate(Bundle state) {
        super.onCreate(state);
        showLogin();
    }

    private TextView text(String value, int size) {
        TextView t = new TextView(this);
        t.setText(value);
        t.setTextSize(size);
        t.setTextColor(Color.rgb(25, 45, 40));
        t.setGravity(Gravity.CENTER);
        t.setPadding(dp(12), dp(10), dp(12), dp(10));
        return t;
    }

    private Button button(String value) {
        Button b = new Button(this);
        b.setText(value);
        return b;
    }

    private void setupRoot() {
        root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setGravity(Gravity.CENTER_HORIZONTAL);
        root.setPadding(dp(22), dp(28), dp(22), dp(18));
        root.setBackgroundColor(Color.rgb(244, 249, 246));
        setContentView(root);
    }

    private void showLogin() {
        setupRoot();
        root.addView(text("KALA CHAT", 30));
        root.addView(text("Message your people.", 16));

        phoneInput = new EditText(this);
        phoneInput.setSingleLine(true);
        phoneInput.setHint("Phone number with country code, e.g. +91...");
        phoneInput.setInputType(3);
        root.addView(phoneInput, new LinearLayout.LayoutParams(-1, dp(58)));

        Button sendOtp = button("Send OTP");
        root.addView(sendOtp, new LinearLayout.LayoutParams(-1, dp(56)));
        sendOtp.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                String phone = phoneInput.getText().toString().trim();
                if (phone.length() < 8 || !phone.startsWith("+")) {
                    Toast.makeText(MainActivity.this,
                        "Enter number with country code, e.g. +91", Toast.LENGTH_LONG).show();
                    return;
                }
                Toast.makeText(MainActivity.this,
                    "OTP is not connected yet. Configure Firebase Phone Authentication first.",
                    Toast.LENGTH_LONG).show();
            }
        });

        root.addView(text("Starter UI only — no OTP is sent yet.", 13));
    }
}
