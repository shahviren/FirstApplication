package user.com.listimages;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<String>data=new ArrayList<>();
        data.add("Tom");
        data.add("Jerry");
        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,data);
        ListView list=(ListView)findViewById(R.id.listCartoons);
        list.setAdapter(adapter);
    }
}
