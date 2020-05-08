package com.citygrid;

import java.util.Iterator;
import java.util.List;

import static java.lang.Math.abs;

public class BunnyPositioningSystem {

    //distance in grid blocks
    public static int distanceInBlocks(Position a, Position b) {
        return abs(a.getxCoordinate() - b.getxCoordinate()) + abs(a.getyCoordinate() - b.getyCoordinate());
    }

    public static Position walktoEnd(List<String> instructionList) {

        Position start = new Position(1);

        Position endPosition = new Position(start.getHeading());
        Iterator it = instructionList.iterator();

        while (it.hasNext()) {
            String move = (String) it.next();
            endPosition = walk(start, move);

            start = endPosition;

        }

        return endPosition;

    }

    public static int walkAllAndGetDistanceFromHQ(List<String> instructionList) {

        Position start = new Position(1);
        Position end = walktoEnd(instructionList);

        return distanceInBlocks(end, start);
    }


    public static Position walk(Position start, String move) {
        int newHeading = getNewHeading(start.getHeading(), move.charAt(0));

        Position endPosition = new Position(newHeading, start.getxCoordinate(), start.getyCoordinate());
        int blocks = Integer.parseInt(move.substring(1));

        switch (newHeading) {
            //east
            case 2:
                endPosition.setxCoordinate(start.getxCoordinate() + blocks);
                break;
            //south
            case 3:
                endPosition.setyCoordinate(start.getyCoordinate() - blocks);
                break;
            //west
            case 4:
                endPosition.setxCoordinate(start.getxCoordinate() - blocks);
                break;
            //north
            default:
                endPosition.setyCoordinate(start.getyCoordinate() + blocks);
                break;

        }

        return endPosition;
    }

    /*
          int heading
          1 = north
          2 = east
          3 = south
          4 = west
          turn right +1
          turn left -1
           */

    private static int getNewHeading(int heading, char turn) {
        int newHeading;

        if (turn == 'L') {

            newHeading = heading - 1 < 1 ? 4 : heading - 1;

        } else {
            newHeading = heading + 1 > 4 ? 1 : heading + 1;

        }

        return newHeading;

    }


}
