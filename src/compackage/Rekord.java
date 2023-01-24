package compackage;

import java.time.LocalDateTime;

public class Rekord {
    public Double salary;
    public LocalDateTime data;

    public Rekord(LocalDateTime data, Double salary) {
        this.data = data;
        this.salary= salary;
    }

    @Override
    public String toString() {
        return "Rekord{" +
                "salary=" + salary +
                ", data=" + data +
                '}';
    }
}
