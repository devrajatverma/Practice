package competitive;

public class UnionAndIntersectionOfTwoArray {

    int[] a = {1, 2, 3, 4, 5};//1 2 3 4 5
    int[] b = {1, 2, 3};

    void union() {
        int index_a = 0;
        int index_b = 0;

        while (index_a < a.length && index_b < b.length) {
            if (a[index_a] < b[index_b]) {
                System.out.print(a[index_a++]);
            } else if (a[index_a] == b[index_b]) {
                System.out.print(a[index_a++]);
                index_b++;

            } else if (a[index_a] > b[index_b]) {
                System.out.print(b[index_b++]);
            }
        }

        while (index_a < a.length) {
            System.out.print(a[index_a++]);
        }
        while (index_b < b.length) {
            System.out.print(b[index_b++]);
        }
    }

    void intersection() {
        int index_a = 0;
        int index_b = 0;

        while (index_a < a.length && index_b < b.length) {
            if (a[index_a] < b[index_b]) {
                index_a++;
            } else if (a[index_a] == b[index_b]) {
                System.out.print(a[index_a++]);
                index_b++;

            } else if (a[index_a] > b[index_b]) {
                index_b++;
            }
        }
    }

    public static void main(String[] args) {
        UnionAndIntersectionOfTwoArray u = new UnionAndIntersectionOfTwoArray();
        System.out.println("Union ");
        u.union();
        System.out.println("\nIntersection ");
        u.intersection();

    }
}
