package decorator.example;

public class HighSchoolDecorator extends Decorator{

    public HighSchoolDecorator(SchoolReport report) {
        super(report);
    }

    public void reportHeigh(){
        System.out.println("先报告高分");
    }

    @Override
    void report() {
        this.reportHeigh();
        super.report();
    }
}
