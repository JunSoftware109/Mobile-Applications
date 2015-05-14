using System;//using statement obtains one or more resources
using System.Collections.Generic;//This contains interfaces and classes that define generic collections,
using System.Linq;//provides classes and interfaces that support queries that use Language-Integrated Query 
using System.Net; //provides a simple programming interface for many of the protocols used on networks
using System.Windows;//Provides the ability to create, configure, show, and manage the lifetime of windows and dialog boxes.
using System.Windows.Controls;//Represents the base class for user interface (UI) elements 
using System.Windows.Documents;//Contains types that support XML Paper Specification (XPS) document creation
using System.Windows.Input;//Provides types to support the Windows Presentation Foundation (WPF) input system
using System.Windows.Media;//Provides types that enable integration of media, including drawings, text etc
using System.Windows.Media.Animation;//Provides types that support property animation functionality
using System.Windows.Shapes;//Provides access to a library of shapes that can be used in(XAML)
using Microsoft.Phone.Controls;//Provides controls for use in Window Phone Apps

//namespace keyword used to declare scope that contains set of related objects
namespace Lab3_Calculator_App
{	// by declaring partial class we can seperate class into multiple files
    // MainPage inherits from class PhoneApplicationPage, controls Windows Phone projects
	public partial class MainPage : PhoneApplicationPage 
    {
        const int TRUE = 1; // TRUE in constant variable set to 1
        const int FALSE = 0;// FALSE in constant variable set to 0
        static int newvalue = TRUE; // static variable is associated with class itself rather than instance of class
        static float runningTotal = 0; //running total set to default value of 0
        static char previousOp = '+'; //previous operator  always set to plus

        // Constructor to initialize component
		// public keyword means the method is visible from outside the class
        public MainPage()
        {
			//Initialize component method contains code that initialize user 
			//interface objects using property grid from form designer.
            InitializeComponent();
        } // end of main page() method
		
		//start of method button0_Click
		//object sender refers to the object the invoked the event
		//RoutedEventArgs Gets or sets a reference to the object that raised the event
        private void button0_Click(object sender, RoutedEventArgs e)
        {
            if (newvalue == TRUE) // if newvalue is first value to be pressed
            {
                textBox1.Text = "0"; // set text box string to 0
                newvalue = FALSE; // now 0 is no longer first integer
            }
            else // else add 0 to current value in the text box
            {
                textBox1.Text += "0"; // 0 is added to current value in text box
            } // end of if else statement
        } // end of button0_Click method
		
		//start of method button1_Click
		//object sender refers to the object the invoked the event
		//RoutedEventArgs Gets or sets a reference to the object that raised the event
        private void button1_Click(object sender, RoutedEventArgs e)
        {
            if (newvalue == TRUE) // if newvalue is first value to be pressed
            {
                textBox1.Text = "1"; // set text box string to 1
                newvalue = FALSE; // now 1 is no longer first integer
            }
            else // else add 1 to current value in the text box
            {
                textBox1.Text += "1"; // 1 is added to current value in text box
            }// end of if else statement
        }// end of method button1_Click
		
		//start of method button2_Click
        private void button2_Click(object sender, RoutedEventArgs e)
        {
            if (newvalue == TRUE) // if newvalue is first value to be pressed
            {
                textBox1.Text = "2"; // set text box string to 2
                newvalue = FALSE;// now 2 is no longer first integer
            }
            else // else add 2 to current value in the text box
            {
                textBox1.Text += "2"; // 2 is added to current value in text box
            }// end of if else statement
        }// end of method button2_Click
		
		//start of method button3_Click
        private void button3_Click(object sender, RoutedEventArgs e)
        {
            if (newvalue == TRUE) // if newvalue is first value to be pressed
            {
                textBox1.Text = "3"; // set text box string to 3
                newvalue = FALSE; // now 3 is no longer first integer
            }
            else // else add 2 to current value in the text box
            {
                textBox1.Text += "3";  // 3 is added to current value in text box
            } // end of if else statement
        }// end of method button3_Click
		
		//start of method button4_Click
        private void button4_Click(object sender, RoutedEventArgs e)
        {
            if (newvalue == TRUE)  // if newvalue is first value to be pressed
            {
                textBox1.Text = "4"; // set text box string to 4
                newvalue = FALSE;  // now 4 is no longer first integer
            }
            else // else add 4 to current value in the text box
            {
                textBox1.Text += "4"; // 4 is added to current value in text box
            }// end of if else statement
        }// end of method button4_Click
		
		//start of method button5_Click
        private void button5_Click(object sender, RoutedEventArgs e)
        {
            if (newvalue == TRUE) // if newvalue is first value to be pressed
            {
                textBox1.Text = "5"; // set text box string to 5
                newvalue = FALSE;// now 5 is no longer first integer
            }
            else// else add 5 to current value in the text box
            {
                textBox1.Text += "5";// 5 is added to current value in text box
            }// end of if else statement
        }// end of method button5_Click
		
		//start of method button6_Click
        private void button6_Click(object sender, RoutedEventArgs e)
        {
            if (newvalue == TRUE)//if newvalue is first value to be pressed
            {
                textBox1.Text = "6";//set text box string to 6
                newvalue = FALSE;// now 6 is no longer first integer
            }
            else// else add 6 to current value in the text box
            {
                textBox1.Text += "6";//6 is added to current value in text box
            }// end of if else statement
        }// end of method button6_Click

        private void button7_Click(object sender, RoutedEventArgs e)
        {
            if (newvalue == TRUE)
            {
                textBox1.Text = "7";
                newvalue = FALSE;
            }
            else
            {
                textBox1.Text += "7";
            }
        }

        private void button8_Click(object sender, RoutedEventArgs e)
        {
            if (newvalue == TRUE)
            {
                textBox1.Text = "8";
                newvalue = FALSE;
            }
            else
            {
                textBox1.Text += "8";
            }
        }
        

        private void button9_Click(object sender, RoutedEventArgs e)
        {
            if (newvalue == TRUE)
            {
                textBox1.Text = "9";
                newvalue = FALSE;
            }
            else
            {
                textBox1.Text += "9";
            }
        }

		//start of method buttopoint_Click
        private void buttopoint_Click(object sender, RoutedEventArgs e)
        {
            if (newvalue == TRUE)//if newvalue is first value to be pressed
            {
                textBox1.Text = ".";//set text box string to point
                newvalue = FALSE;// now point is no longer first integer
            }
            else// else add point to current value in the text box
            {
                textBox1.Text += ".";//point is added to current value in text box
            }// end of if else statement
        }  // end of method buttopoint_Click
		
		//start of method plus_button_click
		//private method means it not visible from outside of the class
        private void plus_button_click(object sender, RoutedEventArgs e)
        {
            float rez1; // local variable to store result1
            rez1 = System.Convert.ToSingle(textBox1.Text);// rez1 is given converted string contained within textbox
			//method ToSingle Converts the specified string representation of a number to 
			//an equivalent single-precision floating-point number.
			//parameters passed to method ToSingle is text of textbox1
            switch(previousOp) //  switch statement to control selection of operators
            {
                case '+':
                    runningTotal = runningTotal + rez1;//current result is added to running total
                    break;//The break statement terminates the closest enclosing switch statement 
                case '-':
                    runningTotal = runningTotal - rez1;//current result is subtracted to running total
                    break;//The break statement terminates the closest enclosing switch statement 
                case '/':
                    runningTotal = runningTotal / rez1;//current result is divide to running total
                    break;//The break statement terminates the closest enclosing switch statement 
                case '*':
                    runningTotal = runningTotal * rez1;//current result is multiplied to running total
                    break;//The break statement terminates the closest enclosing switch statement 
                case '=':
                    break;//The break statement terminates the closest enclosing switch statement 
            }
            textBox1.Text = runningTotal.ToString(); // runningTotal is put on textbox but first is converted to the
													 // the runningTotal from float to string
            newvalue = TRUE; // new value is now true
            previousOp = '+'; // previousOp is set to plus
        }// End of method plus_button_click
         
		//start of method subtract_button_click
        private void subtract_button_click(object sender, RoutedEventArgs e)
        {
            float rez1;// local variable to store result1
            rez1 = System.Convert.ToSingle(textBox1.Text); // rez1 is given converted string contained within textbox
			//method ToSingle Converts the specified string representation of a number to an equivalent single-precision floating-point number.
			//parameters passed to method ToSingle is text of textbox1
            switch(previousOp) //  switch statement to control selection of operators
            {
                case '+':
                    runningTotal = runningTotal + rez1;
                    break;//The break statement terminates the closest enclosing switch statement 
                case '-':
                    runningTotal = runningTotal - rez1;
                    break;//The break statement terminates the closest enclosing switch statement 
                case '/':
                    runningTotal = runningTotal / rez1;
                    break;//The break statement terminates the closest enclosing switch statement 
                case '*':
                    runningTotal = runningTotal * rez1;
                    break;//The break statement terminates the closest enclosing switch statement 
                case '=':
                    break;//The break statement terminates the closest enclosing switch statement 
            }
            textBox1.Text = runningTotal.ToString();// runningTotal is put on textbox but first is converted to the
													 // the runningTotal from float to string
            newvalue = TRUE;// new value is now true
            previousOp = '-';// previousOp is set to minus
        }//End of method subtract_button_click
     
		//start of method divide_button_click
        private void divide_button_click(object sender, RoutedEventArgs e)
        {
            float rez1;// local variable to store result1
            rez1 = System.Convert.ToSingle(textBox1.Text);// rez1 is given converted string contained within textbox
            //method ToSingle Converts the specified string representation of a number to an equivalent single-precision floating-point number.
            //parameters passed to method ToSingle is text of textbox1
            switch (previousOp) //  switch statement to control selection of operators
            {
                case '+':
                    runningTotal = runningTotal + rez1;
                    break;
                case '-':
                    runningTotal = runningTotal - rez1;
                    break;
                case '/':
                    runningTotal = runningTotal / rez1;
                    break;
                case '*':
                    runningTotal = runningTotal * rez1;
                    break;
                case '=':
                    break;
            }
            textBox1.Text = runningTotal.ToString();// runningTotal is put on textbox but first is converted to the
            // the runningTotal from float to string
            newvalue = TRUE;
            previousOp = '/';// previousOp is set to divide
        } //End of method divide_button_click
		
		//start of method multiply_button_click
        private void multiply_button_click(object sender, RoutedEventArgs e)
        {
            float rez1;// local variable to store result1
            rez1 = System.Convert.ToSingle(textBox1.Text);// rez1 is given converted string contained within textbox
			//method ToSingle Converts the specified string representation of a number to 
			//an equivalent single-precision floating-point number.
			//parameters passed to method ToSingle is text of textbox1
            switch(previousOp) //  switch statement to control selection of operators
            {
                case '+':
                    runningTotal = runningTotal + rez1;
                    break;//The break statement terminates the closest enclosing switch statement 
                case '-':
                    runningTotal = runningTotal - rez1;
                    break;//The break statement terminates the closest enclosing switch statement 
                case '/':
                    runningTotal = runningTotal / rez1;
                    break;//The break statement terminates the closest enclosing switch statement 
                case '*':
                    runningTotal = runningTotal * rez1;
                    break;//The break statement terminates the closest enclosing switch statement 
                case '=':
                    break;//The break statement terminates the closest enclosing switch statement 
            }
            textBox1.Text = runningTotal.ToString();// runningTotal is put on textbox but first is converted to the
													 // the runningTotal from float to string
            newvalue = TRUE;
            previousOp = '*';// previousOp is set to multiply
        }// end of method multiply_button_click  

        private void equals_button_click(object sender, RoutedEventArgs e)
        {
            float rez1;// local variable to store result1
            rez1 = System.Convert.ToSingle(textBox1.Text);// rez1 is given converted string contained within textbox
			//method ToSingle Converts the specified string representation 
			//of a number to an equivalent single-precision floating-point number.
			//parameters passed to method ToSingle is text of textbox1
            switch(previousOp) //  switch statement to control selection of operators
            {
                case '+':
                    runningTotal = runningTotal + rez1;
                    break;//The break statement terminates the closest enclosing switch statement 
                case '-':
                    runningTotal = runningTotal - rez1;
                    break;//The break statement terminates the closest enclosing switch statement 
                case '/':
                    runningTotal = runningTotal / rez1;
                    break;//The break statement terminates the closest enclosing switch statement 
                case '*':
                    runningTotal = runningTotal * rez1;
                    break;//The break statement terminates the closest enclosing switch statement 
                case '=':
                    break;//The break statement terminates the closest enclosing switch statement 
            }
            textBox1.Text = runningTotal.ToString();// runningTotal is put on textbox but first is converted to the
													 // the runningTotal from float to string
            newvalue = TRUE;
            runningTotal = 0;
            previousOp = '+';
        }

        private void cancel_Click(object sender, RoutedEventArgs e)
        {
            textBox1.Text = ""; //text box is cleared when cancel is clicked
            runningTotal = 0; // running total is set 0 with screen cleared
        }

        private void Calculator_Loaded(object sender, RoutedEventArgs e)
        {

        }
    } // end of  public partial class MainPage
}// end of scope of namespace Lab3_Calculator_App

