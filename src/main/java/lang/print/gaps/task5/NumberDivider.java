package lang.print.gaps.task5;

public class NumberDivider {
    void divide(int toBeDivided) {
        double result = toBeDivided / 5.0;
        System.out.println(result);
    }

    public static void main(String[] args) {
        NumberDivider numberDivider = new NumberDivider();
        numberDivider.divide(12);
        numberDivider.divide(25);
    }
}
