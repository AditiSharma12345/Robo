public class TankMode extends Movement{
    public void TankMovement(String str) {
        if(str.equals("FF"))
        {
            Forward();
        }
        else if(str.equals("BB"))
        {
            Backward();
        }
        else if(str.equals("FB"))
        {
            RoRight();
        }
        else if(str.equals("BF"))
        {
            RoLeft();
        }
        else {
            System.out.println("Invalid move");
        }
        GetPosition();
    }
}
