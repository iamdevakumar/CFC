package com.app.chendhurfinecorpclient.Activity;

import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.app.chendhurfinecorpclient.Adapter.RecyclerviewAdapter;
import com.app.chendhurfinecorpclient.Others.CenterZoomLayoutManager;
import com.app.chendhurfinecorpclient.Others.EndlessRecyclerOnScrollListener;
import com.app.chendhurfinecorpclient.Others.Model_Class;
import com.app.chendhurfinecorpclient.R;

import java.util.ArrayList;
import java.util.List;


public class Home extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerviewAdapter adapter;
    public static TextView menu_tit;
    Model_Class mClass;
    private int mLoadedItems = 0;
    List<Model_Class> iconlist;
    CenterZoomLayoutManager centerZoomLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        recyclerView = findViewById(R.id.menu);
        iconlist = new ArrayList<>();
        adapter = new RecyclerviewAdapter(this, iconlist);
        menu_tit = findViewById(R.id.menu_title);
        recyclerView.setHasFixedSize(true);
        centerZoomLayoutManager=new CenterZoomLayoutManager(Home.this, CenterZoomLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(centerZoomLayoutManager);
        recyclerView.setAdapter(adapter);
        recyclerView.addOnScrollListener(new EndlessRecyclerOnScrollListener() {
            @Override
            public void onLoadMore() {
                addDataToList();
            }
        });
        seticons();

    }

    void seticons() {
        int[] icons = {R.drawable.inverstment, R.drawable.todays_revenue, R.drawable.total_credits};
        mClass = new Model_Class("Investment", icons[0]);
        iconlist.add(mClass);
        mClass = new Model_Class("Today's Revenue", icons[1]);
        iconlist.add(mClass);
        mClass = new Model_Class("Total Credits", icons[2]);
        iconlist.add(mClass);
        adapter.notifyDataSetChanged();

    }

    private void addDataToList() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 30; i++) {
                    seticons();
                    mLoadedItems++;
                }
                adapter.notifyDataSetChanged();
            }
        }, 1500);
    }
}
