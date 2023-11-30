package point;

import javax.sql.rowset.spi.TransactionalWriter;

import static nums.AllNums.TWO;

public class Point {

    private int x;
    private int y;
    private int z;
    private int len;
    private String pointCoords;

    public Point(String pointCoords) {
        this.pointCoords = pointCoords;
        String[] splittedCoords = pointCoords.split(" ");
        len = splittedCoords.length;
        x = Integer.parseInt(splittedCoords[0]);
        y = Integer.parseInt(splittedCoords[1]);
        z = splittedCoords.length == 3 ? Integer.parseInt(splittedCoords[2]) : 0;
    }

    public double x() {
        return x;
    }

    public double y() {
        return y;
    }

    public double z() {
        return pointCoords.length() == TWO ? 0 : z;
    }
}
