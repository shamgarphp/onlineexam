package com.shamgar.onlineexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class RegisterTypeActivity extends AppCompatActivity {

    private Spinner spinner1;
    private Button btnSubmit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_type);
        spinner1 = findViewById(R.id.spinner1);

        btnSubmit =  findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(),SignupActivity.class);
                intent.putExtra("type",String.valueOf(spinner1.getSelectedItem()));
                startActivity(intent);

                Toast.makeText(RegisterTypeActivity.this,
                        "OnClickListener : " +
                                "\nSpinner 1 : "+ String.valueOf(spinner1.getSelectedItem()),
                        Toast.LENGTH_SHORT).show();
            }

        });
    }
}
