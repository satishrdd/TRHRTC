package me.kevingleason.androidrtc;

/**
 * Created by satish on 11/6/2015.
 */


        import android.app.Fragment;
        import android.os.Bundle;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;

        import me.kevingleason.androidrtc.R;

public class LogoutFragment extends Fragment {

    public LogoutFragment(){}


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_logout, container, false);

        return rootView;
    }
}

