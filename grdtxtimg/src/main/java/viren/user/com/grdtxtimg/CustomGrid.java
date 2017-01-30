package viren.user.com.grdtxtimg;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import static android.R.attr.resource;
import static android.R.attr.theme;

/**
 * Created by HP on 17-01-2017.
 */
public class CustomGrid extends BaseAdapter {

    private Context mcontext;
    private String[] technologies;
    private Integer[] image;

    public CustomGrid(MainActivity mainActivity, String[] technologies, Integer[] image) {
       // super(mcontext,R.layout.grid_single,R.id.grdtxt,technologies);
        this.mcontext = mainActivity;
        this.technologies = technologies;
        this.image = image;
    }

    @Override
    public int getCount() {
        return technologies.length ;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflator = (LayoutInflater) mcontext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflator.inflate(R.layout.grid_single, null);

        ImageView imageView = (ImageView) view.findViewById(R.id.grdimg);
        TextView txtview = (TextView)view.findViewById(R.id.grdtxt);
        imageView.setImageResource(image[position]);
        txtview.setText(technologies[position]);
        return view;
    }

}