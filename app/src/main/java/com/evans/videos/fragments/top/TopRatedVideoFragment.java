package com.evans.videos.fragments.top;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.evans.videos.R;

public class TopRatedVideoFragment extends Fragment {

    private TopRatedVideoViewModel mViewModel;

    public static TopRatedVideoFragment newInstance() {
        return new TopRatedVideoFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.top_rated_video_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(TopRatedVideoViewModel.class);
        // TODO: Use the ViewModel
    }

}
