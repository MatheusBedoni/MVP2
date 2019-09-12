package com.example.mvp2;

import androidx.annotation.NonNull;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class ShowPresenter implements Show.Presenter {


    private Show.View mTvShowsView;

    public ShowPresenter(Show.View mTvShowsView) {
        attachView(mTvShowsView);
    }

    @Override
    public void attachView(Show.View view) {
        mTvShowsView = view;
    }

    @Override
    public List<TvShow> loadTvShows(boolean forceUpdate) {
        return ShowModel.getInstance().getTvShows();
    }

    @Override
    public void openTvShowDetails(@NonNull TvShow requestedTvShow) {
        //TBD
    }
}