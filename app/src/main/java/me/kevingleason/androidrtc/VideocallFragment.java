package me.kevingleason.androidrtc;

/**
 * Created by satish on 11/6/2015.
 */


        import android.app.Fragment;
        import android.content.Intent;
        import android.os.Bundle;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.Button;

        import me.kevingleason.androidrtc.R;

public class VideocallFragment extends Fragment {

    public VideocallFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       // final String myValue = this.getArguments().getString("message");

        View rootView = inflater.inflate(R.layout.fragment_videocall, container, false);
       Button btn = (Button) rootView.findViewById(R.id.videobtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),MainActivity1.class);
              //  intent.putExtra("username",myValue);
                startActivity(intent);

            }
        });

        return rootView;
    }


}
