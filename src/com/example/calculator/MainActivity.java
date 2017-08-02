package com.example.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		final EditText etResult = (EditText)findViewById(R.id.result);
		
		Button btPlus = (Button)findViewById(R.id.plusBt);
		btPlus.setOnClickListener(new Button.OnClickListener() {
					@Override
					public void onClick(View v) {
						EditText etNum1 = (EditText) findViewById(R.id.num1);
						EditText etNum2 = (EditText) findViewById(R.id.num2);
						double num1 = Double.parseDouble(etNum1.getText().toString());
						double num2 = Double.parseDouble(etNum2.getText().toString());
						double result = num1+num2;
						etResult.setText(result+"");
					}
	            }
	        );
		
		Button btMinus = (Button)findViewById(R.id.minusBt);
		btMinus.setOnClickListener(new Button.OnClickListener() {
					@Override
					public void onClick(View v) {
						EditText etNum1 = (EditText) findViewById(R.id.num1);
						EditText etNum2 = (EditText) findViewById(R.id.num2);
						double num1 = Double.parseDouble(etNum1.getText().toString());
						double num2 = Double.parseDouble(etNum2.getText().toString());
						double result = num1-num2;
						etResult.setText(result+"");
					}
	            }
	        );
		
		Button btMul = (Button)findViewById(R.id.mulBt);
		btMul.setOnClickListener(new Button.OnClickListener() {
					@Override
					public void onClick(View v) {
						EditText etNum1 = (EditText) findViewById(R.id.num1);
						EditText etNum2 = (EditText) findViewById(R.id.num2);
						double num1 = Double.parseDouble(etNum1.getText().toString());
						double num2 = Double.parseDouble(etNum2.getText().toString());
						double result = num1*num2;
						etResult.setText(result+"");
					}
	            }
	        );
		
		Button btSub = (Button)findViewById(R.id.subBt);
		btSub.setOnClickListener(new Button.OnClickListener() {
					@Override
					public void onClick(View v) {
						EditText etNum1 = (EditText) findViewById(R.id.num1);
						EditText etNum2 = (EditText) findViewById(R.id.num2);
						double num1 = Double.parseDouble(etNum1.getText().toString());
						double num2 = Double.parseDouble(etNum2.getText().toString());
						double result = num1/num2;
						etResult.setText(result+"");
					}
	            }
	        );
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	
	
}
