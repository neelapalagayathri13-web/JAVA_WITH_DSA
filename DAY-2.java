import java.util.*;
public class day2 {
    public static void main(String[] args) {
      
        
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        


       /*  int b=sc.nextInt();
        boolean opp = ((a^b)<0);
        System.out.println(opp);  */

       /*  for(int i=0;i<=a;i++){
            System.out.print(i+" ");
        }
        */

       /*  for(int i=1;i<=a;i++){
            f=f*i;
        }
        System.out.println("Factorial is"+f);

            */



       // Spy Number: check if the sum of the digits equal to product of digits for a given number.print all spy number up to n
      /*   int sum=0;
        int product=1;
        while(a>0){
            int temp=a%10;
            sum=sum+temp;
            product=product*temp;
            a=a/10;
        }
        if(sum==product){
            System.out.println("Spy number");

        }
        else{
            System.out.println("Not Spy number");
        }
    */





        // MAGIC NUMBER : A NUMBER IS MAGIC IF RECURSIVELY SUMMING ITS DIGITS YIELDS 1.CHECK IF N IS A MAGIC NUMBER OR NOT

     /*    int sum;
        while(true){
            sum=0;
            while(a!=0){
            int r=a%10;
            sum=sum+r;
            a=a/10;
           }
            if(sum>0&&sum<=9){
                break;
            }
            else{
                a=sum;
            }
        }
        if(sum==1){
            System.out.println("Magic number");
        }
        else{
            System.out.println("Not magic number");
        }

        */



        // HAPPY NUMBER : IF SUM OF THE SQUARE DIGITS ARE CALCULATED TILL THE SINGLE DIGITS IS OBTAINED BY RECUSIVELY ADDING THESUM OF SQUARE DIGITS
        
      /*   int sum;
        while(true){
            sum=0;
            while(a!=0){
            int r=a%10;
            sum=sum+(r*r);
            a=a/10;
           }
            if(sum>0&&sum<=9){
                break;
            }
            else{
                a=sum;
            }
        }
        if(sum==1){
            System.out.println("Happy number");
        }
        else{
            System.out.println("Not happy number");
        }

    */



        // PERFECT NUMBER : A NUMBER IS EQUAL TO SUM OF ITS PROPER DIVISORS
        /*
        int sum=0;
        int temp=a;
        for(int i=1;i<a;i++){
            if((a%i)==0){
                sum=sum+i;
            }
        }
        if(sum==temp){
            System.out.println("perfect number");
        }
        else{
            System.out.println("Not perfect Number");
        }

        */



        // PERFECT SQUARE NUMBER

        //int sum=0;

        // PERFECT NUMBER WITHIN RANGE 

        int b=sc.nextInt();
         for(int i=a;i<=b;i++){
            int n=i;
            int sum=0,f=1;
            while(f<n){
                if((n%f)==0){
                    sum=sum+f;
                }
                f++;
            }
            if(sum==i)
            {
                System.out.println(i+" ");
            }
         }
        
        sc.close();


    }
}
