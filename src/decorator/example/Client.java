package decorator.example;

public class Client {
    public static void main(String[] args){
        SchoolReport sr = null;
        //这块要说明一下，这个sr是原始report
        sr = new FourGradeSchoolReport();
        //这里的逻辑就是，要HighSchoolDecorator装饰上一个sr，因为构造函数存了上一个要修饰的对象
        sr = new HighSchoolDecorator(sr);
        sr = new SortSchoolDecorator(sr);

        sr.report();

        sr.sign();

    }
}
