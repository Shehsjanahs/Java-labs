Lab 02                                                                                                                                                                                                                                                          //Lab 02 --->Task -1

import java.util.Scanner;
public class Array_Const{
public static void main(String[] args){
Scanner src=new Scanner(System.in);
char[] const_arr={'m','a','q','s','o','o','d'};
System.out.print("Enter any character: ");
char var=src.next().charAt(0);
if(var==const_arr[0] || var==const_arr[1] || var==const_arr[2] || var==const_arr[3] || var==const_arr[4] 
|| var==const_arr[5] || var==const_arr[6] ){
System.out.println("Character "+var+" is present!");
}
else{
System.out.println("Character "+var+" is not present!");
}
}
}




//Lab 02 --->Task -2


import java.util.Scanner;
public class Multiple_four{
public static void main(String[] args){
Scanner src=new Scanner(System.in);
int sum=0;
int arr[] =new int[10];
for(int I=0; I<arr.length; I++){
System.out.print("Enter the Number at "+I+" Index: ");
arr[I]=src.nextInt();
if(arr[I]%4==0){
sum+=arr[I];
}
}
System.out.println("\nThe Sum of multiple of 4 is: "+sum);
}
}



//Lab 02 --->Task -3

import java.util.Scanner;
public class Matrix{
public static void main(String[] args){
Scanner src=new Scanner(System.in);
int sum=0;
System.out.print("Enter the number of rows: ");
int row=src.nextInt();
System.out.print("Enter the number of Col: ");
int col=src.nextInt();
int matrix1[][]=new int[row][col];
int matrix2[][]=new int[row][col];
for(int I=0; I<row; I++){
  for(int j=0; j<col; j++){
System.out.print("Enter the elements of first matrix: ");
matrix1[I][j]=src.nextInt();
}
}

for(int I=0; I<row; I++){
  for(int j=0; j<col; j++){
System.out.print("Enter the elements of Second matrix: ");
matrix2[I][j]=src.nextInt();
}
}

System.out.println("\nSum of Matrices");
for(int I=0; I<row; I++){
 for(int j=0; j<col; j++){
sum=matrix1[I][j]+matrix2[I][j];
System.out.print(sum+"\t");
}
System.out.println();
}
}
}







//Lab 02 --->Task -4

import java.util.Scanner;
public class check_name{
public static void main(String[] args){
Scanner src=new Scanner(System.in);
String[] name={"Maqsood","Sana","Ali"};
String check;
System.out.print("Enter the Name: ");
check=src.nextLine();
for(int I=0; I<name.length; I++){
if(name[I].equalsIgnoreCase(check)){
System.out.print("Name Ali/ali Found!");
break;
}
else{
System.out.println("Name Ali/ali not Found!");
}
}
}
}

//Lab 02 --->Task -5

public class MatrixNChecker{
public static void main(String[] args){
int[][] matrix={
               {1,1,0,0,1},
               {1,0,1,0,1},
               {1,0,0,1,1},
               {1,0,0,0,1}};
for(int[] row : matrix){
for(int num : row){
System.out.print(num+" ");
}
System.out.println();
}
int rows=matrix.length;
int cols=matrix[0].length;
Boolean contains=false;
for (int I=0; I<rows-2; I++){
for (int j=0; j<cols-2; j++){
if(matrix[I][j]==1 && matrix[I + 1][j + 1] == 1 && matrix[I+2][j+2]==1 &&
matrix[I+1][j]==0 && matrix[I][j+1]==1 && matrix[I+2][j+1]==0){
contains=true;
break;
}
}
}
if(contains){
System.out.println("The matrix contains the letter 'N'.");
}else{
System.out.println("The matrix does not contain the letter 'N'.");
}
}
}





//Lab 02 --->Task -6
import java.util.Scanner;
public class Eligibility{
public static void main(String[] args){
Scanner src=new Scanner(System.in);
System.out.print("Enter the age: ");
short age=src.nextShort();
String result=(age>18)?"You are eligible!":"Sorry! You are not eligible!";
System.out.println(result);
}
}


//Lab 02 --->Task -7

import java.util.Arrays;
public class ArrayMinMaxChecker{
public static void main(String[] args){
int[] array = {3,8,1,6,10,15,2};        
int min=array[0];
int max=array[0];        
for(int num:array) {
if(num<min){
min=num;
}
if(num>max){
max=num;
}
}
System.out.println("Smallest element: " + min);
System.out.println("Largest element: " + max);
if(max%2==0){
System.out.println("The largest element "+max+" is a multiple of 2.");
} else{
System.out.println("The largest element " + max + " is not a multiple of 2.");
}
}
} 