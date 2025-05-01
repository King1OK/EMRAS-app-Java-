import java.util.Scanner;
interface choices {
    void choice();
}
interface selected extends choices{
    void select();
}
class use implements selected{
    @Override
    public void choice() {
        System.out.println("Enter your sim type :");
    }

    @Override
    public void select() {
        int a;

        System.out.println("1 Etisalat");
        System.out.println("2 MTN");
        System.out.println("3 Roshan");
        System.out.println("4 AWCC");
        System.out.println("5 Salaam");
        Scanner b = new Scanner(System.in);
        a=b.nextInt();
        if(a>5){
            System.out.println("You Entered wrong input!");
            use d = new use();
            d.select();
        }
    }
}