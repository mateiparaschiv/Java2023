import java.util.Arrays;

public class Student {
    private Nota[] note;
    private int idStudent;
    private String nume;
    private int grupa;
    private int anul;

    public Student() {
        this(0, "-", 0, 0);
    }

    public Student(int idStudent, String nume, int grupa, int anul) {
        this.idStudent = idStudent;
        this.nume = nume;
        this.grupa = grupa;
        this.anul = anul;
        this.note = new Nota[0];
        //Clase care contin colectii trebuie initializate
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getGrupa() {
        return grupa;
    }

    public void setGrupa(int grupa) {
        this.grupa = grupa;
    }

    public int getAnul() {
        return anul;
    }

    public void setAnul(int anul) {
        this.anul = anul;
    }

    public Nota[] getNote() {
        return note;
    }

    @Override
    public String toString() {
        var builder = new StringBuilder();
        builder.append(String.format("#%-2d %-19s gr %d, an %d\n", getIdStudent(), getNume(), getGrupa(), getAnul()));
        for (var nota : note) {
            builder.append("    " + nota + "\n");
        }
        return builder.toString();
    }

    void add(Nota nota) {
        //TODO
        for (var notaExistenta : note) {
            if (notaExistenta.getNumeDisciplina().equals(nota.getNumeDisciplina())) {
                notaExistenta.setNota(nota.getNota());
                return;
            }
        }
        note = Arrays.copyOf(note, note.length + 1);
        note[note.length - 1] = nota;
    }
}
