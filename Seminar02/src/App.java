import java.util.Scanner;

public class App {
    static Student[] centralizator = new Student[0];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
//        Nota nota = new Nota();
//        System.out.println(nota);
//        System.out.println(new Nota("Matematica", 10));

//        var ion = new Student(13, "Ion", 1001, 2);
//        System.out.println(ion);
//        ion.add(new Nota("PAW", 2));
//        ion.add(new Nota("SDD", 7));
//        ion.add(new Nota("PAW", 9));
//        System.out.println(ion);

        afisare("Initial");
        citireStudenti();
        afisare("Dupa citire");

    }

    static void afisare(String mesaj) {
        System.out.println(mesaj + ":");
        for (var student : centralizator) {
            System.out.println(student);
        }
        System.out.println("=====================================");

    }

    static void citireStudenti() {
        var n = Integer.parseInt(scanner.nextLine());
        centralizator = new Student[n];
        for (int i = 0; i < n; i++) {
            var dateStudent = scanner.nextLine().split(",");
            var dateNote = scanner.nextLine().split(",");

            var student = new Student(Integer.parseInt(dateStudent[0]), dateStudent[1],
                    Integer.parseInt(dateStudent[2]), Integer.parseInt(dateStudent[3]));
            centralizator[i] = student;

            //?????
            //PAW,10,POO,8,Probabilitati,7
            // ----1 -----2 ------------3

            for (var j = 0; j < dateNote.length / 2; j++)
                student.add(new Nota(dateNote[j * 2], Integer.parseInt(dateNote[j * 2 + 1])));
        }
        //?????
    }

    //citireCatalog()
    //afisareCatalog()
    //fara sortare
    //28.02

}
