package com.ceyentra.tattle;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.ceyentra.tattle.adaptor.NewsFeedRecyclerAdaptor;
import com.ceyentra.tattle.model.NewsFeed;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Context context;
    private RecyclerView recyclerView;
    private NewsFeedRecyclerAdaptor recyclerAdaptor;
    private RecyclerView.LayoutManager newsFeedLayout;


    private ArrayList<NewsFeed> newsFeedList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.context= this;

        setSampleNews();
        configureRecyclerView();
    }

    private void configureRecyclerView(){

        recyclerView = findViewById(R.id.postRecyclerview);
        newsFeedLayout = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, true);
        recyclerView.setLayoutManager(newsFeedLayout);
        recyclerAdaptor = new NewsFeedRecyclerAdaptor(newsFeedList,context);
        recyclerView.setAdapter(recyclerAdaptor);
        recyclerView.scrollToPosition(newsFeedList.size()-1);

    }

    private void setSampleNews(){
        NewsFeed newsFeed = new NewsFeed();
        newsFeed.setProfileName("Binura Salindra");
        newsFeed.setNoOfLikes(100);
        newsFeed.setPostLacation("Matara,SriLanka");
        newsFeed.setNoOfShares(7);
        newsFeed.setPostTime("2 hrs ago");
        newsFeed.setPostDescription("Random Click by phone");

        NewsFeed newsFeed1 = new NewsFeed();
        newsFeed1.setProfileName("Sandun Dilhan");
        newsFeed1.setNoOfLikes(1);
        newsFeed1.setPostLacation("Aluthganma,SriLanka");
        newsFeed1.setNoOfShares(2);
        newsFeed1.setPostTime("8 hrs ago");
        newsFeed1.setPostDescription("Home");

        NewsFeed newsFeed2 = new NewsFeed();
        newsFeed2.setProfileName("Tharindu Dana");
        newsFeed2.setNoOfLikes(10);
        newsFeed2.setPostLacation("Kaluthara,SriLanka");
        newsFeed2.setNoOfShares(1);
        newsFeed2.setPostTime("4 hrs ago");
        newsFeed2.setPostDescription("Working");

        NewsFeed newsFeed3 = new NewsFeed();
        newsFeed3.setProfileName("Sameera Chathurange");
        newsFeed3.setNoOfLikes(200);
        newsFeed3.setPostLacation("Galle,SriLanka");
        newsFeed3.setNoOfShares(9);
        newsFeed3.setPostTime("5 hrs ago");
        newsFeed3.setPostDescription("Awesome Time");

        NewsFeed newsFeed4 = new NewsFeed();
        newsFeed4.setProfileName("Janitha Danajaya");
        newsFeed4.setNoOfLikes(100);
        newsFeed4.setPostLacation("Horana,SriLanka");
        newsFeed4.setNoOfShares(7);
        newsFeed4.setPostTime("9 hrs ago");
        newsFeed4.setPostDescription("Fun Time");

        newsFeedList = new ArrayList<>();
        newsFeedList.add(newsFeed);
        newsFeedList.add(newsFeed1);
        newsFeedList.add(newsFeed2);
        newsFeedList.add(newsFeed3);
        newsFeedList.add(newsFeed4);
    }


}
