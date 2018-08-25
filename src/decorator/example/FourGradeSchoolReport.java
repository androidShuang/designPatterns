package decorator.example;

public class FourGradeSchoolReport extends SchoolReport{
    @Override
    void report() {
        System.out.println("尊敬的XXX您好");
        System.out.println("xxxxxxx");
        System.out.println("语文 100");
    }

    @Override
    void sign() {
        System.out.println("签名");
    }
}
