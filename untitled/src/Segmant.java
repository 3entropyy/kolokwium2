public class Segmant {
    private Point p1, p2;
    public Point getP1() {
        return p1;
    }
    public Point getP2() {
        return p2;
    }
    public Segment(Point p1, Point p2){
        this.p2 = p2;
        this.p1 = p1;
    }
    public double Dlugosc(){
        return Math.sqrt(Math.hypot(p2.x - p1.x, p2.y - p1.y));
    }
}
