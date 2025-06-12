package l5;

class Point {
    int x, y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Point() {
        // x = -1; y = -1;
        this(-1,-1);
    }
    double distance(int х, int у) {
        int dx = this.x - х;
        int dy = this.y - у;
        return Math.sqrt(dx * dx + dy * dy);
    }
    double distance(Point p) {
        return distance(p.x, p.y);
    }
}
