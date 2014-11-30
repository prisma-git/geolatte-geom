package org.geolatte.geom;

/**
 * A projected {@code Position} having an altitude.
 *
 * @author Karel Maesen, Geovise BVBA
 *         creation-date: 2/19/14
 */
public class P3D extends P2D {

    public P3D() {
        super();
    }

    public P3D(double x, double y, double z) {
        super(x, y, z);
    }

    protected P3D(double... coords) {
        super(coords);
    }

    public double getZ() {
        return getCoordinate(2);
    }

    @Override
    public int getCoordinateDimension() {
        return 3;
    }
}
