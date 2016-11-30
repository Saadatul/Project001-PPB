package id.sch.smktelkom_mlg.project.xirpl605142332.wayangku;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by -asus- on 11/17/2016.
 */

public class Root extends Fragment {

    ViewPager viewPager;
    CustomAdapter adapter;

    View rootView;

    public Root() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.root, container, false);

        viewPager = (ViewPager) rootView.findViewById(R.id.view_pager);
        adapter = new CustomAdapter(getActivity());
        viewPager.setAdapter(adapter);

        return rootView;
    }
}