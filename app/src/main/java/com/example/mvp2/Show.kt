package com.example.mvp2

import androidx.annotation.NonNull
import com.example.mvp2.Show.Presenter



interface Show {
    interface View : Mvp.View {
        fun setLoadingIndicator(active: Boolean)
        fun showTvShows(shows: List<TvShow>)
        fun showTvShowDetailsUi(showId: String)
        fun showLoadingTvShowsError()
        fun showNoTvShows()
    }

    interface Model : Mvp.Model {
        val tvShows: List<TvShow>
    }

    interface Presenter : Mvp.Presenter<View> {
        fun loadTvShows(forceUpdate: Boolean): List<TvShow>
        fun openTvShowDetails(requestedTvShow: TvShow)
        override fun attachView(view: com.example.mvp2.Show.View)
    }
}