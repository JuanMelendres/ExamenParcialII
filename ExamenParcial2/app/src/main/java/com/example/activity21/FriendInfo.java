package com.example.activity21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class FriendInfo extends AppCompatActivity {

    private EditText edtPerrito,edtPeso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friend_info);
        edtPerrito = findViewById(R.id.edtPerrito);
        edtPerrito = findViewById(R.id.edtPeso);
        edtPerrito.setText(getIntent().getStringExtra("perrito"));
        edtPerrito.setText(getIntent().getStringExtra("peso"));
    }

}
