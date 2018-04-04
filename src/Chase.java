
public class Chase {

	public static void main(String[] args) {

		int []  pop = {18,21,2,12,70,60,};

		int smallest = pop[0];
		int secondsmallest = pop[1];

		for(int i = 0; i < 5; i++){
			if(pop[i]< smallest){
				smallest = pop[i];
		for(i = 0; i<5; i++){
			if(pop[i]<secondsmallest && pop[i] >smallest){
				secondsmallest = pop[i];
			}
		}System.out.println(smallest);
			System.out.println(secondsmallest);
	}
}
	}

	}
	