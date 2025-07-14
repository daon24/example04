//class Ex0506 {
//    static double getDistance(int x, int y, int x1, int y1) {
//        return Math.sqrt(((x1 - x) * (x1 - x)) + ((y1 - y) * (y1 - y)));
//    }
//
//    public static void main(String args[]) {
//        System.out.println(getDistance(1, 1, 2, 2));
//    }
//}
class Exercise6_7 {
    public static void main(String args[]) {
        MyPoint p = new MyPoint(1,1);

        System.out.println(p.getDistance(2,2));
    }
}

class MyPoint {
    int x;
    int y;
    MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    double getDistance(int a, int b) {
       return Math.sqrt((a-x)*(a-x)+(b-y)*(b-y));
    }
}