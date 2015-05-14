//
//  ViewController.m
//  Calculator by Junaid and ALberto
//
//  Created by Student on 12/11/2014.
//  Copyright (c) 2014 Student. All rights reserved.
//

//ViewController.h is imported
#import "ViewController.h"

@interface ViewController ()
// (id) sender is object which is sent the message to selector
- (IBAction)button7:(id)sender;//(-)denotes start of method, return type is (IBAction, name of method is button7. 
- (IBAction)button8:(id)sender;//(-)denotes start of method, return type is (IBAction, name of method is button8. 
- (IBAction)button9:(id)sender;//(-)denotes start of method, return type is (IBAction, name of method is button9. 
- (IBAction)buttonAdd:(id)sender;//(-)denotes start of method, return type is (IBAction, name of method is buttonAdd. 

- (IBAction)button4:(id)sender;//(-)denotes start of method, return type is (IBAction, name of method is button4.
- (IBAction)button5:(id)sender;//(-)denotes start of method, return type is (IBAction, name of method is button5. 
- (IBAction)button6:(id)sender;//(-)denotes start of method, return type is (IBAction, name of method is button6. 
- (IBAction)buttonSub:(id)sender;//(-)denotes start of method, return type is (IBAction, name of method is buttonSub. 

- (IBAction)button1:(id)sender;//(-)denotes start of method, return type is (IBAction, name of method is button1.
- (IBAction)button2:(id)sender;//(-)denotes start of method, return type is (IBAction, name of method is button2.
- (IBAction)button3:(id)sender;//(-)denotes start of method, return type is (IBAction, name of method is button3.
- (IBAction)buttonMul:(id)sender;//(-)denotes start of method, return type is (IBAction, name of method is buttonMul.

- (IBAction)button0:(id)sender;//(-)denotes start of method, return type is (IBAction, name of method is button0.
- (IBAction)buttonDot:(id)sender;//(-)denotes start of method, return type is (IBAction, name of method is buttonDot.
- (IBAction)buttonDel:(id)sender;//(-)denotes start of method, return type is (IBAction, name of method is buttonDel.
- (IBAction)buttonDiv:(id)sender;//(-)denotes start of method, return type is (IBAction, name of method is buttonDiv.

- (IBAction)buttonEq:(id)sender;//(-)denotes start of method, return type is (IBAction, name of method is buttonEq.
//property allows dot notation and creates getter and setter functions
@property (weak, nonatomic) IBOutlet UILabel *resultView;  

@implementation ViewController

// Decleration of static variables
float tmpResult;// variable of type float named tmpResult
float totResult;// variable of type float named totResult
NSString *previousOp=@"+";//string object called previousOp set to plus
NSString *op; // string object named op
NSInteger previousOpInt = 0;//previousOp set to integer value of 0
BOOL INIT = FALSE; // set init to boolean false
BOOL NEXT = FALSE;//set next to boolean false
// End of static variables

//Method viewDidLoad is loaded after controllers view is loaded into memory
- (void)viewDidLoad {
    [super viewDidLoad]; // viewDidLoad calls superclass to perform configurations
    // Do any additional setup after loading the view, typically from a nib.
   // self.resultView.text = @"hello";
    self.resultView.layer.borderColor = [UIColor blueColor].CGColor;// setting border of UI window to blue
    self.resultView.layer.borderWidth = 2.0;
    self.view.layer.backgroundColor = [UIColor yellowColor].CGColor;// setting border of UI window to yellow  
} // End of viewDidLoad method

- (void)didReceiveMemoryWarning {
    [super didReceiveMemoryWarning];
    // Dispose of any resources that can be recreated.
}

// start of calculate method return type is void as it returns nothing
- (void) calculate { 
    switch (previousOpInt) {
        case 0: // case 0 acts as our add button
            tmpResult = [self.resultView.text floatValue]; //
            totResult = totResult+tmpResult;
            self.resultView.text = @"";
            self.resultView.text = [NSString stringWithFormat:@"%f", totResult];
            NEXT = TRUE;
            INIT = TRUE;
            break;// Exit the loop
            
        case 1:// case 1 acts as our subtract button
            if (!INIT) {
                tmpResult = [self.resultView.text floatValue];
                totResult = tmpResult;
                self.resultView.text = @"";
                self.resultView.text = [NSString stringWithFormat:@"%f", totResult];
                NEXT = TRUE;
                INIT = TRUE;
            }
            else
            {
                tmpResult = [self.resultView.text floatValue];
                totResult = totResult-tmpResult;
                self.resultView.text = @"";
                self.resultView.text = [NSString stringWithFormat:@"%f", totResult];
                NEXT = TRUE;
            }
            break;// Exit the loop
            
            case 2:// case 2 acts as our multiply button
            if (!INIT) {
                tmpResult = [self.resultView.text floatValue];
                totResult = tmpResult;
                self.resultView.text = @"";
                self.resultView.text = [NSString stringWithFormat:@"%f", totResult];
                NEXT = TRUE;
                INIT = TRUE;
            }
            else
            {
                tmpResult = [self.resultView.text floatValue];
                totResult = totResult*tmpResult;
                self.resultView.text = @"";
                self.resultView.text = [NSString stringWithFormat:@"%f", totResult];
                NEXT = TRUE;
            }
            break;// Exit the loop
            case 3:// case 3 acts as our add button
            if (!INIT) {
                tmpResult = [self.resultView.text floatValue];
                totResult = tmpResult;
                self.resultView.text = @"";
                self.resultView.text = [NSString stringWithFormat:@"%f", totResult];
                NEXT = TRUE;
                INIT = TRUE;
            }
            else
            {
                tmpResult = [self.resultView.text floatValue];
                totResult = totResult/tmpResult;
                self.resultView.text = @"";
                self.resultView.text = [NSString stringWithFormat:@"%f", totResult];
                NEXT = TRUE;
            }
            break;// Exit the loop
    }
    //previousOp = op;
    if ([op  isEqual: @"+"]) {
        previousOpInt=0;
    }
    if ([op  isEqual: @"-"]) {
        previousOpInt=1;
    }
    if ([op  isEqual: @"*"]) {
        previousOpInt=2;
    }
    if ([op  isEqual: @"/"]) {
        previousOpInt=3;
    }
} // End of calculate method


- (IBAction)button7:(id)sender {
    if (NEXT) {
        NEXT=FALSE;
        self.resultView.text = @"7";
    }
    else {
        self.resultView.text = [self.resultView.text stringByAppendingString:@"7"];
    }
}

- (IBAction)button8:(id)sender {
    if (NEXT) {
        NEXT=FALSE;
        self.resultView.text = @"8";
    }
    else {
        self.resultView.text = [self.resultView.text stringByAppendingString:@"8"];
    }
}

- (IBAction)button9:(id)sender {
    if (NEXT) {
        NEXT=FALSE;
        self.resultView.text = @"9";
    }
    else {
        self.resultView.text = [self.resultView.text stringByAppendingString:@"9"];
    }
}

- (IBAction)buttonAdd:(id)sender {
    op= @"+";
    [self calculate];
    
}

- (IBAction)button4:(id)sender {
    if (NEXT) {
        NEXT=FALSE;
        self.resultView.text = @"4";
    }
    else {
        self.resultView.text = [self.resultView.text stringByAppendingString:@"4"];
    }
}

- (IBAction)button5:(id)sender {
    if (NEXT) {
        NEXT=FALSE;
        self.resultView.text = @"5";
    }
    else {
        self.resultView.text = [self.resultView.text stringByAppendingString:@"5"];
    }
}

- (IBAction)button6:(id)sender {
    if (NEXT) {
        NEXT=FALSE;
        self.resultView.text = @"6";
    }
    else {
        self.resultView.text = [self.resultView.text stringByAppendingString:@"6"];
    }
}

- (IBAction)buttonSub:(id)sender {
    op= @"-";
    [self calculate];}

- (IBAction)button1:(id)sender {
    if (NEXT) {
        NEXT=FALSE;
        self.resultView.text = @"1";
    }
    else {
        self.resultView.text = [self.resultView.text stringByAppendingString:@"1"];
    }
}

- (IBAction)button2:(id)sender {
    if (NEXT) {
        NEXT=FALSE;
        self.resultView.text = @"2";
    }
    else {
        self.resultView.text = [self.resultView.text stringByAppendingString:@"2"];
    }
}

- (IBAction)button3:(id)sender {
    if (NEXT) {
        NEXT=FALSE;
        self.resultView.text = @"3";
    }
    else {
        self.resultView.text = [self.resultView.text stringByAppendingString:@"3"];
    }
}

- (IBAction)buttonMul:(id)sender {
    op= @"*";
    [self calculate];
}

- (IBAction)button0:(id)sender {
    if (NEXT) {
        NEXT=FALSE;
        self.resultView.text = @"0";
    }
    else {
        self.resultView.text = [self.resultView.text stringByAppendingString:@"0"];
    }
}

- (IBAction)buttonDot:(id)sender {
    self.resultView.text = [self.resultView.text stringByAppendingString:@"."];
}

- (IBAction)buttonDel:(id)sender {
    self.resultView.text = @"";
    tmpResult = 0;
    totResult = 0;
    NEXT = FALSE;
    INIT = FALSE;
}

- (IBAction)buttonDiv:(id)sender {
    op= @"/"; // op is set to divide
    [self calculate]; // invoke the function calculate
}

//start of method buttonEq
- (IBAction)buttonEq:(id)sender {
    switch (previousOpInt) {
        case 0:
            [self buttonAdd:self];
            break;// Exit the loop
        case 1:
            [self buttonSub:self];
            break;// Exit the loop
        case 2:
            [self buttonMul:self];
            break;// Exit the loop
        case 3:
            [self buttonDiv:self];
            break;// Exit the loop        
        default:
            break;// Exit the loop
    }
    tmpResult = 0; //tmpResult set to zero
    totResult = 0;//totResult set to zero
    INIT = FALSE;
    NEXT = FALSE;
    op = @"+"; // operator is now set to plus 
    previousOp = @"+"; //previous operator is now plus
    previousOpInt = 0; //previous integer value is now zero
}//End of method buttonEq
@end // End of view controller 