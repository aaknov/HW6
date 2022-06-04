public class Dog extends Animal{
    final int LIMIT_SWIM = 10;//лимит плавания
    final int LIMIT_RUN = 500;// лимит бега

    public Dog(String name) {
        super(name);
        super.limitRun = this.LIMIT_RUN;
        super.limitSwim = this.LIMIT_SWIM;
    }
}
