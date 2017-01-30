package viren.user.com.grdtxtimg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    String[] technologies={
            "Web",
            "Mobile",
            "Database",
            "Software Testing",
            "Framework"
    };
      Integer[]  image={
              R.mipmap.web,
              R.mipmap.mobile,
              R.mipmap.database,
              R.mipmap.testing,
              R.mipmap.frameworks

      };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        grid=new GridView(getApplicationContext());

        setContentView(R.layout.activity_main);
        gridView=(GridView)findViewById(R.id.grd);
       //CustomGrid adapter=new CustomGrid(this,technologies,image);
//        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//
//            }
//        });
        gridView.setAdapter(new CustomGrid(this,technologies,image));


            }

    }


