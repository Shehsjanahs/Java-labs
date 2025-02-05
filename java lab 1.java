//Lab 01 --->Task -1

class task{
public static void main(String[] args){

System.out.println("///////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
System.out.println("==\t\tStudent Points\t\t==");
System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\//////////////////////////");
System.out.println("Name    \t\tLab\tBonus\tTotal");
System.out.println("----    \t\t---\t-----\t-----");
System.out.println("Joe     \t\t43\t7\t50");
System.out.println("William \t\t50\t8\t58");
System.out.println("Mary Sue\t\t39\t10\t49");
} 
}



//Lab 01 --->Task -2


import java.util.Scanner;
public class operator{

public static void main(String args[]){
Scanner src=new Scanner(System.in);
System.out.println("\nThis is a long string that is the the "+
                   "concatenation of two shorter strings.");

System.out.println("The first computer was invented about " + 55 + 
                   " years ago.");

System.out.println("8 plus 5 is " + 8 + 5);
System.out.println("8 plus 5 is " +(8 + 5));
System.out.println(8 + 5 +" equals 8 plus 5.");


}
}




//Lab 01 --->Task -3

import java.util.Scanner;
public class student_database{


public static void main(String args[]){
Scanner src=new Scanner(System.in);
String name="Mr AI";
short age=21;
double gpa=3.15;
char gender='M';
boolean foreigner=false;
int ID=182;

System.out.println("Name: "+name);
System.out.println("Age: "+age);
System.out.println("GPA: "+gpa);
System.out.println("Gender: "+gender);
System.out.println("foreigner: "+foreigner);
System.out.println("Student ID: "+ID);

}
}



//Lab 01 --->Task -4

import java.util.Scanner;
public class Expression{
public static void main(String args[]){
Scanner src=new Scanner(System.in);
System.out.println((10+5)*(4-6)/4);

}
}




//Lab 01 --->Task -5

import java.util.Scanner;
public class pattern{

public static void main(String args[]){
Scanner src=new Scanner(System.in);
System.out.print("\n\t*\n*\t*\n*\t*\n*");

}}



//Lab 01 --->Task -6

import java.util.Scanner;
public class task6{

public static void main(String args[]){
Scanner src=new Scanner(System.in);
System.out.print("Enter the Dollors: ");
double dollors= src.nextDouble();
System.out.println("Values in rupees: "+dollors*278.64);


}
}



//Lab 01 --->Task -7

import java.util.Scanner;
public class Volume{
    
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Enter the radius of the cylinder: ");
double radius = scanner.nextDouble();
System.out.print("Enter the height of the cylinder: ");
double height= scanner.nextDouble();
double pi=3.14159;
double volume=pi*radius*radius*height;
System.out.println("The volume of the cylinder is: "+volume);

}
}




//Lab 01 --->Task -8





import java.util.Scanner;

public class SpeedX{



public static void main(String args[]){

Scanner src=new Scanner(System.in);



System.out.print("Enter a speed in miles per hour: ");

int speed=src.nextInt();

System.out.println("The converted value is: "+(speed*1.6));



}

}


//Lab 01 --->Task -9


import java.util.Scanner;
public class Calculator{

public static void main(String args[]){
Scanner src=new Scanner(System.in);
System.out.println("Calculator\n");
System.out.print("Enter the First Number: ");
int num1=src.nextInt();
System.out.print("Enter the operation('+','-','/','*'): ");
char sign=src.next().charAt(0);
System.out.print("Enter the Second Number: ");
int num2=src.nextInt();

if(sign=='+'){
System.out.println("The Addition is: "+(num1+num2));
}
else if(sign=='-'){
System.out.println("The substraction is: "+(num1-num2));
}
else if(sign=='/'){
System.out.println("The Division is: "+(num1/num2));
}
else if(sign=='*'){
System.out.println("The Multiplication is: "+(num1*num2));
}
else{
System.out.println("Type Arithmatic operations which are mentioned!");
}
}
}