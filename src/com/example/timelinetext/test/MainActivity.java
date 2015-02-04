
package com.example.timelinetext.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends Activity {

    private ListView listView;
    List<String> data;
    private TimelineAdapter timelineAdapter;
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        listView = (ListView) this.findViewById(R.id.listview);
        listView.setDividerHeight(0);
        timelineAdapter = new TimelineAdapter(this, getData());
        listView.setAdapter(timelineAdapter);
        mButton = (Button) findViewById(R.id.button);
        mButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				timelineAdapter.notifyDataSetChanged();
				System.out.println("Exe");
			}
		});

    }

    private List<Map<String, Object>> getData() {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("title", "yiyiyiyii");
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("title", "erererererer");
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("title", "sansanansnsan");
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("title", "isisisisi");
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("title", "erererererer");
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("title", "sansanansnsan");
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("title", "isisisisi");
        list.add(map);
        map = new HashMap<String, Object>();
        map.put("title", "erererererer");
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("title", "sansanansnsan");
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("title", "isisisisi");
        list.add(map);
        map = new HashMap<String, Object>();
        map.put("title", "erererererer");
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("title", "sansanansnsan");
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("title", "isisisisi");
        list.add(map);
        return list;
    }

}
