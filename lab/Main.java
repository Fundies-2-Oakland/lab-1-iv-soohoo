package lab;

public class Main {
    public static void main(String[] args) {
        Vector3D vec = new Vector3D(3.5, 4.0, 5.0);

        System.out.println("Vector (3.5, 4.0, 5.0)");
        System.out.println("Question 2a: getX " + vec.getX());
        System.out.println("Question 2b: getY " + vec.getY());
        System.out.println("Question 2c: getZ " + vec.getZ());

        System.out.println("Question 3: " + vec);
    }
}