import java.util.Scanner;
public class GreengrocerBilling {
    public static void main (String[]args){
        Scanner scanner=new Scanner(System.in);
        double pricePear=2.14, priceApple=3.67,priceTomato=1.11,priceBanana=0.95,priceEggplant=5.00;
        double kgPear,kgApple,kgTomato,kgBanana,kgEggplant,totalPrice;

        System.out.print("How many kg of pear? : ");
        kgPear=scanner.nextDouble();

        System.out.print("How many kg of apple?: ");
        kgApple=scanner.nextDouble();

        System.out.print("How many kg of tomato?: ");
        kgTomato=scanner.nextDouble();

        System.out.print("How many kg of banana?: ");
        kgBanana=scanner.nextDouble();

        System.out.print("How many kg of eggplant?: ");
        kgEggplant=scanner.nextDouble();

        totalPrice=(kgPear*pricePear)+(kgApple*priceApple)+(kgTomato*priceTomato)+(kgBanana*priceBanana)+(kgEggplant*priceEggplant);
        System.out.print("Total price: "+totalPrice+"TL");
    }
}
