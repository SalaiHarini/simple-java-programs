
class AdditionThread extends Thread {
 public void run() {
     int a = 10, b = 5;
     System.out.println("Addition: " + (a + b));
 }
}

class SubtractionThread extends Thread {
 public void run() {
     int a = 10, b = 5;
     System.out.println("Subtraction: " + (a - b));
 }
}


class MultiplicationThread extends Thread {
 public void run() {
     int a = 10, b = 5;
     System.out.println("Multiplication: " + (a * b));
 }
}

class DivisionThread extends Thread {
 public void run() {
     int a = 10, b = 5;
     if (b != 0) {
         System.out.println("Division: " + (a / b));
     } else {
         System.out.println("Division by zero not allowed");
     }
 }
}

public class Arithmeticthreads {
 public static void main(String[] args) {
     AdditionThread t1 = new AdditionThread();
     SubtractionThread t2 = new SubtractionThread();
     MultiplicationThread t3 = new MultiplicationThread();
     DivisionThread t4 = new DivisionThread();

     t1.start();
     t2.start();
     t3.start();
     t4.start();
 }
}

