import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

 class Test {

    static long testCases,n;
    
    static BufferedReader in=new BufferedReader( new InputStreamReader( System.in ) );
    
    static void solve(long n){
        
        if( n%2==0 ){

         System.out.println( n/2 );

        }else{

           System.out.println( (n-1)/2+1 );

        }
        
    }
    
    public static void main(String[] args) throws IOException {
        
        testCases=Long.parseLong( in.readLine() );
        
        for(long i=0;i<testCases;i++){
            
            n=Long.parseLong( in.readLine() );
            
            solve(n);
            
        }
        
    }
    
}