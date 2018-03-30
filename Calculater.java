package com.example.calculater;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	Button b1,b2,b3,b4;
	EditText e1,e2;
	TextView t1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		b1=(Button) findViewById(R.id.button1);
		b2=(Button) findViewById(R.id.button2);
		b3=(Button) findViewById(R.id.button3);
		b4=(Button) findViewById(R.id.button4);
		
		e1=(EditText) findViewById(R.id.editText1);
		e2=(EditText) findViewById(R.id.editText2);
		t1=(TextView) findViewById(R.id.textView1);
		b1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				String s1=e1.getText().toString();
				String s2=e2.getText().toString();
				int a,b,c;
				a=Integer.parseInt(s1);
				b=Integer.parseInt(s2);
				c=a+b;
				t1.setText("Addition="+c);
				
			}
		});
   b2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				String s1=e1.getText().toString();
				String s2=e2.getText().toString();
				int a,b,c;
				a=Integer.parseInt(s1);
				b=Integer.parseInt(s2);
				c=a-b;
				t1.setText("Difference="+c);
				
			}
		});
   b3.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			
			String s1=e1.getText().toString();
			String s2=e2.getText().toString();
			int a,b,c;
			a=Integer.parseInt(s1);
			b=Integer.parseInt(s2);
			c=a*b;
			t1.setText("Product="+c);
			
		}
	});
   b4.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			
			String s1=e1.getText().toString();
			String s2=e2.getText().toString();
			int a,b,c;
			a=Integer.parseInt(s1);
			b=Integer.parseInt(s2);
			c=a/b;
			t1.setText("Division="+c);
			
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
