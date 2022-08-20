package bg;

public class Static {
	    static int x;
	    int y;
	}
 class Myclass {
	    public static void main(String args[]) {
	     
	     Static o=new Static();
	     
	     
	     
	      o.x=10;
	     o.y=25;
	     System.out.println("Sum of x+y = " + o.x+o.y);
	     Static b=new  Static();
	     

	      System.out.println("Sum of x+y = " + b.x+b.y);
	    }
	}

