import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int t;
		t= in.nextInt();
		while(t-- > 0){
		    int x,y;
		    x=in.nextInt();
		    y=in.nextInt();
		    String ans= ((x*3) <= y)? "YES" : "NO";
		    System.out.println(ans);
		}
	}
}
