public class PassByValueFigure {
    public static void main(String[] args) {
        Walrus walrus = new Walrus(3500, 10.5);
        int x = 9;

        doStuff(walrus, x);
        System.out.println(walrus);
        System.out.println(x);
    }

    public static void doStuff(Walrus W, int x) {
        W.weight = W.weight - 100;
        x = x - 5;
    }

   public static class Walrus {
      public int weight;
      public double tuskSize;
      
      public Walrus(int w, double ts) {
         weight = w;
         tuskSize = ts;
      }

/*  For those who are testing in Java Visulaizer toString() function creates problem
 *  it either throws timeout or keeps running without any output
 * 
 *  Removing this functon only for sake of visualizing will helps begginers instead banging thier heads*/
 
/*      public String toString() {
        return String.format("weight: %d, tusk size: %.2f", weight, tuskSize);
      }
/*
 * I didn't find use of this function simply comment out or remove this function again this creates confusion 
 * for begginers who are now to OOP
*/
      public void lose100lbs() {
        weight -= 100;
      }*/
   }    
} 
