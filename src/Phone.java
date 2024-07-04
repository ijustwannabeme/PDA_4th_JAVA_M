abstract class Phone {
    String brand;
    String powerLogo;
    String owner;

    public Phone(String owner, String powerLogo, String brand) {
        this.owner = owner;
        this.powerLogo = powerLogo;
        this.brand = brand;
    }

    public void buyPhone() {
        System.out.println(this.owner + "님이 " + this.brand + "폰을 구매했습니다.");
    }

    public void turnOn() {
        System.out.println(this.owner + "님이 " + this.brand + "폰을 켰습니다.");
        System.out.println(this.powerLogo + " 폰 켜지는 중 " + this.powerLogo);
    }
}

class iPhone extends Phone {

    public iPhone(String owner) {
        super(owner, "@@@", "애플");
    }

    @Override
    public void turnOn() {
        super.turnOn();
        // iPhone specific behavior could be added here
    }
}

class Samsung extends Phone {

    public Samsung(String owner) {
        super(owner, "***", "삼송");
    }

    @Override
    public void turnOn() {
        super.turnOn();
        // Samsung specific behavior could be added here
    }
}