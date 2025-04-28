import java.util.Random;
public class TestHashTable {
    public static void main(String[] args) {
        MyHashTable<MyTestingClass, Student> table = new MyHashTable<>();

        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
            int id = random.nextInt(100000);
            String name = "Name" + random.nextInt(10000);
            MyTestingClass key = new MyTestingClass(id, name);

            String studentName = "Student" + random.nextInt(10000);
            int age = random.nextInt(18, 30);
            Student student = new Student(studentName, age);

            table.put(key, student);
        }

        // Вывод количества элементов в каждой корзине
        for (int i = 0; i < 11; i++) {
            System.out.println("Bucket " + i + " has " + table.getBucketSize(i) + " elements.");
        }
    }
}
