public class Question5 {

    int add(int a, int b) {
        return a + b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    int square(int a) {
        return a * a;
    }

    public static void main(String[] args) {

        Question5 q = new Question5();

        int result1 = q.square(q.add(q.multiply(3, 4), q.multiply(5, 7)));
        int result2 = q.square(q.add(4, 7)) + q.square(q.add(8, 3));

        System.out.println(result1);
        System.out.println(result2);
    }
}


