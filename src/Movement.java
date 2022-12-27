public class Movement {

    int x,y=0;
    String direction="E";

    public void Forward() {
        if (direction.equals("E")) {
            x++; //positive x
        } else if (direction.equals("W")) {
            x--; //negative x
        } else if (direction.equals("N")) {
            y++; //positive y
        } else if (direction.equals("S")) {
            y--; //negative y
        }
        checkBoundary();
    }
    public void Backward() {
        if(direction.equals("E"))
        {
            x--; //negative x
        }
        else if(direction.equals("W"))
        {
            x++; //positive x
        }
        if(direction.equals("N"))
        {
             y--; //negative y
        }
        if(direction.equals("S"))
        {
            y++; //positive y
        }
        checkBoundary();
    }

    public void Right() {
        if (direction.equals("E")) {
            y--; //positive x
        } else if (direction.equals("W")) {
            y++; //negative x
        } else if (direction.equals("N")) {
            x++; //positive y
        } else if (direction.equals("S")) {
            x--; //negative y
        }
        checkBoundary();
    }
    public void Left() {
        if (direction.equals("E")) {
            y++; //positive x
        } else if (direction.equals("W")) {
            y--; //negative x
        } else if (direction.equals("N")) {
            x--; //positive y
        } else if (direction.equals("S")) {
            x++; //negative y
        }
        checkBoundary();
    }

    public void RoLeft() {
        if(direction.equals("E"))
        {
            direction="N";
        }
        else if(direction.equals("W"))
        {
            direction="S";
        }
        else if(direction.equals("N"))
        {
            direction="W";
        }
        else if(direction.equals("S"))
        {
            direction="E";
        }
    }
    public void RoRight() {
        if(direction.equals("E"))
        {
            direction="S";
        }
        else if(direction.equals("W"))
        {
            direction="N";
        }
        else if(direction.equals("N"))
        {
            direction="E";
        }
        else if(direction.equals("S"))
        {
            direction="W";
        }
    }

    public void GetPosition()
    {
        System.out.println("(" + x + "," + y + ") " + direction );
    }
    private void checkBoundary() {
        if(x<0 ||y<0 || x>4 || y>4)
        {
            System.out.println("Robot is out of grid");
            System.exit(0);
        }
    }
}
