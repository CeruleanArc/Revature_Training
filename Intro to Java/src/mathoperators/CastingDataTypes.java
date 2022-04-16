package mathoperators;

public class CastingDataTypes {

    public void start() {

        long a = 10393l;
        int i = (int)a;
        System.out.println(i);

        /* To cast, specify the data type in parentheses in front of the variable being converted.
        When upcasting, you cast to a data type that encompasses a larger range.
        When downcasting, you cast to a data type that encompasses a smaller range. */

        int x = 200;
        short s = (short)x;
        System.out.println(s);

        double d = (double)x;
        System.out.println(d);

        byte b = (byte)x;
        System.out.println(b);

    }

}
