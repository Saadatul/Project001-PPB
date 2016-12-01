package id.sch.smktelkom_mlg.project.xirpl605142332.wayangku;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;


/**
 * Created by -asus- on 11/17/2016.
 */
public class AboutUs extends Fragment {


    RelativeLayout view;


    public AboutUs() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = (RelativeLayout) inflater.inflate(R.layout.about_us, container, false);

        getActivity().setTitle("About Us");

        return view;


    }


}

