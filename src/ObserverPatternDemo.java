/**
 * Created by Administrator on 2019/5/17.
 */
public class ObserverPatternDemo {

    public static void main(String[] args) {
        Subject subject = new Subject();
        // 方式一   持有整个主题对象
//        new HexaObserver(subject);
//        new OctalObserver(subject);

        // 方式二  不持有主题对象

        Observer ob = new HexaObserver();
        Observer ob2 = new OctalObserver();
        subject.attach(ob);
        subject.attach(ob2);



        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
