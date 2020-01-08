package com.example.fourthassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignUpActivity extends AppCompatActivity {
    EditText PhoneNo;
    Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

       // PhoneNo = findViewById(R.id.etNo);
        //ntnNext = findViewById(R.id.btnNext);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (TextUtils.isEmpty(PhoneNo.getText().toString()))
                {
                    PhoneNo.setError("Mandatory Field");
                    return;
                }

            }
        });

    }
}
