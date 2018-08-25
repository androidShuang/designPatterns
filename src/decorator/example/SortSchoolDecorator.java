package decorator.example;

public class SortSchoolDecorator extends Decorator{

    public SortSchoolDecorator(SchoolReport report) {
        super(report);
    }

    public void reportSort(){
        System.out.println("排序的");
    }

    @Override
    void report() {
        super.report();
        this.reportSort();
    }
}
