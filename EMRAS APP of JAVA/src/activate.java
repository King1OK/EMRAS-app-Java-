import java.util.Scanner;

public class activate extends act {
    void activates(){
        int o;
        System.out.println("1 Activate ");
        System.out.println("2 Deactivate");
        Scanner p = new Scanner(System.in);
        o=p.nextInt();
        if (o==1){
            System.out.println("Your process activated successfully");
        }else if (o==2){
            System.out.println("Your process deactivated successfully");
        }else {
            System.out.println("You Entered wrong input!");
            activate z = new activate();
            z.activates();
        }
    }
}
