public class WhatIsThis {
 public static void main(String[] args) {
 int num1 = 10, num2 = 50;
 if (num1 <= 0) {
 System.out.println("invalid num1");
 } else if (num1 < 100) {
 System.out.println("num1 is less than 100");
 if (num1 > num2) {
 System.out.println("num1 is larger");
 } else {
 System.out.println("num1 is smaller");
 }
 } else {
 System.out.println("num1 is 100 or more");
 }
 }
}
