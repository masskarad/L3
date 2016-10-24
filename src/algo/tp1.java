package algo;

public class tp1 {
	public static void main(String [] Args){
		long n;
		System.out.println("f1");
		n=7000000000l;
		f1(n);
		System.out.println("fin f1 -- ralentissement à partir de n="+n);
		System.out.println("f3");
		n=1800l;
		f3(n);
		System.out.println("fin f3 -- ralentissement à partir de n="+n);
		System.out.println("g2");
		n=30l;
		g2(n);
		System.out.println("fin g2 -- gros ralentissement à partir de n="+n);
		System.out.println("g3");
		g3(20);
		System.out.println("fin g3 -- gros ralentissement à partir de n="+n);
		System.out.println("Différence f1 - f3");
		n=1800l;
		System.out.println("f3 seul");
		f3(n);
		System.out.println("f1 et f3");
		f3(n);
		f1(n);
		System.out.println("Fin différence f1 - f3 aucune différence");
		System.out.println("Différence f3 - g2");
		n=30l;
		System.out.println("g2 seul");
		g2(n);
		System.out.println("f3 et g2");
		g2(n);
		f3(n);
		System.out.println("Fin différence f3 - g2 aucune différence");
		System.out.println("Différence g2 - g3");
		n=20l;
		System.out.println("g3 seul");
		g2(n);
		System.out.println("g3 et g2");
		g3(n);
		g2(n);
		System.out.println("Fin différence g2 - g3 aucune différence");
	}
	
	public static void f1(long n){
		long a=0;
		for (long i = 0; i<n ; i++)
			a=n;
	}
	
	public static void f3(long n){
		long a=0;
		for (long i = 0; i<n ; i++)
			for (long j = 0; j<n ; j++)
				for (long k = 0; k<n ; k++)
					a=n;
	}
	
	public static long g2(long n){
		if(n==0)
			return 1;
		else
			return g2(n-1)+g2(n-1);
	}
	
	public static long g3(long n){
		if(n==0)
			return 1;
		else
			return g3(n-1)+g3(n-1)+g3(n-1);
	}
}
