public class Yikes {

 public static void go(Long n) {System.out.print("Long ");}
 public static void go(long n) {System.out.print("long ");}
 public static void go(Short n) {System.out.print("Short ");}
 public static void go(int n) {System.out.print("int ");}
 public static void main(String [] args) {
 short y = 6;
 //int z = 7;
 go(y);
// go(z);
 }
 }