package com.example.first_text;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtnClick(View view){
        EditText firstNameView = findViewById(R.id.editTextFirstName);
        EditText secondNameView = findViewById(R.id.editTextSecondName);
        EditText emailAddressView = findViewById(R.id.editTextTextEmailAddress);

        TextView firstNameText = findViewById(R.id.textViewRespFirstName);
        TextView secondNameText = findViewById(R.id.textViewRespSecondName);
        TextView emailAddressText = findViewById(R.id.textViewRespEmail);

        firstNameText.setText(firstNameView.getText());
        secondNameText.setText(secondNameView.getText());
        emailAddressText.setText(emailAddressView.getText());
    }
}