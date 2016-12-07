package id.sch.smktelkom_mlg.project.xirpl605142332.wayangku;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;

/**
 * Created by -asus- on 11/17/2016.
 */
public class ProfileWayang extends Fragment {

    RelativeLayout view;
    Activity context;
    public ProfileWayang() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        context = getActivity();

        getActivity().setTitle("Profile");
        return inflater.inflate(R.layout.profile_wayang, container, false);
    }

    public void onStart() {
        super.onStart();
        Button bt = (Button) context.findViewById(R.id.bt);
        bt.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(context, ProfilClass.class);
                //add data to the Intent object
                startActivity(intent);
            }

        });
    }

    private class OnClickListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            onStart();
        }
    }
}