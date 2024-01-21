package com.sofia.eiameapp.upperbar.adaptasimitigasi;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import com.sofia.eiameapp.R;

public class FragmentAdaptasiMitigasi9 extends Fragment {


    public FragmentAdaptasiMitigasi9() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.upperbar_adaptasi_mitigasi_fragment9, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        YouTubePlayerView youTubePlayerView = view.findViewById(R.id.youtubeVideo1);
        getLifecycle().addObserver(youTubePlayerView);

        YouTubePlayerView youTubePlayerView2 = view.findViewById(R.id.youtubeVideo2);
        getLifecycle().addObserver(youTubePlayerView2);

        YouTubePlayerView youTubePlayerView3 = view.findViewById(R.id.youtubeVideo3);
        getLifecycle().addObserver(youTubePlayerView3);

        YouTubePlayerView youTubePlayerView4 = view.findViewById(R.id.youtubeVideo4);
        getLifecycle().addObserver(youTubePlayerView4);

        YouTubePlayerView youTubePlayerView5 = view.findViewById(R.id.youtubeVideo5);
        getLifecycle().addObserver(youTubePlayerView5);

        YouTubePlayerView youTubePlayerView6 = view.findViewById(R.id.youtubeVideo6);
        getLifecycle().addObserver(youTubePlayerView6);

    }
}