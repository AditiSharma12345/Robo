import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the mode in which you want your robot to be in : \n Press 1 for Tank Mode\n Press 2 for Swerve Mode\n Press 3 for Arcade Mode");
        Scanner sc = new Scanner(System.in);
        int mode = sc.nextInt();

        if(mode==1)
        {
            System.out.println("Your robot is in Tank Mode.");
            TankMode tm = new TankMode();
            System.out.println("Enter moves. Valid Modes are: \n FF for Forward \n BB for Backward \n FB for Right Rotate 90 degree\n BF for Left Rotate 90 degree");
            while(sc.hasNext())
            {
                String str = sc.next();
                tm.TankMovement(str);
            }
        } else if(mode==2)
        {
            System.out.println("Your robot is in swerve Mode.");
            SwerveMode sm = new SwerveMode();
            System.out.println("Enter moves. Valid Modes are \n F for Forward \n B for Backward \n R for Right\n L for Left");
            while(sc.hasNext())
            {
                char ch = sc.next().charAt(0);
                sm.SwerveMovement(ch);
            }
        } else if (mode==3) {
            System.out.println("Your robot is in Arcade Mode.");
            ArcadeMode am = new ArcadeMode();
            System.out.println("Enter moves. Valid Modes are \n F for Forward \n B for Backward \n R for Right\n L for Left");
            while(sc.hasNext())
            {
                char ch = sc.next().charAt(0);
                am.ArcadeMovement(ch);
            }
        }

    }
}