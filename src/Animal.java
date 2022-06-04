public abstract class Animal {
    public String name;
    public int distanceSwim = 0;//������� ���������� ��������
    public int distanceRun = 0;//������� ���������� ����
    public int limitSwim;//������������ ���������� ��������
    public int limitRun;//������������ ���������� ����

    public Animal(String name) {
        this.name = name;
    }

    public void swim(int nextStep) {
        int a = this.distanceSwim + nextStep;
        if (a > this.limitSwim) {
            System.out.println(this.name + " ������: \"��� ��� ������ �����\"");
        } else {
            System.out.println(this.name + " ������� ��� " + nextStep + " ������.");
            System.out.println(this.name + " ������� ����� " + a + " ������.");
            System.out.println(this.name + " ����� �������� ��� " + (this.limitSwim - a) + " ������.");
            this.distanceSwim = a;
        }
    }

    public void run(int nextStep) {
        int a = this.distanceRun + nextStep;
        if (a > this.limitRun) {
            System.out.println(this.name + " ������: \"��� ��� ������ ������\"");
        } else {
            System.out.println(this.name + " �������� ��� " + nextStep + " ������.");
            System.out.println(this.name + " �������� ����� " + a + " ������.");
            System.out.println(this.name + " ����� ��������� ��� " + (this.limitRun - a) + " ������.");
            this.distanceRun = a;
        }
    }
}

