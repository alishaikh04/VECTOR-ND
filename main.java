import java.util.List;

public class main {
    public static void main(String[] args) {
        
        List<Double> list1 = List.of(1.0,2.0,5.0);
        List<Double> list2 = List.of(3.0,4.0,9.0);

        vector v1 = new vector(list1);
        vector v2 = new vector(list2);

        System.out.println("vector v1 = " + v1);
        System.out.println("vector v2 = " + v2);

        v1.set(1, 7.0);
        System.out.println("After some changes v1 now become = " + v1);

        vector v3 = v1.add(v2);
        System.out.println("Adding two vector is : " + v3);

        vector v4 = v3.clone();
        System.out.println("Clone of Addition vector : " + v4);
        
        vector v5 = v1.subtract(v2);
        System.out.println("Substracting vector : " + v5);

        vector v6 = v5.clone();
        System.out.println("Clone of subtracting vector : " + v6);
        
        double v7 = v1.dotProduct(v2);
        System.out.println("Dot Product of vectors : " + v7);

        double v8 = v7;
        System.out.println("Clone Dot product vector : " + v8);
        
        double v9 = v1.magnitude();
        System.out.println("Magnitude : " + v9);

        double v10 = v9;
        System.out.println("Magnitude Clone : " + v10);

        vector v11 = v1.crossProduct(v2);
        System.out.println("Cross Product of vector : " + v11);
        
        vector v12 = v11.clone();
        System.out.println("Clone of Cross Product : " + v12);

        System.out.println("Showing that v3 is eqaul to v4 : " + v3.equals(v4));

        System.out.println("Iterating v1: ");
        for(double val : v1){
            System.out.println(val + " ");
        }
        
    }
}
