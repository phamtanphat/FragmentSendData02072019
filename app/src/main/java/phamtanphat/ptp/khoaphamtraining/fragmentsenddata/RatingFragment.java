package phamtanphat.ptp.khoaphamtraining.fragmentsenddata;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;

public class RatingFragment extends Fragment {

    View view;
    RatingBar ratingBar;
    OnListenerRatingBar onListenerRatingBar;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_rating, container, false);

        ratingBar = view.findViewById(R.id.ratingbar);
//
//        Bundle bundle = getArguments();
//        int numstar = bundle.getInt("numstar");
//
//        ratingBar.setRating(numstar);

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                onListenerRatingBar.onChange(v);
            }
        });
        return view;
    }
    public void setOnListenerRatingBar(OnListenerRatingBar onListenerRatingBar){
        this.onListenerRatingBar = onListenerRatingBar;
    }

}
