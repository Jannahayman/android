package com.example.mycounter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView text = findViewById(R.id.teamlabel);
        text.setText(getIntent().getStringExtra("key"));
        ImageButton back = findViewById(R.id.back_btn);
        back.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.back_btn) {
            openFirst();
        }

    }
    private void openFirst() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}