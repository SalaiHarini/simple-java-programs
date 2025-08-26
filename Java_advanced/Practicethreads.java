
class Countdown extends Thread {
 public void run() {
     int i=0;
     for(i=10;i>0;i--){
     System.out.println(i+"\n");}
 }
}

class AlphabetPrint extends Thread {
 public void run() {
     char c;
     for(c='A';c<='Z';c++){
     System.out.println(c+" ");}
 }
}


class PrintThread extends Thread {
 public void run() {
    for(int i=0;i<5;i++){
     System.out.println("Thread is running");}
 }
}

public class Practicethreads {
 public static void main(String[] args) {
     Countdown t1 = new Countdown();
     AlphabetPrint t2 = new AlphabetPrint();
     PrintThread t3 = new PrintThread();

     t1.start();
     t2.start();
     t3.start();
 }
}

