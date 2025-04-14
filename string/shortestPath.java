package string;

public class shortestPath {
    public static void main(String[] args) {
        String path="WNEENESENNN";
        System.out.println(ShortestPath(path));
    }
    public static float ShortestPath(String path){
        int x = 0 , y = 0 ;
        for(int i =0 ;i<path.length();i++){
            
            char dir = path.charAt(i);
            if (dir =='S') {
                //South
                y-- ;
            }
            else if(dir == 'N'){
                // north
                y++ ;

            }
            if (dir =='W') {
                //West
                x++ ;
            }
            else if(dir == 'E' ){
                // East
                x-- ;

            }
        }
        int x2 = x*x ;
        int y2 = y*y ;
        return (float)Math.sqrt(x2+y2);
    }
}
