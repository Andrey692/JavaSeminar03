package HW;

public class Main {
    public static void main(String[] args) {
        StudentGroup group1 = new StudentGroup("G545");
        StudentGroup group2 = new StudentGroup("G546");
        StudentGroup group3 = new StudentGroup("G547");
        StudentGroup group4 = new StudentGroup("G548");
        StudentGroup group5 = new StudentGroup("G549");

        StudentGroup group6 = new StudentGroup("W545");
        StudentGroup group7 = new StudentGroup("W546");
        StudentGroup group8 = new StudentGroup("W547");

        Stream stream1 = new Stream();
        Stream stream2 = new Stream();

        stream1.addStudentGroup(group1);
        stream1.addStudentGroup(group2);
        stream1.addStudentGroup(group3);
        stream1.addStudentGroup(group4);
        stream1.addStudentGroup(group5);

        stream2.addStudentGroup(group6);
        stream2.addStudentGroup(group7);
        stream2.addStudentGroup(group8);
        System.out.println("поток N1");
        for (StudentGroup group : stream1) {
            System.out.println(group);
        }
        System.out.println();

        System.out.println("поток N2");
        for (StudentGroup group : stream2) {
            System.out.println(group);
        }

        // StreamIterator iterator = new StreamIterator(stream1);
        // while (iterator.hasNext()) {
        // System.out.println(iterator.next());
        // }

        // Сравниваем количество групп в двух потоках
        int res = Service.comp(stream1, stream2);

        // Выводим результат сравнения
        if (res > 0) {
            System.out.println("В потоке 1 больше групп.");
        } else if (res < 0) {
            System.out.println("В потоке 2 больше групп.");
        } else {
            System.out.println("Количество групп в обоих потоках одинаково.");
        }

    }

}
