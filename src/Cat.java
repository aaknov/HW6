public class Cat extends Animal {
    //private final int limitSwim = 0;//����� �������� ����
    final int LIMIT_RUN = 200;// ����� ���� ����


    public Cat(String name) {
        super(name);
        super.limitRun = this.LIMIT_RUN;
        //super.limitSwim = this.limitSwim;
    }

    @Override
    public void swim(int nextStep) {
            System.out.println("�� ���� ������� \"�����\", ��� ������� :\"���� �� �������\"");
    }
}
