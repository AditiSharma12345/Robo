public class ArcadeMode extends Movement{
    public void ArcadeMovement(char str) {
        if (str == 'F') {
            Forward();
        } else if (str == 'B') {
            Backward();
        } else if (str == 'R') {
            Right();
            Forward();
            RoRight();
        } else if (str == 'L') {
            Left();
            Forward();
            RoLeft();
        } else {
            System.out.println("Invalid move");
        }
        GetPosition();
    }
}
