
    /*
       Given an integer array nums , return true if any value appears at least twice
       in the array and return false if every element is distinct.

       input  : [ 2,3,5,2]
       output : true

       input  : [1,2,3,4]
       output :  false

    */
package arrayAssignment;
public class AA {
     public static boolean TrueFalse(int nums[]){
        for(int i = 0 ; i<=nums.length-1 ; i++){
            for(int j = i+1 ; j<= nums.length-1 ;j++){
                if(nums[i]==nums[j]){
                    return true ;
                }
            }
        }
        return false ;

     }

     public static void main(String[] args) {
        
        int nums[]= {1,2,3,5};
        System.out.println(TrueFalse(nums));
     }
}
