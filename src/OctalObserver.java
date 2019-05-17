/**
 * Created by Administrator on 2019/5/17.
 */
public class OctalObserver  extends Observer{
    public OctalObserver(){
    }
    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Octal String: "
                + Integer.toOctalString( subject.getState() ) );
    }
    public void update(String msg) {
        System.out.println( "Octal String: "
                + msg);
    }
}
