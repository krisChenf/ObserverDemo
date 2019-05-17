/**
 * Created by Administrator on 2019/5/17.
 */
public class HexaObserver extends Observer {

    public HexaObserver(){
    }
    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Hex String: "
                + Integer.toHexString( subject.getState() ).toUpperCase() );
    }
    public void update(String msg) {
        System.out.println( "Hex String: "
                + msg );
    }
}
