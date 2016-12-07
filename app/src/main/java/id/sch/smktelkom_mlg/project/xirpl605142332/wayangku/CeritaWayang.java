package id.sch.smktelkom_mlg.project.xirpl605142332.wayangku;

import android.app.Fragment;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by -asus- on 11/17/2016.
 */
public class CeritaWayang extends Fragment {

    RelativeLayout view;
    Button B, M, P, G;
    TextView hasil;
    Resources resources;

    public CeritaWayang() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        B = (Button) view.findViewById(R.id.buttonB);
        M = (Button) view.findViewById(R.id.buttonM);
        P = (Button) view.findViewById(R.id.buttonP);
        G = (Button) view.findViewById(R.id.buttonG);
        hasil = (TextView) view.findViewById(R.id.tvCerita);
        final String[] MB = resources.getStringArray(R.array.Mahabarata);
        final String[] BY = resources.getStringArray(R.array.Baratayudha);
        final String[] PW = resources.getStringArray(R.array.Pandawa);

        view = (RelativeLayout) inflater.inflate(R.layout.cerita_wayang, container, false);

        getActivity().setTitle("Cerita Wayang");

        B.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                doClick1();
            }

            private void doClick1() {
                hasil.setText(BY.toString());
            }
        });
        M.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                doClick2();
                hasil = (TextView) view.findViewById(R.id.tvCerita);
            }

            private void doClick2() {
                hasil.setText(MB.toString());
            }
        });
        P.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                doClick3();
                hasil = (TextView) view.findViewById(R.id.tvCerita);
            }

            private void doClick3() {
                hasil.setText(PW.toString());
            }
        });
        return view;
    }


}