package chatapptutorial.messengerapplication;

/**
 * Created by Ahsan on 19/03/2018.
 */

public class CustomList {

    private int id,strokeId,mic;
    private int greenTick;
    private String userName, msgTime, msgBody;

    public int getId() {
        return id;
    }

    public int getGreenTick() {
        return greenTick;
    }
    public int getMic(){
        return mic;
    }

    public String getUserName() {
        return userName;
    }

    public String getMsgBody() {
        return msgBody;
    }

    public String getMsgTime(){
        return msgTime;
    }

    CustomList(int id, String userName, String msgBody, int greenTick, String msgTime){
        this.id = id;
        this.userName = userName;
        this.msgBody = msgBody;
        this.greenTick = greenTick;
        this.msgTime = msgTime;
    }


//    CustomList(int id, String userName, int mic,String msgTime){
//        this.id = id;
//        this.userName = userName;
//        this.mic = mic;
//        this.msgTime = msgTime;
//    }
}
