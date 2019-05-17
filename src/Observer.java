/**
 * Created by Administrator on 2019/5/17.
 *
 *
 *
 *
 * 观察者模式 1 在实例化观察对象的时候通过构造方法，制定了主题对象，把自己放入被观察的主题对象中。
 *      每个观察者  定义出初期 绑定 他要观察的主题，在实例化观察者时候
 *      把自己this当前实例自动注册到要观察的的主题对象里。
 *
 *      每个观察者自己去拿主题里的消息
 *
 * 观察者模式2
 *      另一种方式 先创建主题对象，和各个观察者，然后在逐个注册到主题对象中。
 *      把消息 传递给每个观察者，观察不包含具体的主题对象
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
    public abstract void update(String msg);
}
