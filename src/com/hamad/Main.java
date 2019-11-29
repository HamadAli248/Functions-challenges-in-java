package com.hamad;


//  JS Functions
// Challenge 1
// Let's go back to our naughts and crosses board. Create a function that takes 9 parameters
// and logs our naughts and crosses board to the console.
// --------------------------------------------------------------------------------------------------------------------


public class Main {

    static void myMethod (String spaceX , String spaceO) {
        System.out.println(spaceO+" | "+ spaceO + "| " + spaceX  );
        System.out.println("--------------");
        System.out.println(spaceO+" | "+ spaceO + "| " + spaceX  );
        System.out.println("--------------");
        System.out.println("   "+" | "+ spaceX + "| " + spaceO  );


    }

    public static void main(String[] args) {

        myMethod(" X "," O ");

    }
}


import java.util.Scanner;

// -------------------------------------------------------------------------------------------------------------------
// Challenge 2:
// Create a function that takes a number as a parameter and converts it to a string.
// -------------------------------------------------------------------------------------------------------------------


public class Main{

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.println("Please Enter your number: ");
        int myNumber = number.nextInt();
        System.out.println(Integer.toString(myNumber));


    }
}


// -------------------------------------------------------------------------------------------------------------------
// Challenge 3:
// Create a function that takes a number as a parameter and adds one.
// ---------------------------------------------------------------------------------------------------------------------


public class Main{

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.println("Please Enter your number: ");
        int myNumber = number.nextInt();
        System.out.println("Your answer is : " +(myNumber+1));
  }
}


// --------------------------------------------------------------------------------------------------------------------
// Challenge 4:
// Create a function that takes a number as a parameter and takes one off.
// --------------------------------------------------------------------------------------------------------------------


public class Main{

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.println("Please Enter your number: ");
        int myNumber = number.nextInt();
        System.out.println("Your answer is : " +(myNumber-1));
    }
}


// -------------------------------------------------------------------------------------------------------------------
// Challenge 5:
// Create a function that takes two numbers as a parameters and adds them together.
// -------------------------------------------------------------------------------------------------------------------


public class Main{

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.println("Please Enter your first number: ");
        int myFirstNumber = number.nextInt();
        System.out.println("Please Enter your Second number: ");
        int mySecondNumber = number.nextInt();

        System.out.println("Your answer is : " +(myFirstNumber+mySecondNumber));
    }
}


// --------------------------------------------------------------------------------------------------------------------
// Challenge 6:
// Create a function that takes two numbers as a parameters and takes the second one away from the first one.
// --------------------------------------------------------------------------------------------------------------------


public class Main{

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.println("Please Enter your first number: ");
        int myFirstNumber = number.nextInt();
        System.out.println("Please Enter your Second number: ");
        int mySecondNumber = number.nextInt();

        System.out.println("Your answer is : " +(myFirstNumber-mySecondNumber));
    }
}



// --------------------------------------------------------------------------------------------------------------------
// Challenge 7:
// Create a function that takes two numbers as a parameters and multiplies them together.
// --------------------------------------------------------------------------------------------------------------------


public class Main{

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.println("Please Enter your first number: ");
        int myFirstNumber = number.nextInt();
        System.out.println("Please Enter your Second number: ");
        int mySecondNumber = number.nextInt();

        System.out.println("Your answer is : " +(myFirstNumber*mySecondNumber));
    }
}



// --------------------------------------------------------------------------------------------------------------------
// Challenge 8:
//  Create a function that takes two numbers as a parameters and divides the first one by the second one.
// --------------------------------------------------------------------------------------------------------------------


public class Main{

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.println("Please Enter your first number: ");
        int myFirstNumber = number.nextInt();
        System.out.println("Please Enter your Second number: ");
        int mySecondNumber = number.nextInt();

        System.out.println("Your answer is : " +(myFirstNumber/mySecondNumber));
    }
}




// --------------------------------------------------------------------------------------------------------------------
// Challenge 9:
// Create a function that takes a number as a parameter and multiplies it by itself.
// --------------------------------------------------------------------------------------------------------------------


public class Main{

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.println("Please Enter your number: ");
        int myNumber = number.nextInt();


        System.out.println("Your answer is : " +(myNumber*myNumber));
    }
}



// --------------------------------------------------------------------------------------------------------------------
// Challenge 10:
// Create a function that takes two numbers and an operator as parameters. It should return a print out of the sum
// e.g. “1 + 2 = 3” or “4 x 6 = 24”.
// --------------------------------------------------------------------------------------------------------------------


public class Main{

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.println("Please Enter your first number: ");
        int myFirstNumber = number.nextInt();
        System.out.println("Please Enter your Second number: ");
        int mySecondNumber = number.nextInt();

        System.out.println("Your answer is : " + myFirstNumber + " + " + mySecondNumber +" = " + (myFirstNumber+mySecondNumber));
    }
}



// -------------------------------------------------------------------------------------------------------------------
// Challenge 11:
// Create a function that takes two numbers as a parameters and checks if the first one is greater than the second one.
// --------------------------------------------------------------------------------------------------------------------


public class Main{

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.println("Please Enter your first number: ");
        int myFirstNumber = number.nextInt();
        System.out.println("Please Enter your Second number: ");
        int mySecondNumber = number.nextInt();
        boolean hello = myFirstNumber>mySecondNumber;
        System.out.println(hello);

    }
}



// --------------------------------------------------------------------------------------------------------------------
// Challenge 12:
// Create a function that takes two numbers as a parameters and checks if the first one is less than the second one.
// --------------------------------------------------------------------------------------------------------------------

public class Main{

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.println("Please Enter your first number: ");
        int myFirstNumber = number.nextInt();
        System.out.println("Please Enter your Second number: ");
        int mySecondNumber = number.nextInt();
        boolean hello = myFirstNumber<mySecondNumber;
        System.out.println(hello);

    }
}


// --------------------------------------------------------------------------------------------------------------------
// Challenge 13:
// Create a function that takes two numbers as a parameters and checks if they are equal.
// --------------------------------------------------------------------------------------------------------------------


public class Main{

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.println("Please Enter your first number: ");
        int myFirstNumber = number.nextInt();
        System.out.println("Please Enter your Second number: ");
        int mySecondNumber = number.nextInt();
        boolean hello = myFirstNumber == mySecondNumber;
        System.out.println(hello);

    }
}


// --------------------------------------------------------------------------------------------------------------------
// Challenge 14:
// Create a function that takes two numbers as a parameters and returns the smaller of the two numbers.
// --------------------------------------------------------------------------------------------------------------------


public class Main{

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.println("Please Enter your first number: ");
        int myFirstNumber = number.nextInt();
        System.out.println("Please Enter your Second number: ");
        int mySecondNumber = number.nextInt();
        if(myFirstNumber>mySecondNumber){
            System.out.println(mySecondNumber);
        }else if(myFirstNumber<mySecondNumber){
            System.out.println(myFirstNumber);
        }

    }
}



// --------------------------------------------------------------------------------------------------------------------
// Challenge 15:
//  Create a function that takes two numbers as a parameters and returns the larger of the two numbers.
// --------------------------------------------------------------------------------------------------------------------


public class Main{

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.println("Please Enter your first number: ");
        int myFirstNumber = number.nextInt();
        System.out.println("Please Enter your Second number: ");
        int mySecondNumber = number.nextInt();
        if(myFirstNumber<mySecondNumber){
            System.out.println(mySecondNumber);
        }else if(myFirstNumber>mySecondNumber){
            System.out.println(myFirstNumber);
        }

    }
}



// --------------------------------------------------------------------------------------------------------------------
// Challenge 16:
// Create a function that takes a number as a parameter and checks if it is even.
// --------------------------------------------------------------------------------------------------------------------


public class Main{

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.println("Please Enter your first number: ");
        int myNumber = number.nextInt();

        boolean hello = myNumber % 2==0;
        System.out.println(hello);

    }
}




// --------------------------------------------------------------------------------------------------------------------
// Challenge 17:
// Create a function that takes a number as a parameter and checks if it is odd.
// --------------------------------------------------------------------------------------------------------------------


public class Main{

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.println("Please Enter your first number: ");
        int myNumber = number.nextInt();

        boolean hello = myNumber % 2!=0;
        System.out.println(hello);

    }
}




// --------------------------------------------------------------------------------------------------------------------
// Challenge 18:
// Create a function that takes a number between 0 and 100 and returns a grade based on this system
// "A": 90-100% "B": 80-89% "C": 70-79% "D": 60-69% "F": 0-59%.
// --------------------------------------------------------------------------------------------------------------------

public class Main{

    public static void main(String[] args) {


        Scanner number = new Scanner(System.in);
        System.out.println("Please Enter your first number: ");
        int myNumber = number.nextInt();
        if(myNumber>90){
            System.out.println("A");
        }else if(myNumber>80){
            System.out.println("B");
        }else if(myNumber>70){
            System.out.println("C");
        }else if(myNumber>60){
            System.out.println("D");
        }else if(myNumber>50){
            System.out.println("E");
        }else{
            System.out.println("F");
        }

    }
}




// --------------------------------------------------------------------------------------------------------------------
// Challenge 19:
// Create a function that takes two strings as a parameters and returns the strings concatenated.
// --------------------------------------------------------------------------------------------------------------------


public class Main{

    public static void main(String[] args) {

        Scanner String = new Scanner(System.in);
        System.out.println("Please Enter Something: ");
        String myFirstSomething = String.next();
        System.out.println("Please Enter Something else: ");
        String mySecondSomething = String.next();

        System.out.println(myFirstSomething + mySecondSomething);
    }
}




// --------------------------------------------------------------------------------------------------------------------
// Challenge 20:
// Create a function that takes a string as a parameter and counts the number of vowels in it and returns the result.
// -------------------------------------------------------------------------------------------------------------------

public class Main {
    public static void main(String args[]){
        int count = 0;
        System.out.println("Enter a sentence :");
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();

        for (int i=0 ; i<sentence.length(); i++){
            char ch = sentence.charAt(i);
            if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == ' '){
                count ++;
            }
        }
        System.out.println("Number of vowels in the given sentence is " + count);
    }
}