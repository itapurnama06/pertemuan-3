/**
 *
 * @author LAB F
 * tgl: 2024-04-01
 */
public class switchcase {
    
    public static void main(String[] args){
        String nVal = "A";
        
        switch (nVal) {
            case "A":
                System.out.println("Nilai nVar adalah A");
                break;
            case "a":
                System.out.println("Nilai nVar adalah a");
                break;
            case "B":
                  System.out.println("Nilai nVar adalah B");
                break;
            case "C":
                System.out.println("Nilai nVar adalah C");
                 break;
            default:
                System.out.println("Nilai nVar tidak ada dalam definisi");
        }
    }
}
