import java.util.*; 
 
public class Gyakorlas {
 
    public static void main(String[] args) {
        System.out.println("BUÉK! :)"); 
        boolean nyert = false; 
        int szam = (int) (Math.random()*10)+1; 
        
        for (int i = 0; i < 2; i++) {
        	System.out.println("Találd ki azt a számot amire gondoltam!");
            int tippeles = new Scanner(System.in).nextInt();
  
           if (tippeles==szam) {
        	   nyert=true;
   				break;
        	   
           			}
			}
       
        	if(nyert==false) {
			System.out.println("Nem Nyertél");
			System.out.println("A kitalált szám: "+szam);
        	
        	}else {
				System.out.println("Nyertél");
			}
			
		}   
    
    
    }
