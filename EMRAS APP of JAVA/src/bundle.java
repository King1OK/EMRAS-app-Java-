import java.util.Scanner;
public class bundle {
    static void bundle(){
        int b;
        System.out.println("Enter the type you want acctive:");
        System.out.println("1 for voice");
        System.out.println("2 for SMS");
        System.out.println("3 for Data");
        Scanner h= new Scanner(System.in);
        b=h.nextInt();
        if (b>3){
            System.out.println("You entered wrong input!");
            bundle w = new bundle();
            w.bundle();
        }

        switch (b){
            case 1:
                int e;
                System.out.println("Enert your bundle type: ");
                System.out.println("1 monthly");
                System.out.println("2 Weekly");
                System.out.println("3 Daily");
                Scanner m = new Scanner(System.in);
                e=m.nextInt();
                switch (e){
                    case 1:
                        int aa;
                        System.out.println("1 400 min for 120 af");
                        System.out.println("2 1000 min for 220 af");
                        System.out.println("3 4000 min for 1200 af");
                        System.out.println("4 5000 min for 1400 af");
                        Scanner ab = new Scanner(System.in);
                        aa=ab.nextInt();
                        break;
                    case 2:
                        int bb;
                        System.out.println("1 300 min for 90 af");
                        System.out.println("2 250 min for 80 af");
                        System.out.println("3 200 min for 70 af");
                        System.out.println("4 150 min for 60 af");
                        Scanner ba = new Scanner(System.in);
                        bb=ba.nextInt();
                        break;
                    case 3:
                        int cc;
                        System.out.println("1 200 min for 60 af");
                        System.out.println("2 150 min for 50 af");
                        System.out.println("3 100 min for 40 af");
                        System.out.println("4 50 min for 30 af");
                        Scanner ac = new Scanner(System.in);
                        cc=ac.nextInt();
                        break;
                }
                break;
            case 2:
                int t;
                System.out.println("Enert your bundle type: ");
                System.out.println("1 monthly");
                System.out.println("2 Weekly");
                System.out.println("3 Daily");
                Scanner n = new Scanner(System.in);
                t=n.nextInt();
                switch (t){
                    case 1:
                        int dd;
                        System.out.println("1 5000 sms for 100 af");
                        System.out.println("2 10000 sms for 150 af");
                        System.out.println("3 50000 sms for 200 af");
                        Scanner ad = new Scanner(System.in);
                        dd=ad.nextInt();
                        break;
                    case 2:
                        int ee;
                        System.out.println("1 2500 sms for 70 af");
                        System.out.println("2 3500 sms for 80 af");
                        System.out.println("3 4500 sms for 90 af");
                        Scanner ae = new Scanner(System.in);
                        ee=ae.nextInt();
                        break;
                        case 3:
                            int ff;
                        System.out.println("1 1000 sms for 40 af");
                        System.out.println("2 1500 sms for 50 af");
                        System.out.println("3 2000 sms for 60 af");
                        Scanner af = new Scanner(System.in);
                        ff=af.nextInt();
                        break;
                }
                break;
            case 3:
                int y;
                System.out.println("Enert your bundle type: ");
                System.out.println("1 monthly");
                System.out.println("2 Weekly");
                System.out.println("3 Daily");
                Scanner l = new Scanner(System.in);
                y=l.nextInt();
                switch (y){
                    case 1:
                        int gg;
                        System.out.println("1 1.5GB for 250 af");
                        System.out.println("2 6GB for 400 af");
                        System.out.println("3 10GB for 600 af");
                        Scanner ag = new Scanner(System.in);
                        gg=ag.nextInt();
                        break;
                    case 2:
                        int hh;
                        System.out.println("1 500MB for 100 af");
                        System.out.println("2 750MB for 150 af");
                        System.out.println("3 1GB for 200 af");
                        Scanner ah = new Scanner(System.in);
                        hh=ah.nextInt();
                        break;
                    case 3:
                        int ii;
                        System.out.println("1 500MB for 100 af");
                        System.out.println("2 1GB for 200 af");
                        System.out.println("3 1.5GB for 250 af");
                        Scanner ai = new Scanner(System.in);
                        ii=ai.nextInt();
                        break;
                }
                break;
        }

    }
}
