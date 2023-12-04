public class Operations {
    public static void main(String[] args) {
        String firstName = "Aksel";
        System.out.println(firstName);
        int a = 4, b = 3;
        int c = a - b;
        System.out.println(c);
        System.out.println(a * b);

        int x = 7, y = 5;
        System.out.println(x % y);
        double t = 7.0, p = 5.0;
        System.out.println(t / p);

        x = 5;
        ++x;
        System.out.println(x);

        x = 4;
        System.out.println(++x);
        System.out.println(x);

        x = 3;
        y = 4;
        c = ++x - --y;
        System.out.println("x= " + x);
        System.out.println("y= " + y);
        System.out.println("c= " + c);


        boolean bb = x == 4;
        System.out.println(bb);
        System.out.println(x != 4);

        int k = 110;
        System.out.println(k <= 5);
        System.out.println(k % 2);
        System.out.println(k % 2 == 0);
        System.out.println("------------------------------");
        System.out.println(k >= 1 && k <= 11);

        boolean mianish = k >= 1 && k <= 9;
        System.out.println(mianish);

        boolean stugum = k < 0 | k > 100;
        System.out.println(stugum);

        stugum = false;
        System.out.println(!stugum);
        System.out.println(5 & 8);
        System.out.println(17 & 24);
        System.out.println(5 | 8);
        System.out.println(5 ^ 8);

        int q = 5;
        q += 2;
        System.out.println(q);

        q = 20;
        q &= 5;
        System.out.println(q);


    }
}
