public class ArraysLoops {
    public static void main(String[] args) {
        int[] a = new int[6];
        System.out.println(a[0]);
        System.out.println(a[4]);
        a[0] = 4;
        a[1] = 74;
        a[3] = -7;
        a[4] = 1;
        a[5] = 1;
        System.out.println(a[0] + a[4]);
        System.out.println(a.length);
        System.out.println(a[0] + a[a.length - 1]);

        int[] array = {4, 1, -8, 0, 3, 4, 6};
        System.out.println(array[0] + array[array.length - 1]);
        int[] x;
        x = new int[]{5, 4, 7, 8, 9};
        System.out.println(x[3]);

        int y = -4;

        if (y > 0)
            System.out.println("Positive");
        else
            System.out.println("Non Positive");


        int b;
//    if(y > 0)
//    b = 1;
//    else
//    b = 0;
//        System.out.println("ARA" + b);

        y = -10;
        b = y > 0 ? 1 : 0;
        System.out.println(b);
        String h = y > 0 ? "Positive" : "Non Positive";
        System.out.println(h);
        System.out.println(y > 0 ? "positive" : "Non positive");
        System.out.println("*******************************************************");
        int g = 0;

        if (g > 0) {
            System.out.println("Positive");
        } else {
            if (g < 0)
                System.out.println("Negative");
            else
                System.out.println("Zero");
        }

        System.out.println(g > 0 ? "positive" : (g < 0 ? "negative" : "Zero"));

        g = 5;
        if (g == 1) {
            System.out.println("One");
        } else if (g == 2) {
            System.out.println("Two");
        } else if (g == 3) {
            System.out.println("Three");
        } else
            System.out.println("Bigger");

        System.out.println("--------------------------------------------------------");

        g = 4;
        switch (g) {
            case 2:
                System.out.println("Two");
                break;
            case 1:
                System.out.println("One");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
            case 5:
                System.out.println("Java");
                break;
            default:
                System.out.println("Bigger");
        }

        System.out.println("----------------------------------------");
        int counter = 1;
        while (counter < 11) {
            System.out.println(counter++ + " ");
        }
        System.out.println("---------------------------------------------------------");


        System.out.println("-----------------FINISH------------------------------");

        g = 11;
        do {
            System.out.println("Barev");
            g++;
        }
        while (g <= 4);

        int o = 1;
        while (o <= 3) {
            System.out.println("Aksel Mnatsakanyan");
            o++;
        }
        System.out.println("***********************************************");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "");

        }
        int i = 5;
        System.out.println(i);

        System.out.println("------------------------------------------");

        g = 5;
        while (g <= 10) {
            System.out.println(g + " ");
            g++;
        }
        System.out.println("test " + g);
        System.out.println("-------------------------------------------------------");
        String[] names = {"Aksel", "Mamikon", "Edgar", "Davit", "Anna"};
//        System.out.println(names[0]);
//        System.out.println(names[1]);
//        System.out.println(names[2]);
//        System.out.println(names[3]);
//        System.out.println(names[4]);
        System.out.println("------------------------------------------");
//        for (int index = 0; index< names.length; index++){
//            System.out.println(names[index]);
//        }

        for (int j = 0; j < names.length; j++) {
            if (j % 2 == 0)
                System.out.println(j);
        }
        System.out.println("------------------------------------------");

        for (String s : names) {
            System.out.println(s);
        }

        System.out.println("--------------------CODEEEE----------------------");
        System.out.println(names[names.length - 1]);
        System.out.println(names[names.length - 2]);
        System.out.println(names[names.length - 3]);
        System.out.println(names[names.length - 4]);
        System.out.println(names[0]);
        System.out.println("********************************************");
        for (int j = names.length-1; j >=0 ; j--) {
            System.out.println(names[j]);
        }
        System.out.println("-----------------------------------------------------------------");
        for (int j = 0; j < 20; j=j+2) {
            if(j == 10){
                System.out.println("555");
            }
            System.out.println("Aksel");

        }

        System.out.println("--------------------------------");

        int[] array1 = {4, -8, 4, 1, 3, -1};
        for (int j = 0; j < array1.length; j++) {
//            System.out.println(array1[j] < 0 ? "Minusova" : "Plyusova");
            if(array1[j] < 0) {
                System.out.println(array1[j]);
            }

            }
        System.out.println("////////////////////////////////////////////////////");
        for(int sss:array1){

            if(sss<0){
                System.out.println("Ayooo" + sss);
                break;
            }
        }
        System.out.println("-----------------------------------");

        for (int j = 0; j < 10; j++) {
            if (j == 5)
                continue;
                System.out.println(j);
        }

        int[] array3 = {1,5,6,9,4,8,9,3,3};
        for(int ii:array3){
           if(ii == 9)
               continue;
            System.out.println("Tochniyaaaaaa");
        }

        System.out.println("*********************************************");

        int ppp = 1;
        while (ppp < 3) {
            System.out.println(ppp++ + " Barevv");
        }



        }


    }

