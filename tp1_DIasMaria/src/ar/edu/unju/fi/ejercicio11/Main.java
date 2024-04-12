package ar.edu.unju.fi.ejercicio11;


public class Main {
    public static void main(String[] args) {
        int i = 2;
        int j = 40;
        int num = 80;

        
        for (;num>=0 ; i++,j--) {
        	 System.out.print(" " + num);
        	 num = num + (j-i-1);
          
        }
    }
}
