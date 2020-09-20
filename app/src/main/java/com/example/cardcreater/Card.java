package com.example.cardcreater;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class Card extends AppCompatActivity {
    TextView tv1,tv2,tv3,tv4;
    String st1,st2,st3,st4;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);
        tv1=findViewById(R.id.tv1);
        tv2=findViewById(R.id.tv2);
        tv3=findViewById(R.id.tv3);
        tv4=findViewById(R.id.tv4);
        button2=findViewById(R.id.button2);
        st1=getIntent().getExtras().getString("Value2");
        st2=getIntent().getExtras().getString("Value1");
        st3=getIntent().getExtras().getString("Value3");
        st4=getIntent().getExtras().getString("Value4");
        tv1.setText(st1);
        tv2.setText("To "+st2);
        tv3.setText(st3);
        tv4.setText("From "+st4);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Card.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });
    }

}
