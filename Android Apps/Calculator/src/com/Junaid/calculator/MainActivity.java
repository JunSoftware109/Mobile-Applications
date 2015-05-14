package com.Junaid.calculator; //this is main package name

import java.util.InputMismatchException;

import com.Junaid.calculator.R;//we import .R file contained in main package
import android.app.Activity;//resources containing Activity
import android.content.Context;
import android.os.Bundle;//resources containing os.Bundle
import android.view.Menu;//resources containing menu
import android.view.View;//resources containing View
import android.view.View.OnClickListener;//resources containing onClickListener
import android.widget.Button;//resources containing Button
import android.widget.TextView;import android.widget.Toast;
//resources containing TextView

//MainActivity inherits from Activity main class and implements onClickListener interface
public class MainActivity extends Activity implements OnClickListener {
	// Activity Data declaration
	static char previousOp = '+';//static variable only exists in one copy and belongs to class
	static float runningTotal = 0;//static variable only exists in one copy and belongs to class
    static int TRUE = 1;//static variable only exists in one copy and belongs to class
    static int FALSE = 0;//static variable only exists in one copy and belongs to class
    static int newvalue = TRUE;//static variable only exists in one copy and belongs to class
    //We create private variables that hold reference of button objects
	private Button button0, button1, button2, button3, button4, button5, button6,
				   button7, button8, button9, button_point, button_add, button_cancel,
				   button_sub, button_mult, button_divide, button_equals;
	private TextView displayBox;//private instance of Textview we create displayBox reference
	//every activity must implement abstract method onCreate
	//this method gets called once Activity is started
	//savedInstanceState is used to retrieve state from an activity before being killed
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		CharSequence text;//Interface CharSequence represents ordered set of characters and defines the methods invoke them. 
		super.onCreate(savedInstanceState);//overridden method is accessed even within subclass
		setContentView(R.layout.activity_main);
		//Run the function findViewById and pass it R.id.button7 as parameters
		button7 = (Button)findViewById(R.id.button7);
		button7.setOnClickListener(this);//if button clicked onClickListener runs corresponding onClick() method
		//Run the function findViewById and pass it R.id.button8 as parameters
		button8 = (Button)findViewById(R.id.button8);
		button8.setOnClickListener(this);//if button clicked onClickListener runs corresponding onClick() method
		//Run the function findViewById and pass it R.id.button9 as parameters
		button9 = (Button)findViewById(R.id.button9);
		button9.setOnClickListener(this);//if button clicked onClickListener runs corresponding onClick() method
		//Run the function findViewById and pass it R.id.button4 as parameters
		button4 = (Button)findViewById(R.id.button4);
		button4.setOnClickListener(this);//if button clicked onClickListener runs corresponding onClick() method
		//Run the function findViewById and pass it R.id.button5 as parameters
		button5 = (Button)findViewById(R.id.button5);
		button5.setOnClickListener(this);//if button clicked onClickListener runs corresponding onClick() method
		//Run the function findViewById and pass it R.id.button6 as parameters
		button6 = (Button)findViewById(R.id.button6);
		button6.setOnClickListener(this);//if button clicked onClickListener runs corresponding onClick() method
		//Run the function findViewById and pass it R.id.button0 as parameters
		button0 = (Button)findViewById(R.id.button0);
		button0.setOnClickListener(this);//if button clicked onClickListener runs corresponding onClick() method
		//Run the function findViewById and pass it R.id.button1 as parameters
		button1 = (Button)findViewById(R.id.button1);
		button1.setOnClickListener(this);//if button clicked onClickListener runs corresponding onClick() method
		//Run the function findViewById and pass it R.id.button2 as parameters
		button2 = (Button)findViewById(R.id.button2);
		button2.setOnClickListener(this);//if button clicked onClickListener runs corresponding onClick() method
		//Run the function findViewById and pass it R.id.button3 as parameters
		button3 = (Button)findViewById(R.id.button3);
		button3.setOnClickListener(this);//if button clicked onClickListener runs corresponding onClick() method
		//Run the function findViewById and pass it R.id.button_point as parameters
		button_point = (Button)findViewById(R.id.button_point);
		button_point.setOnClickListener(this);//if button clicked onClickListener runs corresponding onClick() method
		//Run the function findViewById and pass it R.id.button_equals as parameters
		button_equals = (Button)findViewById(R.id.button_equals);
		button_equals.setOnClickListener(this);//if button clicked onClickListener runs corresponding onClick() method
		//Run the function findViewById and pass it R.id.button_add as parameters
		button_add = (Button)findViewById(R.id.button_add);
		button_add.setOnClickListener(this);//if button clicked onClickListener runs corresponding onClick() method
		//Run the function findViewById and pass it R.id.button_sub as parameters
		button_sub = (Button)findViewById(R.id.button_sub);
		button_sub.setOnClickListener(this);//if button clicked onClickListener runs corresponding onClick() method
		//Run the function findViewById and pass it R.id.button_mult as parameters
		button_mult = (Button)findViewById(R.id.button_mult);
		button_mult.setOnClickListener(this);//if button clicked onClickListener runs corresponding onClick() method
		//Run the function findViewById and pass it R.id.button_divide as parameters
		button_divide = (Button)findViewById(R.id.button_divide);
		button_divide.setOnClickListener(this);//if button clicked onClickListener runs corresponding onClick() method
		//Run the function findViewById and pass it R.id.button_cancel as parameters
		button_cancel = (Button)findViewById(R.id.button_cancel);
		button_cancel.setOnClickListener(this);//if button clicked onClickListener runs corresponding onClick() method
		//Run the function findViewById and pass it R.id.displayBox as parameters
		displayBox = (TextView)findViewById(R.id.displayBox);
		text = "0";//text of in display is set to 0
		displayBox.setText(text);//run function getText belonging to displayBox and pass it text	
	}//End of overridden onCreate method
	
	//onClick method gets called each time a button is pressed
	public void onClick(View v) {
		//CharSequence is an interface
		CharSequence text; //A CharSequence is a readable sequence of char values
		//Find out which button was pushed based on its ID
		//Switch statement checks for which button was checked and changes that text
		switch(v.getId()) { 
			case R.id.button7: {
				if (newvalue == TRUE)//any new value will be created as new entry
	            {
					displayBox.setText("7");//run function setText belonging to displayBox and pass string of 3
	                newvalue = FALSE; //the integer is no longer a new value in display box
	            }
	            else
	            {
	            	text = displayBox.getText();//run function getText belonging to displayBox in set it to text
	            	text = text + "7";//add 7 to existing value in text
	            	displayBox.setText(text);//run function getText belonging to displayBox and set it to text
	            }
				break;//Exit the loop
			}
			
			case R.id.button8: {

				if (newvalue == TRUE)//any new value will be created as new entry
	            {
					displayBox.setText("8");//run function setText belonging to displayBox and pass string of 8
	                newvalue = FALSE;//the integer is no longer a new value in display box
	            }
	            else
	            {
	            	text = displayBox.getText();//run function getText belonging to displayBox in set it to text
	            	text = text + "8";//add 8 to existing value in text
	            	displayBox.setText(text);//run function getText belonging to displayBox and set it to text
	            }
				break;//Exit the loop
			}
			
			case R.id.button9: {

				if (newvalue == TRUE)//any new value will be created as new entry
	            {
					displayBox.setText("9");//run function setText belonging to displayBox and pass string of 9
	                newvalue = FALSE;//the integer is no longer a new value in display box
	            }
	            else
	            {
	            	text = displayBox.getText();//run function getText belonging to displayBox in set it to text
	            	text = text + "9";//add 9 to existing value in text
	            	displayBox.setText(text);//run function getText belonging to displayBox and pass it text object
	            }
				break;//Exit the loop
			}
			
			case R.id.button4: {

				if (newvalue == TRUE)//any new value will be created as new entry
	            {
					displayBox.setText("4");//run function setText belonging to displayBox and pass string of 4
	                newvalue = FALSE;//the integer is no longer a new value in display box
	            }
	            else
	            {
	            	text = displayBox.getText();//run function getText belonging to displayBox and set it to text
	            	text = text + "4";//add 4 to existing value in text
	            	displayBox.setText(text);//run function getText belonging to displayBox and pass it text object
	            }
				break;//Exit the loop
			}
			
			case R.id.button5: {

				if (newvalue == TRUE)//any new value will be created as new entry
	            {
					displayBox.setText("5");//run function setText belonging to displayBox and pass string of 5
	                newvalue = FALSE;//the integer is no longer a new value in display box
	            }
	            else
	            {
	            	text = displayBox.getText();//run function getText belonging to displayBox and set it to text
	            	text = text + "5";//add 5 to existing value in text
	            	displayBox.setText(text);//run function getText belonging to displayBox and pass it text object
	            }
				break;//Exit the loop
			}
			
			case R.id.button6: {

				if (newvalue == TRUE)//any new value will be created as new entry
	            {
					displayBox.setText("6");//run function setText belonging to displayBox and pass string of 6
	                newvalue = FALSE;//the integer is no longer a new value in display box
	            }
	            else
	            {
	            	text = displayBox.getText();//run function getText belonging to displayBox and set it to text
	            	text = text + "6";//add 6 to existing value in text
	            	displayBox.setText(text);//run function getText belonging to displayBox and pass it text object
	            }
				break;//Exit the loop
			}
			
			case R.id.button0: {

				if (newvalue == TRUE)//any new value will be created as new entry
	            {
					displayBox.setText("0");//run function setText belonging to displayBox and pass string of 0
	                newvalue = FALSE;//the integer is no longer a new value in display box
	            }
	            else
	            {
	            	text = displayBox.getText();//run function getText belonging to displayBox and set it to text
	            	text = text + "0";//add 0 to existing value in text
	            	displayBox.setText(text);//run function getText belonging to displayBox and pass it text object
	            }
				break;//Exit the loop
			}
			
			case R.id.button1: {

				if (newvalue == TRUE)//any new value will be created as new entry
	            {
					displayBox.setText("1");//run function setText belonging to displayBox and pass string of 1
	                newvalue = FALSE;//the integer is no longer a new value in display box
	            }
	            else
	            {
	            	text = displayBox.getText();//run function getText belonging to displayBox and set it to text
	            	text = text + "1";//add 1 to existing value in text
	            	displayBox.setText(text);//run function getText belonging to displayBox and pass it text object
	            }
				break;//Exit the loop
			}
			
			case R.id.button2: {

				if (newvalue == TRUE)//any new value will be created as new entry
	            {
					displayBox.setText("2");//run function setText belonging to displayBox and pass string of 2
	                newvalue = FALSE;//the integer is no longer a new value in display box
	            }
	            else
	            {
	            	text = displayBox.getText();//run function getText belonging to displayBox and set it to text
	            	text = text + "2";//add 2 to existing value in text
	            	displayBox.setText(text);//run function getText belonging to displayBox and pass it text object
	            }
				break;//Exit the loop
			}
			
			case R.id.button3: {

				if (newvalue == TRUE)//any new value will be created as new entry
	            {
					displayBox.setText("3");//run function setText belonging to displayBox and pass string of 3
	                newvalue = FALSE;//the integer is no longer a new value in display box
	            }
	            else
	            {
	            	text = displayBox.getText();//run function getText belonging to displayBox and set it to text
	            	text = text + "3";//add 3 to existing value in text
	            	displayBox.setText(text);//run function getText belonging to displayBox and pass it text object
	            }
				break;//Exit the loop
			}
			
			case R.id.button_point: {
				if (newvalue == TRUE)//any new value will be created as new entry
	            {
					displayBox.setText(".");
	                newvalue = TRUE; // if button is pressed twice it is now set again               
	            }
	            else
	            {
	            	text = displayBox.getText();//run function getText belonging to displayBox and set it to text
	            	text = text + "."; // add decimal to current text value
	            	displayBox.setText(text);//run function getText belonging to displayBox and pass it text object
	                newvalue = FALSE;// it is no longer a new value in text box
	            }
				break;//Exit the loop
			}
			
			case R.id.button_cancel: {
				text = "0";// text is set 0
				displayBox.setText(text);//run function getText belonging to displayBox and pass it text object
				runningTotal = 0;//runnninTotal is reset to 0
				previousOp='+';// set previous operator to plus
				newvalue = TRUE;//any new value will be created as new entry
				break;//Exit the loop
			}
			
			case R.id.button_add: {
				try{
	            //plus button 
	            Float rez1;//Float variable called rez1 to hold current result
	            rez1 = Float.parseFloat((String) displayBox.getText());//Parse the specified string as a float value and running method getText
	            switch (previousOp)// switch loop to deal with operation
	            {
	                case '+':
	                   runningTotal = runningTotal + rez1;//running total added to result1
	                    break;//Exit the loop
	                case '-':
	                    runningTotal = runningTotal - rez1;//running total subtracted by result1
	                    break;//Exit the loop
	                case '/':
	                    runningTotal = runningTotal / rez1;//running total divided by result1
	                    break;//Exit the loop
	                case '*':
	                    runningTotal = runningTotal * rez1;//running total multiplied by result1
	                    break;//Exit the loop
	                case '=':
	                    // runningTotal = runningTotal;
	                    break;//Exit the loop
	            }
	            displayBox.setText(Float.toString(runningTotal));//type conversion runningTotal float to string and set to displayBox
	            newvalue = TRUE;//any new value will be created as new entry
	            previousOp = '+';// set previous operator to plus
				break;//Exit the loop
				}
				catch(ArithmeticException e)
				{
					Context context = getApplicationContext();
					int duration  = Toast.LENGTH_SHORT;
					Toast toast = Toast.makeText(context, "Error!", duration);
					toast.show();
				}				
}
			
			case R.id.button_sub: {

	            //minus button 
	            Float rez1;//Float variable called rez1 to hold current result
	            rez1 = Float.parseFloat((String) displayBox.getText());//Parse the specified string as a float value and running method getText
	            switch (previousOp) // switch loop to deal with operation
	            {
	                case '+':
	                   runningTotal = runningTotal + rez1;//running total added to result1
	                    break;//Exit the loop
	                case '-':
	                    runningTotal = runningTotal - rez1;//running total subtracted by result1
	                    break;//Exit the loop
	                case '/':
	                    runningTotal = runningTotal / rez1;//running total divided by result1
	                    break;//Exit the loop
	                case '*':
	                    runningTotal = runningTotal * rez1;//running total multiplied by result1
	                    break;//Exit the loop
	                case '=':
	                    // runningTotal = runningTotal;
	                    break;//Exit the loop
	            }

	            displayBox.setText(Float.toString(runningTotal));//type conversion runningTotal float to string and set to displayBox
	            newvalue = TRUE;//any new value will be created as new entry
	            previousOp = '-';// set previous operator to minus
				break;//Exit the loop
			}
			
			case R.id.button_mult: {
	            //multiply button 
	            Float rez1;//Float variable called rez1 to hold current result
	            rez1 = Float.parseFloat((String) displayBox.getText());//Parse the specified string as a float value and running method getText
	            switch (previousOp)// switch loop to deal with operation
	            {
	                case '+':
	                   runningTotal = runningTotal + rez1;//running total added to result1
	                    break;//Exit the loop
	                case '-':
	                    runningTotal = runningTotal - rez1;//running total subtracted by result1
	                    break;//Exit the loop
	                case '/':
	                    runningTotal = runningTotal / rez1;//running total divided by result1
	                    break;//Exit the loop
	                case '*':
	                    runningTotal = runningTotal * rez1;//running total multiplied by result1
	                    break;//Exit the loop
	                case '=':
	                    // runningTotal = runningTotal;
	                    break;//Exit the loop
	            }

	            displayBox.setText(Float.toString(runningTotal));//type conversion runningTotal float to string and set to displayBox
	            newvalue = TRUE;//any new value will be created as new entry
	            previousOp = '*';// set previous operator to multiply
				break;
			}
			
			case R.id.button_divide: {

	            //divide button 
	            Float rez1;//Float variable called rez1 to hold current result
	            rez1 = Float.parseFloat((String) displayBox.getText());//Parse the specified string as a float value and running method getText
	            switch (previousOp)// switch loop to deal with operation
	            {
	                case '+':
	                   runningTotal = runningTotal + rez1;//running total added to result1
	                    break;//Exit the loop
	                case '-':
	                    runningTotal = runningTotal - rez1;//running total subtracted by result1
	                    break;//Exit the loop
	                case '/':
	                    runningTotal = runningTotal / rez1;//running total divided by result1
	                    break;//Exit the loop
	                case '*':
	                    runningTotal = runningTotal * rez1;//running total multiplied by result1
	                    break;//Exit the loop
	                case '=':
	                    // runningTotal = runningTotal;
	                    break;//Exit the loop
	            }
	            displayBox.setText(Float.toString(runningTotal));//type conversion runningTotal float to string and set to displayBox
	            newvalue = TRUE;//any new value will be created as new entry
	            previousOp = '/';// set previous operator to divide
				break;//Exit the loop
			}
		
			case R.id.button_equals: {
	            //divide button 
	            Float rez1;//Float variable called rez1 to hold current result
	            rez1 = Float.parseFloat((String) displayBox.getText());//Parse the specified string as a float value and running method getText
	            switch (previousOp)// switch loop to deal with operation
	            {
	                case '+':
	                   runningTotal = runningTotal + rez1;//running total added to result1
	                    break;//Exit the loop
	                case '-':
	                    runningTotal = runningTotal - rez1;//running total subtracted by result1
	                    break;//Exit the loop
	                case '/':
	                    runningTotal = runningTotal / rez1;//running total divided by result1
	                    break;//Exit the loop
	                case '*':
	                    runningTotal = runningTotal * rez1;//running total multiplied by result1
	                    break;//Exit the loop
	                case '=':
	                    // runningTotal = runningTotal;
	                    break;//Exit the loop
	            }
	            displayBox.setText(Float.toString(runningTotal));//type conversion runningTotal float to string and set to displayBox
	            newvalue = TRUE;//any new value will be created as new entry
	            runningTotal = 0;//current total is reset to 0
	            previousOp = '+';//set previous operator to plus
				break;//Exit the loop
			}//End of equals method
		}//End of main switch case statement
	}//End of onClick method
	//Abstract method is overridden with menu parameters
	@Override //This means the method is overriding base class method
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;//Return boolean true
	}//End of method onCreateOptionsMenu
}//End of main activity class
