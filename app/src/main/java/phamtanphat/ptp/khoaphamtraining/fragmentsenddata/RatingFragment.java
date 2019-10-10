package phamtanphat.ptp.khoaphamtraining.fragmentsenddata;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;

public class RatingFragment extends Fragment {


    View view;
//    RatingBar ratingBar;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_rating, container, false);

//        ratingBar = view.findViewById(R.id.ratingbar);
//
//        Bundle bundle = getArguments();
//        int numstar = bundle.getInt("numstar");
//
//        ratingBar.setRating(numstar);

        return view;
    }

}
