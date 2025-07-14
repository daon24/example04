//class Ex0304{
//    public static void main(String args[]) {
//        Student s = new Student();
//        s.name = "홍길동";
//        s.ban = 1;
//        s.no = 1;
//        s.kor = 100;
//        s.eng = 60;
//        s.math = 76;
//        System.out.println("이름 :"+s.name);
//        System.out.println("총점 :"+s.getTotal());
//        System.out.println("평균 :"+s.getAverage());
//    }
//}
class Ex0304 { //5번
    public static void main(String args[]) {
        Student s = new Student("홍길동",1,1,100,60,76);
        System.out.println(s.info());
    }
}
class Student {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    int getTotal() {
        return kor + eng + math;

    }

    float getAverage() {
        float avg = (kor + eng + math) / 3.0f;
        return Math.round(avg * 100) / 100.0f;
    }

    Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;

    }

    String info() {
        int total = getTotal();
        float avg = getAverage();
        avg = Math.round(avg * 100) / 100.0f;
        return name +","+ ban +","+ no +","+ kor +","+ eng +","+ math +","+ total +","+ avg;
    }
}
//class Student { //4번
//    String name;
//    int ban;
//    int no;
//    int kor;
//    int eng;
//    int math;
//
//    int getTotal(){
//        return kor + eng + math;
//
//    }
//
//    float getAverage() {
//        float avg = (kor + eng + math) / 3.0f;
//        return Math.round(avg*100)/100.0f;
//    }
//
//}