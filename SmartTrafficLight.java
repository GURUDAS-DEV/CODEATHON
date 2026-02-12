// Hello judges! A very good afternoon!!
//According to the question we have design a program that tells about the light that blinks on particular timestamps
//SO here is the solution : 

// Features of My code 
// 1) Modularity
// 2) Best time complexity
// 3) Custom user Input
// 4) Using JAVA Real Principle
// 5) Reusability
// 6) No Memory Leak : There is no scope of memorry leak 
import java.util.Scanner;

public class SmartTrafficLight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//declaring the scanner class for input
        
        //Taking Input : 
        System.out.print("Enter the Time, which you have check the Light is Blinked(In seconds only) :  ");
        int num = sc.nextInt();

        //if input is not valid then just return;
        if(num < 0){   
            System.out.println("Invalid Timestamp!!! Must be a positive value!!");
            sc.close();
            return;
        }

        //creating the object : 
        solution sol = new solution();
        sol.solve(num);

        sc.close();
    }
}

// Solution Time Complexity : 
// Time Complexity : O(1)
// Space Complexity : O(1)

// Logic : 
// 1) I have intialized green, yellow, red with : 
// Green : 30 
// Yellow : 5
// Red : 25
// This makes the cycle of total 60 second : 
// 2) Hence we know that we have total cycle of 60 second so, if entered value is lesser than 60 second than nothing to worry about this is staight forward.
// 3) The main problem comes in case when the timestamp is greater than our cycle means 60 second : 
// SO, for that what we have done is taken modulo of the value, so that we can make time category under 60 second and can take decision on that behalf.
// 4) So that's why i have taken modulo.
// 5) Hence : This makes solution correct.

// IMPORTANT : 
// I have taken time as 0 to 30 so if time is 30 then this means light should be green
class solution{
    int green = 30;
    int yellow = 5;
    int red = 25;

    void solve(int num){
        int cycle = green + yellow + red;
        num = num % cycle;
        
        if(num < 30){
            System.out.println("The Current Light is Green");
        }
        else if(num < 35){
            System.out.println("The Current Light is Yellow");
        }
        else{
            System.out.println("The Current Light is Red");
        }
    }
}
