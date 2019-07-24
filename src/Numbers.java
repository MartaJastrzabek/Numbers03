import java.util.Locale;

public class Numbers {


    public void numbersWhile()
    {
        double number = 0;


        while (number <= 3.1)
        {
            System.out.printf(Locale.US, "%.1f", number);
            if(number < 3){
                System.out.print(", ");
            }
            number += 0.1;

        }
        System.out.println();

    }

    public void numbersDoWhile() {
        double number = 0;

        do {
            System.out.printf(Locale.US, "%.1f", number);
            if(number < 3){
                System.out.print(", ");
            }
            number += 0.1;

        } while (number<=3.1);
        System.out.println();
    }

}
