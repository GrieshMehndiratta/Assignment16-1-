package com.example.grieshmehndiratta.registration;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button button1=findViewById(R.id.button2);


/*
        Toast.makeText( Login.this, Name +" "+Password,Toast.LENGTH_SHORT).show();
*/

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText editText=findViewById(R.id.editText);
                String Name;
                Name=String.valueOf(editText.getText());

                EditText editText1=findViewById(R.id.editText2);
                String Username;
                Username=String.valueOf(editText1.getText());

                EditText editText2=findViewById(R.id.editText4);
                String Pass;
                Pass=String.valueOf(editText2.getText());

                EditText editText3=findViewById(R.id.editText5);
                String Password;
                Password=String.valueOf(editText3.getText());


                if(Name.equals(Username)&&Pass.equals(Password))
                {
                    Toast.makeText(Login.this,"Login Successfully",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText( Login.this ,"Username Or Password Not Match",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
