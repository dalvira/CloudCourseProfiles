package com.example.courseprofiles;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class RegistrationActivity extends Activity {
	
	private EditText firstName;
	private EditText lastName;
	private EditText regEmail;
	private EditText regPassword;
	private EditText confirmPassword;
	private Button register;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_registration);
		
		firstName = (EditText) findViewById(R.id.firstNameEdit);
		lastName = (EditText) findViewById(R.id.lastNameEdit);
		regEmail = (EditText) findViewById(R.id.regEmailEdit);
		regPassword = (EditText) findViewById(R.id.regPasswordEdit);
		confirmPassword = (EditText) findViewById(R.id.confirmPasswordEdit);
		register = (Button) findViewById(R.id.registerBtn);
		
		//OnClickListener for Register Button
		register.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				//Intent starts StudentProfileActivity.java
				Intent startStudProfile = new Intent(RegistrationActivity.this, StudentProfileActivity.class);
				startActivity(startStudProfile);
			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.registration, menu);
		return true;
	}

}
