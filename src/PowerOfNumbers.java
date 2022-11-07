import java.util.Scanner;

public class PowerOfNumbers {
    public static void main(String[] args){
        int n,k;
        Scanner input = new Scanner(System.in);

        System.out.println("Üssü alınacak sayı: ");
        n = input.nextInt();
        System.out.println("Üs olacak sayı: ");
        k = input.nextInt();
        int total = 1;

        for(int i =1; i <= k; i++){
            total *= n;
            if(i < k){
                continue;
            }else{
                System.out.println("Cevap : " + total);
            }
        }
        System.out.println("Cevap: " + total);

    }
}
