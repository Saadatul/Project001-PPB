package id.sch.smktelkom_mlg.project.xirpl605142332.wayangku;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by ACER E5-471 on 30/11/2016.
 */
public class CustomAdapter extends PagerAdapter {

    private int[] images = {R.drawable.pict1, R.drawable.pict2, R.drawable.pict4, R.drawable.pict5, R.drawable.pict6,
            R.drawable.pict7, R.drawable.pict8, R.drawable.pict9, R.drawable.pict10};
    private Context ctx;
    private LayoutInflater inflater;

    public CustomAdapter(Context ctx) {
        this.ctx = ctx;
    }


    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view == object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        inflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.swipe, container, false);
        ImageView img = (ImageView) view.findViewById(R.id.imageView);

        img.setImageResource(images[position]);

        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.refreshDrawableState();
    }
}

