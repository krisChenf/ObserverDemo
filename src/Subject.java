import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2019/5/
 *
 * 被观察的主题 包含 状态更新接口
 */
public class Subject {
    private List<Observer> observers
            = new ArrayList<Observer>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            if (null == observer.subject){
                observer.update("自定义消息");
            } else {
                observer.update();
            }
        }
    }
}
