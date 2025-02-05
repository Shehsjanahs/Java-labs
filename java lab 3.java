



//Lab 03 --->Task -1

import java.util.Scanner;
public class pri_num{
public static void main(String args[]){
Scanner src=new Scanner(System.in);
int start=3;
int end=100;
for(int num=start; num<=end; num++){
boolean isPrime=true;
for(int i=2; i<num; i++){
if(num%i==0){
isPrime=false;
break;
}}
if(isPrime){
System.out.println(num);
}  
}
}
}


//Lab 03 --->Task -2

import java.util.Scanner;
public class pallindrom{
public static void main(String args[]){
Scanner src=new Scanner(System.in);
String pall="level";
String rev="";
for(int i=pall.length()-1; i>=0; i--){
rev=rev+pall.charAt(i);
} 
if(pall.equals(rev)){
System.out.println("\nText is Pallindrom");
}
else{
System.out.println("Text is not Pallindrom");
}
}
}


//Lab 03 --->Task -3

public class MatrixOperations{
public static void main(String[] args){
int[][] matrix={
            {12,13,15,16},
            {11,110, 121,17},
            {17,18,100,21}};
for(int i=0; i<matrix.length; i++){
for(int j=0; j<matrix[i].length; j++){
if(matrix[i][j]%2==0){
matrix[i][j]/=2;
}
}
}
System.out.println("Odd Numbers in the matrix:");
for(int[] row:matrix){
for(int num:row){
if(num%2 != 0) {
System.out.print(num+" ");
}
}
}
int sumEven=0;
for(int[] row: matrix){
for (int num: row){
if(num%2==0){
sumEven+=num;
}
}
}
System.out.println("\nSum of updated even numbers: "+ sumEven);
}
}


//Lab 03 --->Task -4

public class ArrayOperations{
public static void main(String[] args) {
int[] array = new int[10];
int i=0, num=1;
do{
array[i]= num*num;
num++;
i++;
}while (i<9);
array[9]=0;
System.out.print("Array: ");
for(int val : array) {
System.out.print(val + " ");
}
System.out.println();
int sum = 0, index= 0;
while(index < array.length) {
if(array[index] == 81) {
break;
}
if(array[index]%2!=0) {
sum+=array[index];
}
index++;
}      
System.out.println("Sum of odd numbers before encountering 81: " + sum);
}
}




//Lab 03 --->Task -5

import java.util.Scanner;
public class Reservation_System{
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int rows = 5, cols=5;
boolean[][] seats=new boolean[rows][cols]; // false = available, true = reserved
int choice;
do{
System.out.println("\n1. Display available seats");
System.out.println("2. Reserve a seat");
System.out.println("3. Exit");
System.out.print("Enter your choice: ");
choice=scanner.nextInt();
switch(choice) {

case 1:
System.out.println("Available seats(false = available, true=reserved):");
for(int i=0; i<rows; i++){
for(int j=0; j<cols; j++){
System.out.print(seats[i][j] + " ");
}
System.out.println();
}
break;

case 2:
System.out.print("Enter row number (1-"+ rows+ "): ");
int row = scanner.nextInt() - 1;
System.out.print("Enter column number(1-"+cols+ "): ");
int col = scanner.nextInt() - 1;
if(row >=0 && row <rows && col>=0 && col < cols) {
if(!seats[row][col]){
seats[row][col]=true;
System.out.println("Seat reserved successfully!");
}else{
System.out.println("Seat is already reserved.");
}
}else{
System.out.println("Invalid range.");
}
break;

case 3:
System.out.println("Exiting...");
break;

default:
System.out.println("Invalid choice. Please try again.");
}
}while(choice!=3);

}
}



