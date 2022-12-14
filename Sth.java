class Main {

    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    double sum(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Using int sum " + sum(2, 3));
        System.out.println("Using float sum " + sum(2f, 3f));

        System.out.println("Using double sum " + sum(2f, 3f));

        int[] array = new int[] = {1, 2, 3, 4, 5};

        int s = 0;
        for(int i = 0; i < array.length; i ++) {
            s = sum(s, array[i]);
        }

        System.out.println("Total sum using int sum method is ", s);
    }
}