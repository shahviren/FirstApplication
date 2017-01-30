package user.com.listviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private ListView listview;
    private AutoCompleteTextView autoCompleteTextView;

    private String[] cities={"Chennai","Mumbai","Banglore","Hyderabad","Gujrat","Rajasthan","Punjab","Manglore","Mehsana","chandigarh","Gandhinagar"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        autoCompleteTextView=(AutoCompleteTextView)findViewById(R.id.autotxt) ;
        listview=(ListView)findViewById(R.id.list);
       // searchView=(SearchView)findViewById(R.id.srcview);
        final ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,cities);
        autoCompleteTextView.setThreshold(1);
        autoCompleteTextView.setAdapter(adapter);
        listview.setAdapter(adapter);

    }
}
