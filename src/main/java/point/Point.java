package point;

import javax.sql.rowset.spi.TransactionalWriter;

import static nums.AllNums.THREE;
import static nums.AllNums.TWO;

public class Point {

    private int x;
    private int y;
    private int z;
    private int len;

    public Point(String pointCoords) {
        String[] splittedCoords = pointCoords.split(" ");
        len = splittedCoords.length;
        x = Integer.parseInt(splittedCoords[0]);
        y = Integer.parseInt(splittedCoords[1]);
        z = len == THREE ? Integer.parseInt(splittedCoords[TWO]) : 0;
    }

    public double x() {
        return x;
    }

    public double y() {
        return y;
    }

    public double z() {
        return z;
    }
}
