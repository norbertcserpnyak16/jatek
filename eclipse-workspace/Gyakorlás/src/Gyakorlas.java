import java.util.*; //Beimportálom a Java Util csomagot
 
public class Gyakorlas {
 
    public static void main(String[] args) {
       // System.out.println("BUÉK! :)"); //Kiiratom, hogy Buék
        boolean nyert = false; //boolean nyert változó false értéken van
        int szam = (int) (Math.random()*10)+1; //int szam változó tipuskényszerítéssel math.random függvény amihez szorzunk 10-el és hozzáadok 1-et
        
        for (int i = 0; i < 2; i++) { //for ciklus 2 tippelési lehetőséget ad.
        	System.out.println("Találd ki azt a számot amire gondoltam!"); //Kiiratás
            int tippeles = new Scanner(System.in).nextInt(); //Adat bekérés a System.in-ről
  
           if (tippeles==szam) { //Ha a tipelés egyenlő a számmal
        	   nyert=true; //nyert true értékre kapcsolása
   				break; //kilépés a programból
        	   
           			}
			}
       
        	if(nyert==false) { //Ha a nyert false 
			System.out.println("Nem Nyertél"); //Kiirja, hogy nem nyertél és a számot amit ki kellett volna találni
			System.out.println("A kitalált szám: "+szam);
        	
        	}else { //Különben, ha igaz a nyert változó
				System.out.println("Nyertél");//Irassa ki, hogy nyert.
			}
			
		}   
    
    
    }
