package com.evans.videos.fragments.upcoming;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.evans.videos.R;

public class UpcomingVideoFragment extends Fragment {

    private UpcomingVideoViewModel mViewModel;

    public static UpcomingVideoFragment newInstance() {
        return new UpcomingVideoFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.upcoming_video_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(UpcomingVideoViewModel.class);
        // TODO: Use the ViewModel
    }

}
