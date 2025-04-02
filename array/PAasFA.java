package array;

public class PAasFA {
    public static void update(int marks[]){
        for(int i = 0 ; i<marks.length ;i++){
            marks[i]=marks[i]+1 ;
        }
    }
    public static void main(String[] args) {
        int marks[]={99,94,93};
        update(marks);
        // printing marks
        for(int i = 0 ; i<marks.length;i++){
            System.out.println("Marks Obtained : " +marks[i] + "");
        }
        System.out.println();

    }
}
