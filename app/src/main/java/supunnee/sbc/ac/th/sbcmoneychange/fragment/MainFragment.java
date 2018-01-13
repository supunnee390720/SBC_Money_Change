package supunnee.sbc.ac.th.sbcmoneychange.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


import supunnee.sbc.ac.th.sbcmoneychange.R;

/**
 * Created by LAB3201_00 on 12/1/2561.
 */

public class MainFragment extends Fragment{

    private double aDouble = 33.11;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//        Calculate Controller
        calculateController();



    }//Main Method

    private void calculateController() {
        Button button = getView().findViewById(R.id.btnCalculate);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                Replace Fragment
                getActivity().getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.contentMainFragment,Calculate2Fragment.calculateInstance(aDouble))
                        .addToBackStack(null)
                        .commit();
            }
        });
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        return view;
    }
} //Main Class
