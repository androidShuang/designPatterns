package decorator.example;

public class Decorator extends SchoolReport{

    private SchoolReport report;

    public Decorator(SchoolReport report) {
        this.report = report;
    }

    @Override
    void report() {
        report.report();
    }

    @Override
    void sign() {
        report.sign();
    }
}
