package com.example.cardcreater;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    EditText TO , FROM ,HEADING ,MESSAGE;
    Button btn;
    String st1,st2,st3,st4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.button);
        TO=findViewById(R.id.tv2);
        FROM=findViewById(R.id.tv1);
        HEADING=findViewById(R.id.tv3);
        MESSAGE=findViewById(R.id.tv4);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Card.class);
                st1=TO.getText().toString();
                i.putExtra("Value1",st1);
                st2=FROM.getText().toString();
                i.putExtra("Value4",st2);
                st3=HEADING.getText().toString();
                i.putExtra("Value2",st3);
                st4=MESSAGE.getText().toString();
                i.putExtra("Value3",st4);
                startActivity(i);
                finish();
            }
        });
    }
}
