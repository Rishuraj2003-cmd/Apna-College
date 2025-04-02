package array;

public class LinearSearch {
    public static int Search(int marks[], int key){
        for(int i = 0 ; i< marks.length ; i++){
            if (marks[i]== key) {
                return i ;
            }

        }
        return -1 ;
    }
    public static void main(String[] args) {
        int marks[]={2,5,3,4,6};
        int key = 2 ;
        int index = Search(marks, key);
        if (index == -1) {
            System.out.println("Element Not found !! ");
            
        }
        else{
           
           System.out.println("Element found @ " +index);
        }
    }
}
