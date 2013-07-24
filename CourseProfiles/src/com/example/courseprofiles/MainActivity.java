package com.example.courseprofiles;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends Activity {
	
	private EditText email;
	private EditText password;
	private CheckBox remember;
	private Button signIn;
	private Button signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        email = (EditText) findViewById(R.id.emailEdit);
        password = (EditText) findViewById(R.id.passwordEdit);
        remember = (CheckBox) findViewById(R.id.rememberBox);
        signIn = (Button) findViewById(R.id.signInBtn);
        signUp = (Button) findViewById(R.id.signUpBtn);
        
        
        //OnClickListener for Sign In Button
        signIn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				//Intent starts StudentProfileActivity.java
				Intent startStudProfile = new Intent(MainActivity.this, StudentProfileActivity.class);
				startActivity(startStudProfile);

			}
		});
        
        //OnClickListener for Sign Up Button
        signUp.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				//Intent starts RegistrationActivity.java
				Intent startRegistration = new Intent(MainActivity.this, RegistrationActivity.class);
				startActivity(startRegistration);
				
			}
		});
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
