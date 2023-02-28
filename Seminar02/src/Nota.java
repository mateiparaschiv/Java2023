public class Nota {
    private String numeDisciplina;
    private int nota;

    public Nota() {
        this("-", 0);
    }

    public Nota(String numeDisciplina, int nota) {
        this.numeDisciplina = numeDisciplina;
        this.nota = nota;
    }

    public String getNumeDisciplina() {
        return numeDisciplina;
    }

    public void setNumeDisciplina(String numeDisciplina) {
        this.numeDisciplina = numeDisciplina;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return String.format("%-18s %2d", getNumeDisciplina(), getNota());
        //- aliniat la stanga
        //18 spatii fata de string
    }
}
