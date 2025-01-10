package lab;

public class Vector3D {
    Double x;
    Double y;
    Double z;

    public Vector3D(Double x, Double y, Double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Double getX() {
        return this.x;
    }

    public Double getY() {
        return this.y;
    }

    public Double getZ() {
        return this.z;
    }

    public String toString() {
        String formattedX = String.format("%.2f", this.x);
        String formattedY = String.format("%.2f", this.y);
        String formattedZ = String.format("%.2f", this.z);

        return "(" + formattedX + ", " + formattedY + ", " + formattedZ + ")";
    }
}
