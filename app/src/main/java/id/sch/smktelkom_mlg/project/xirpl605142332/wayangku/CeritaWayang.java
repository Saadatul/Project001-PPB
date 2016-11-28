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
public class CeritaWayang extends Fragment {

    RelativeLayout view;

    public CeritaWayang() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = (RelativeLayout) inflater.inflate(R.layout.cerita_wayang, container, false);

        getActivity().setTitle("Cerita Wayang");

        return view;
    }
}