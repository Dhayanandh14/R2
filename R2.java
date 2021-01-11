import java.util.*;
class R2 {
  public static void main(String[] args) {
    Scanner kbd = new Scanner(System.in);
    
    int R1= kbd.nextInt();
    int S= kbd.nextInt();
    if(R1<=1000 && S <=1000){
      int R2 = (S*2)-R1;
      System.out.print(R2);
    }
    kbd.close();
  }
}