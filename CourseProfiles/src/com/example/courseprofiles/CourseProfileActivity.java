package com.example.courseprofiles;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Button;
import android.widget.TextView;

public class CourseProfileActivity extends Activity {
	
	private TextView courseName;
	private TextView professor;
	private TextView semester;
	private Button addAssn;
	private Button addQuiz;
	private Button addExam;
	private Button addProject;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_course_profile);
		
		courseName = (TextView) findViewById(R.id.courseNameView);
		professor = (TextView) findViewById(R.id.professorView);
		semester = (TextView) findViewById(R.id.semesterView);
		addAssn = (Button) findViewById(R.id.addAssnBtn);
		addQuiz = (Button) findViewById(R.id.addQuizBtn);
		addExam = (Button) findViewById(R.id.addExamBtn);
		addProject = (Button) findViewById(R.id.addProjectBtn);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.course_profile, menu);
		return true;
	}

}
