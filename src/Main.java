import UserService.UserService;

public class Main {
    public static void main(String[] args) {
//        Person jobs = new Person("잡스");
//        Person jaedragon = new Person("재용");
//
//        iPhone myiPhone = new iPhone(jobs.name);
//        Samsung mySamsung = new Samsung(jaedragon.name);
//
//        myiPhone.buyPhone();
//        myiPhone.turnOn();
//
//        mySamsung.buyPhone();
//        mySamsung.turnOn();
//         Map<String, String> map = new HashMap<>();
// map.put("key1", "value1");
//        System.out.println(map.get("key1"));

        UserService userService = new UserService();
        User mo = new User("모", 1);
        User chan = new User("찬", 2);
        userService.join(mo);
        userService.join(chan);

    }
}