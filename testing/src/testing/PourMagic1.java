
package testing;
import java.util.*;

public class PourMagic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisir valeur de x: \n");
		int x = sc.nextInt();
		sc.hasNextLine();
		int S=0;
		int r;
		int q;
		q=x/10;
		for(;q!=0;)
		{
			r=x%10;
			S=S+r;
			x=q;
			q=x/10;
		}
		r=x%10;
		S=S+r;
		System.out.println("La somme est " +S);
		

	}

}
