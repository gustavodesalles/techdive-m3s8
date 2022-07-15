package patterns.creational.builder;

public class House {
    private final double floor;
    private final int walls;
    private final double roof;
    private final int windows;
    private final boolean door;

    public House(HouseBuilder builder) {
        this.floor = builder.floor;
        this.walls = builder.walls;
        this.roof = builder.roof;
        this.windows = builder.windows;
        this.door = builder.door;
    }

    public double getFloor() {
        return floor;
    }

    public int getWalls() {
        return walls;
    }

    public double getRoof() {
        return roof;
    }

    public int getWindows() {
        return windows;
    }

    public boolean isDoor() {
        return door;
    }

    public static class HouseBuilder {
        private double floor;
        private int walls;
        private double roof;
        private int windows;
        private boolean door;

        public HouseBuilder floor(double floor) {
            this.floor = floor;
            return this;
        }

        public HouseBuilder walls(int walls) {
            this.walls = walls;
            return this;
        }

        public HouseBuilder roof(double roof) {
            this.roof = roof;
            return this;
        }

        public HouseBuilder windows(int windows) {
            this.windows = windows;
            return this;
        }

        public HouseBuilder door(boolean door) {
            this.door = door;
            return this;
        }

        public House getResult() {
            return new House(this);
        }
    }
}
