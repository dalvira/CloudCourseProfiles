package com.example.courseprofiles;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class StudentProfileActivity extends Activity {
	
	private TextView studentName;
	private TextView school;
	private TextView major;
	private Button addCourse;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_student_profile);
		
		studentName = (TextView) findViewById(R.id.studentNameView);
		school = (TextView) findViewById(R.id.schoolView);
		major = (TextView) findViewById(R.id.majorView);
		addCourse = (Button) findViewById(R.id.addCourseBtn);
		
		//OnClickListener for Add Course Button
		addCourse.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				//Intent starts RegistrationActivity.java
				Intent startCourse = new Intent(StudentProfileActivity.this, CourseProfileActivity.class);
				startActivity(startCourse);
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.student_profile, menu);
		return true;
	}

}
