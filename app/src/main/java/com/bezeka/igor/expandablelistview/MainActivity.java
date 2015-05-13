package com.bezeka.igor.expandablelistview;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class MainActivity extends ActionBarActivity {

    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<ListDataHeader> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        expListView = (ExpandableListView)findViewById(R.id.lvExp);

        prepareListData();

        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);

        expListView.setAdapter(listAdapter);
    }

    private void prepareListData(){

        listDataHeader = new ArrayList<ListDataHeader>();
        listDataChild = new HashMap<String, List<String>>();

        listDataHeader.add(new ListDataHeader("Leagues",R.drawable.league));
        listDataHeader.add(new ListDataHeader("Cups",R.drawable.cup));
        listDataHeader.add(new ListDataHeader("Articles",R.drawable.article));

        List<String> leagues = new ArrayList<String>();
        leagues.add("Ukraine");
        leagues.add("England");
        leagues.add("Germany");
        leagues.add("Spain");
        leagues.add("Portugal");
        leagues.add("Italy");

        List<String> cups = new ArrayList<String>();
        cups.add("League of Champions");
        cups.add("League of Europe");
        cups.add("Copa Lidertadores");
        cups.add("Euro 2016");
        cups.add("World cup 2018");

        List<String> articles = new ArrayList<String>();
        articles.add("4-4-2");
        articles.add("Scout");
        articles.add("Other world");
        articles.add("Some article...");

        listDataChild.put(listDataHeader.get(0).getTitle(), leagues);
        listDataChild.put(listDataHeader.get(1).getTitle(), cups);
        listDataChild.put(listDataHeader.get(2).getTitle(), articles);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
