package com.example.rup.feedyourpet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignIn extends AppCompatActivity {
    EditText mailtext;
    EditText passwordtext;
    Button signinbutton;
    Button forgotbutton;
    Button registerbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);


        mailtext=findViewById(R.id.signinmail_input);
        passwordtext=findViewById(R.id.signinpassword_input);

        signinbutton=findViewById(R.id.signinsignin_button);
        forgotbutton=findViewById(R.id.signinforgotpassword_button);
        registerbutton=findViewById(R.id.signinsignup_button);

        signinbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    auth(mailtext.getEditableText().toString(),passwordtext.getEditableText().toString());
            }
        });
        forgotbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SignIn.this.startActivity(new Intent(SignIn.this,ForgotPassword.class));
            }
        });
        registerbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SignIn.this.startActivity(new Intent(SignIn.this,SignUp.class));
            }
        });

    }

    private void auth(String mail,String password){
        if(mail!=null && password!=null){
            SignIn.this.startActivity(new Intent(SignIn.this,CreatePet.class));
        }
    }
}
