package workshop05.school;

public class StudentTest {
    public static void main(String[] args) {
        Student[] studentArray = new Student[3];
        studentArray[0] = new Student("홍길동", 15, 171, 81);
        studentArray[1] = new Student("한사람", 13, 183, 72);
        studentArray[2] = new Student("임꺽정", 16, 175, 65);

        double sumAge = 0;
        double sumHeight = 0;
        double sumWeight = 0;
        for (Student student : studentArray) {
            System.out.println(student);
            sumAge+= student.getAge();
            sumHeight+= student.getHeight();
            sumWeight+= student.getWeight();
        }
        System.out.printf("나이의 평균 : %.2f",sumAge/3);
        System.out.println();
        System.out.printf("나이의 평균 : %.2f",sumHeight/3);
        System.out.println();
        System.out.printf("나이의 평균 : %.2f",sumWeight/3);


    }
}
