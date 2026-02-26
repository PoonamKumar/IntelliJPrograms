public class IfElseDemo {
    public static void main(String[] args) {
        int x=11;
        if (x==10)
        {
            System.out.println("X is 10");
        } else if (x>10)
        {
            System.out.println("X is greater");
        } else
        {
            System.out.println("X is lesser");
        }
        boolean cold=true;
        int time=1900;
        if (time<1200)
        {
            System.out.println("Good Morning");
        }else if(time>=1200 && time<1800)
        {
            System.out.println("Good Afternoon");
        }else
        {
            if(cold){
                System.out.println("Good Evening it's cold");
            }else {
                System.out.println("Good Evening it's warm");
            }
        }
    }
}
