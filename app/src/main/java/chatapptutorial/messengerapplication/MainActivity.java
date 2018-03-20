package chatapptutorial.messengerapplication;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    List<CustomList> msgList = new ArrayList<>();
    Activity _activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.myList);

        CustomList firstMsg = new CustomList(R.drawable.man,"Ali Noon","Give me a call me back!",R.drawable.greenseen,"11:45 pm");
        msgList.add(firstMsg);

        CustomList secondMsg = new CustomList(R.drawable.profile,"Baqir Hassan","I'm interested in android Application development",R.drawable.greenseen,"02:45 pm");
        msgList.add(secondMsg);

        CustomList thirdMsg = new CustomList(R.drawable.clientt,"Amir Bilal","Hi, Where are you ?", R.drawable.ic_mic_black,"11:00 am");
        msgList.add(thirdMsg);

        /*CustomList fourthMsg = new CustomList
                (
                        R.drawable.profile,
                        "Moiz Arshad",
                        R.drawable.ic_mic_black,
                        "2:30pm"
                );
        msgList.add(fourthMsg); */

        CustomAdapter adapter = new CustomAdapter(MainActivity.this,msgList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
       // if(view == null) {
//            LayoutInflater inf = (LayoutInflater)_activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//            view = inf.inflate(R.layout.inbox,getParent(),false);
            setContentView(R.layout.inbox);
        //}
    }
}
