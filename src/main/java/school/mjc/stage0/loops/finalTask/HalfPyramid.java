package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        String str = "*";
        for(int i = 2, j = cathetusLength; j>0; i++, j--)
        {
            System.out.println(" ".repeat(j-1) + str);
            str = "*"+str;

        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
