public class Dog extends Animal{
    final int LIMIT_SWIM = 10;//����� ��������
    final int LIMIT_RUN = 500;// ����� ����

    public Dog(String name) {
        super(name);
        super.limitRun = this.LIMIT_RUN;
        super.limitSwim = this.LIMIT_SWIM;
    }
}
