package chapter05;

public class Shoesize {
    public static void main(String[] args) {
        int[] shoesize = new int[10];
        for (int i=0; i < 10; i++){
            shoesize[i] = 250 + i * 5;
        }
        for (int i=0; i< shoesize.length; i++) {
            System.out.println("사이즈 " + shoesize[i] + " (재고 있음)");
        }
    }
}
