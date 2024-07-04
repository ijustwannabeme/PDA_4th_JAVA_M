public class Main {
    public static void main(String[] args) {
        Person jobs = new Person("잡스");
        Person jaedragon = new Person("재용");

        iPhone myiPhone = new iPhone(jobs.name);
        Samsung mySamsung = new Samsung(jaedragon.name);

        myiPhone.buyPhone();
        myiPhone.turnOn();

        mySamsung.buyPhone();
        mySamsung.turnOn();
    }
}