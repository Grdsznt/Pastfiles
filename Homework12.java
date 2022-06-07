class Homework12 {

    public static int factorial(int n) {
        if (n == 0) {
                return 1;
        } else {
                return n * factorial(n-1);
        }
    }

    public static void pascal(int n) {
        if (n == 1) {
            System.out.println("1");
        } else if (n < 1) {
            System.out.println("Please enter a number greater than 0");
        }  else {
            int x,y,z,a;
            for (x = 0; x<n; x++) {
                for (y = 0; y>n; y--) {
                    System.out.println(" ");
                    for (z = 0; z<n; z++);
                    a = factorial(x)/factorial(y)*factorial(x-y);
                    System.out.println(a+" ");
                }
            }
            System.out.println();
        }
    }

    
}

class exec {

    public static void main(String[] args) {
        Homework12.pascal(3);
    }
}
