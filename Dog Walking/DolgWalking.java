import java.util.Arrays; 
public class DolgWalking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int T = 4;//number of trainers
		
		//int[] dogs = {30,40,20,41,50}; //a series of dog example
		int[] dogs = {19 , 32 , 10, 5, 45};
		
		int[] diff = new int[dogs.length - 1];
		
		int[] indices = new int[dogs.length - 1];
		
		Arrays.sort(dogs);
		
		
		int i=0;
		
		while ( i < (dogs.length - 1) ) {
			diff[i] = dogs[i+1] - dogs[i];
			indices[i]=i;
			i++;
		}	
		
		for (int el:indices)
			System.out.print(el);
		System.out.print("\n");
		for (int el:diff)
			System.out.print(el);
		
		//Sort the array in ascending order using two for loops 
		int temp = 0;
		int temp1 = 0;
        for (int ci = 0; ci <diff.length; ci++) {     
          for (int cj = ci+1; cj <diff.length; cj++) {     
              if(diff[ci] < diff[cj]) {      //swap elements if not in order
                 temp = indices[ci];
                 
                 temp1 = diff[ci];
                 
                 diff[ci] = diff[cj];
                 
                 indices[ci] = indices[cj];
                 
                 diff[cj] = temp1;
                		 
                 indices[cj] = temp;    
               }     
            }     
        } 
        System.out.print("\n");
		for (int el:indices)
			System.out.print(el);
		System.out.print("\n");
		for (int el:diff)
			System.out.print(el);
        
		int j = 0;
		
		int sum = 0;
		
		int di = 0;
		
		sum = dogs[indices[0]] - dogs[0];
		System.out.println("\n"+dogs[indices[0]]+" - "+dogs[0]+"="+sum+"\n");
		
		T = T - 1;
		
		for (i=1; i < (dogs.length); i++) {
			if (T == 1) {
				j = i - 1; 
				break;
			}
			else {
				di = dogs[indices[i]] - dogs[indices[i-1]+1];
				System.out.println("\n"+dogs[indices[i]]+" - "+dogs[indices[i-1]+1]+"="+"\n");
				sum = sum + di;
				
			}
			T = T - 1;
		}
		System.out.println(sum);
		sum = sum + (dogs[dogs.length-1] - dogs[indices[j]+1]);
		System.out.println("\n"+dogs[dogs.length-1]+" - "+dogs[indices[j]+1]+"="+sum+"\n");
		System.out.print("\n"+sum);
		
	
	}

}
