public abstract class Animal {
    public String name;
    public int distanceSwim = 0;//счетчик расстояния плавания
    public int distanceRun = 0;//счетчик расстояния бега
    public int limitSwim;//максимальное расстояние плавания
    public int limitRun;//максимальное расстояние бега

    public Animal(String name) {
        this.name = name;
    }

    public void swim(int nextStep) {
        int a = this.distanceSwim + nextStep;
        if (a > this.limitSwim) {
            System.out.println(this.name + " сказал: \"нет сил далеко плыть\"");
        } else {
            System.out.println(this.name + " проплыл ещё " + nextStep + " метров.");
            System.out.println(this.name + " проплыл итого " + a + " метров.");
            System.out.println(this.name + " может проплыть еще " + (this.limitSwim - a) + " метров.");
            this.distanceSwim = a;
        }
    }

    public void run(int nextStep) {
        int a = this.distanceRun + nextStep;
        if (a > this.limitRun) {
            System.out.println(this.name + " сказал: \"нет сил далеко бежать\"");
        } else {
            System.out.println(this.name + " пробежал ещё " + nextStep + " метров.");
            System.out.println(this.name + " пробежал итого " + a + " метров.");
            System.out.println(this.name + " может пробежать еще " + (this.limitRun - a) + " метров.");
            this.distanceRun = a;
        }
    }
}

