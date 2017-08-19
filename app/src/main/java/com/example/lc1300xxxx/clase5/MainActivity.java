package com.example.lc1300xxxx.clase5;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v,"Zapata come here ... It's Broken", Snackbar.LENGTH_LONG).show();
                //Toast.makeText(MainActivity.this,"hola mundo" , Toast.LENGTH_SHORT).show();
                //int a =12/0;
            }


        });
    }
}
