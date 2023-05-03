package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        String str ="1";
        for(int i = 2, j = cathetusLength; j>0; i++, j--)
        {
            System.out.println(" ".repeat(j-1) + str);
            str = i+str+i;

        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
