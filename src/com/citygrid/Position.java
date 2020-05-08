package com.citygrid;

public class Position {

    private int xCoordinate;
    private int yCoordinate;


    /*
              int heading
              1 = north
              2 = east
              3 = south
              4 = west
              turn right +1
              turn left -1
               */
    private int heading;

    public Position(int heading) {
        this.heading = heading;
    }

    public Position(int heading, int x, int y) {
        this.heading = heading;
        this.xCoordinate = x;
        this.yCoordinate = y;

    }

    public int getHeading() {
        return heading;
    }

    public void setHeading(int heading) {
        this.heading = heading;
    }

    public int getxCoordinate() {
        return xCoordinate;
    }

    public void setxCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public int getyCoordinate() {
        return yCoordinate;
    }

    public void setyCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }


}
