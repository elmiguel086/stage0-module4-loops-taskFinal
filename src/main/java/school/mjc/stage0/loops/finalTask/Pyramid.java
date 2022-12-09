package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        int a;
        for (int i = 1; i <= cathetusLength; i++) {
            for (int j = 1; j <= cathetusLength-i; j++) {
                System.out.print(" ");
            }
            a=i;
            for (int j = 1; j <= i; j++) {
                System.out.print(a--);
            }
            a=2;
            if(i>=2){
                for (int j = 1; j <= i-1; j++) {
                    System.out.print(a++);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
