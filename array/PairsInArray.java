package array;

public class PairsInArray {
    public static void PairNumber(int num[]) {
        int count=0 ;
        for (int i = 0; i < num.length; i++) {
            int curr = num[i];
            for (int j = i + 1; j < num.length; j++) {
                System.out.print("(" + curr + "," +num[j] +")");
                count++ ;
            }
            System.out.println();
        }
        System.out.println("total pairs : " +count);
    }

    public static void main(String[] args) {
        int num[] = { 2, 4, 6, 8 };
        PairNumber(num);

    }
}
