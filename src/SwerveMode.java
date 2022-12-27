public class SwerveMode extends Movement{
    public void SwerveMovement(char str) {
        if (str == 'F') {
            Forward();
        } else if (str == 'B') {
            Backward();
        } else if (str == 'R') {
            Right();
        } else if (str == 'L') {
            Left();
        } else {
            System.out.println("Invalid move");
        }
        GetPosition();
    }
}
