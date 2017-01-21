/**
 * Created by mb977 on 1/17/17.
 */
public class towersOfHanoi {

    public static void solve(int n, String tower1, String tower2, String tower3){
        if(n==1){
            System.out.println("Move Disk 1 from "+ tower1 +" to " +tower3 );
        }
        else{
            solve(n-1, tower1,tower3, tower2);
            System.out.println("Move Disk "+ n + " from " + tower1 + " to " + tower3);
            solve(n-1, tower2, tower1, tower3);



        }
    }
}
