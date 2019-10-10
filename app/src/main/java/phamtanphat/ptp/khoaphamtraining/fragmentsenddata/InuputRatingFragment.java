package phamtanphat.ptp.khoaphamtraining.fragmentsenddata;


import android.os.Build;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import java.util.Objects;


/**
 * A simple {@link Fragment} subclass.
 */
public class InuputRatingFragment extends Fragment {

    View view;
    EditText edtInput;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_inuput_rating, container, false);
        edtInput = view.findViewById(R.id.edittextInput);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        RatingFragment ratingFragment = (RatingFragment)
                        getActivity()
                        .getSupportFragmentManager()
                        .findFragmentById(R.id.fragmentRating);
        if (ratingFragment != null){
            ratingFragment.setOnListenerRatingBar(new OnListenerRatingBar() {
                @Override
                public void onChange(float rating) {
                    edtInput.setText(rating + "");
                }
            });
        }
    }
}
