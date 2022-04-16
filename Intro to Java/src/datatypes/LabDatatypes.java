package datatypes;

public class LabDatatypes {

    public void start() {

        boolean on = false;
        System.out.println(on);

        short s = 16;
        System.out.println(s);

        int i = -32;
        System.out.println(i);

        /* float f = 3839.34839;
        System.out.println(f);

        THe compiler expects numbers with decimal places to be double type values.
        We have to edit our code to specify that we want a float.
        We do this by adding an f after the value. */

        float f = 3839.34839f;
        System.out.println(f);

        /* long l = 4294967296;
        System.out.println(l);

        The compiler thinks that the whole number is an int, not a long.
        We have to edit our code to tell the compiler that we want a long.
        We do this by adding an l or an L after the value. */

        long l = 4294967296l;
        System.out.println(l);

        char c = 'a';
        System.out.println(c);

    }

}
