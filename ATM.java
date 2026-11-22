import java.util.Scanner;
class ATM{
    public static final String user  = "root";
    public static final int password = 1234;
    private static double Current_Balance = 100000;
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Welcome to the ATM");
        System.out.println("Enter the User and Password ");
        if(Aunthentication(sc)){
            System.out.println("Welcome to your account ");
            boolean exist = false;
            while(!exist){
                System.out.println("Enter the no what you want to choose");
                System.out.println("1 : CHeck the balance");
                System.out.println("2: WithDraw he money");
                System.out.println("3: Exist");
                
                int choice  = sc.nextInt();
                switch(choice){
                    case 1 :
                        CHeck_balance();
                        break;
                    case 2:
                        Withdrawl(sc);
                        break;
                    case 3:
                        exist = true;
                }

            }

        }else{
            System.out.println("too maany failed attempts");
            return;


        }
    }
    
    
    public static boolean Aunthentication(Scanner sc ){
        int attempt  =3;
        while(attempt>0){
            String us = sc.next();
            int pin = sc.nextInt();
            if(us.equals(user)&&password==pin){
                return true;
            }
            else{
            
                System.out.println("Lala theek daal de code nhi toh attept bache hai "+attempt);
            }
            attempt --;
        }
        return false;

    }
    public static void CHeck_balance(){
        System.out.println("Your balance is:"+Current_Balance);


    }
    public static void Withdrawl(Scanner sc){
        double Money  = sc.nextInt();
        if(Money>Current_Balance){
            System.out.println("Not enough Balance");
        }
        else{
            Current_Balance= Current_Balance-Money;
            System.out.println("Successfully withdrew: " + Money);
        System.out.println("Remaining Balance: " + Current_Balance);
        }
           
        
    }
    
}