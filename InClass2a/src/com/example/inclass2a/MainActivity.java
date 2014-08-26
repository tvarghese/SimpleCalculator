package com.example.inclass2a;

/*In Class Assignment 2 _Part 1
 * Thomson Vadakkenchery Varghese
 * MainActivity.java
 * 
 * */
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_linear);

		// Setting the event listeners
		// Button addButton = (Button) findViewById(R.id.button1);
		// addButton.setOnClickListener(l)
	}

	public void onAddButtonClicked(View v) {

		EditText number1 = (EditText) findViewById(R.id.EditText1);
		EditText number2 = (EditText) findViewById(R.id.editText2);

		TextView resultTextView = (TextView) findViewById(R.id.textView1);

		String num1String = number1.getText().toString();
		String num2String = number2.getText().toString();

		if (num1String.matches("") || num2String.matches("")) {
			Toast.makeText(this, "Please enter both the numbers",
					Toast.LENGTH_SHORT).show();
		} else {
			Double result = Double.parseDouble(number1.getText().toString())
					+ Double.parseDouble(number2.getText().toString());

			String stringdouble = Double.toString(result);
			resultTextView.setText(stringdouble);
		}

	}

	public void onSubtractButtonClicked(View v) {

		EditText number1 = (EditText) findViewById(R.id.EditText1);
		EditText number2 = (EditText) findViewById(R.id.editText2);

		TextView resultTextView = (TextView) findViewById(R.id.textView1);

		String num1String = number1.getText().toString();
		String num2String = number2.getText().toString();

		if (num1String.matches("") || num2String.matches("")) {
			Toast.makeText(this, "Please enter both the numbers",
					Toast.LENGTH_SHORT).show();
		} else {

			Double result = Double.parseDouble(number1.getText().toString())
					- Double.parseDouble(number2.getText().toString());

			String stringdouble = Double.toString(result);
			resultTextView.setText(stringdouble);
		}

	}

	public void onMultiplyButtonClicked(View v) {

		EditText number1 = (EditText) findViewById(R.id.EditText1);
		EditText number2 = (EditText) findViewById(R.id.editText2);

		TextView resultTextView = (TextView) findViewById(R.id.textView1);

		String num1String = number1.getText().toString();
		String num2String = number2.getText().toString();

		if (num1String.matches("") || num2String.matches("")) {
			Toast.makeText(this, "Please enter both the numbers",
					Toast.LENGTH_SHORT).show();
		} else {

			Double result = Double.parseDouble(number1.getText().toString())
					* Double.parseDouble(number2.getText().toString());

			String stringdouble = Double.toString(result);
			resultTextView.setText(stringdouble);
		}

	}

	public void onClearAllClicked(View v) {

		EditText number1 = (EditText) findViewById(R.id.EditText1);
		EditText number2 = (EditText) findViewById(R.id.editText2);

		TextView resultTextView = (TextView) findViewById(R.id.textView1);

		number1.setText("");
		number2.setText("");
		resultTextView.setText("");

	}

	public void onDivideButtonClicked(View v) {

		EditText number1 = (EditText) findViewById(R.id.EditText1);
		EditText number2 = (EditText) findViewById(R.id.editText2);

		TextView resultTextView = (TextView) findViewById(R.id.textView1);

		Double double1 = Double.parseDouble(number1.getText().toString());
		Double double2 = Double.parseDouble(number2.getText().toString());

		int num = (int) Math.round(double2);
		if (num == 0) {
			Toast.makeText(getApplicationContext(),
					"The second number cannot be 0", Toast.LENGTH_LONG).show();
		} else {

			Double result = double1 / double2;

			String stringdouble = Double.toString(result);
			resultTextView.setText(stringdouble);
		}

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
