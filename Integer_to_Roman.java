import java.util.Scanner;

public class Integer_to_Roman {
    
    public static String romanToInt(int num) 
    {
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romanLetters = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder roman = new StringBuilder();
        for(int i=0;i<values.length;i++)
        {
            while(num >= values[i])
            {
            num = num - values[i];
            roman.append(romanLetters[i]);
            }
        }
        return(roman.toString());
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        String s = romanToInt(n);
        System.out.println(s);
        sc.close();
    }
}