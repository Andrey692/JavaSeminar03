package HW;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Stream stream1 = new Stream("поток 2001");
        Stream stream2 = new Stream("поток 2002");
        Stream stream3 = new Stream("поток 2003");

        stream1.addStudentGroup(new StudentGroup("G545"));
        stream1.addStudentGroup(new StudentGroup("G546"));
        stream1.addStudentGroup(new StudentGroup("G547"));
        stream1.addStudentGroup(new StudentGroup("G548"));
        stream1.addStudentGroup(new StudentGroup("G549"));

        stream2.addStudentGroup(new StudentGroup("W545"));
        stream2.addStudentGroup(new StudentGroup("W546"));
        stream2.addStudentGroup(new StudentGroup("W547"));

        stream3.addStudentGroup(new StudentGroup("F545"));
        stream3.addStudentGroup(new StudentGroup("F546"));
        stream3.addStudentGroup(new StudentGroup("F547"));
        stream3.addStudentGroup(new StudentGroup("F548"));
        stream3.addStudentGroup(new StudentGroup("F549"));
        stream3.addStudentGroup(new StudentGroup("F541"));

        // System.out.println();
        // for (StudentGroup group : stream1) {
        // System.out.println(group);
        // }
        // System.out.println();

        // System.out.println("поток N2");
        // for (StudentGroup group : stream2) {
        // System.out.println(group);
        // }
        // System.out.println();

        // System.out.println("поток N3");
        // for (StudentGroup group : stream3) {
        // System.out.println(group);
        // }
        // System.out.println();

        // StreamIterator iterator = new StreamIterator(stream1);
        // while (iterator.hasNext()) {
        // System.out.println(iterator.next());
        // }

        // Создаем список потоков
        List<Stream> streams = new ArrayList<>();
        streams.add(stream1);
        streams.add(stream2);
        streams.add(stream3);

        // список потоков до сортировки
        for (Stream stream : streams) {
            System.out.print(stream.getName());
            for (StudentGroup group : stream) {
                System.out.print(" " + group.getName());
            }
            System.out.println();
        }
        System.out.println();

        // Создаем объект StreamComparator
        StreamComparator comparator = new StreamComparator();

        // Сортируем список потоков с использованием компаратора
        Collections.sort(streams, comparator);

        // список потоков после сортировки
        for (Stream stream : streams) {
            System.out.print(stream.getName());
            for (StudentGroup group : stream) {
                System.out.print(" " + group.getName());
            }
            System.out.println();
        }
        System.out.println();

        // Выводим отсортированные потоки с названием и количеством групп
        for (Stream stream : streams) {
            System.out.println(stream.getName() + " - количество групп: " + stream.size());
        }
    }

}
