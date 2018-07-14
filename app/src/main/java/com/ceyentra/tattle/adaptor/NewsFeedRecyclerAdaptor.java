package com.ceyentra.tattle.adaptor;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.ceyentra.tattle.R;
import com.ceyentra.tattle.model.NewsFeed;

import java.util.ArrayList;

public class NewsFeedRecyclerAdaptor extends RecyclerView.Adapter<NewsFeedRecyclerAdaptor.NewsViewHolder> implements View.OnClickListener {

    private ArrayList<NewsFeed> newsFeedList = null;
    private Context context;

    public NewsFeedRecyclerAdaptor(ArrayList<NewsFeed> newsFeedList, Context context) {
        this.newsFeedList = newsFeedList;
        this.context = context;
    }

    @Override
    public NewsFeedRecyclerAdaptor.NewsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.feed_item_row_layout, parent, false);
        NewsViewHolder recyclerViewHolder = new NewsViewHolder(view, context, newsFeedList);
        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(NewsFeedRecyclerAdaptor.NewsViewHolder holder, int position) {
        NewsFeed newsFeed = newsFeedList.get(position);

        holder.txtProfileName.setText(newsFeed.getProfileName());
        holder.txtNoOfLikes.setText(newsFeed.getNoOfLikes()+"");
        holder.txtLocation.setText("at "+newsFeed.getPostLacation());
        holder.txtTime.setText(newsFeed.getPostTime());
        holder.txtNoOfShares.setText(newsFeed.getNoOfShares()+"");
        holder.txtDescription.setText(newsFeed.getPostDescription());

    }

    @Override
    public int getItemCount() {
        return newsFeedList.size();
    }

    @Override
    public void onClick(View view) {

    }

    public class NewsViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView txtProfileName;
        TextView txtLocation;
        TextView txtNoOfLikes;
        TextView txtNoOfShares;
        TextView txtTime;
        TextView txtDescription;
        ImageView imgViewProfilePicture;
        ImageView imgViewFeedImage;
        ImageView btnLike;
        ImageView btnShare;
        ArrayList<NewsFeed> newsFeedList = null;
        Context context;

        public NewsViewHolder(View view, Context context, ArrayList<NewsFeed> newsFeedList) {
            super(view);
            this.context = context;
            this.newsFeedList = newsFeedList;
            txtProfileName = view.findViewById(R.id.text_profile_name);
            txtLocation = view.findViewById(R.id.text_location);
            txtNoOfLikes = view.findViewById(R.id.text_like_count);
            imgViewProfilePicture = view.findViewById(R.id.profile_icon);
            imgViewFeedImage = view.findViewById(R.id.feed_image);
            btnLike = view.findViewById(R.id.button_like);
            btnShare = view.findViewById(R.id.button_share);
            txtNoOfShares = view.findViewById(R.id.text_share_count);
            txtTime = view.findViewById(R.id.text_time);
            txtDescription = view.findViewById(R.id.text_description);

        }

        @Override
        public void onClick(View view) {

        }

    }
}
