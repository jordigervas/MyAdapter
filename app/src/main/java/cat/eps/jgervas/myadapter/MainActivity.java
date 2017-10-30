package cat.eps.jgervas.myadapter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    static final String EXTRA_USER = "EXTRA_USER";
    static final String EXTRA_IMAGE = "EXTRA_IMAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<User> users = new ArrayList<User>();

        users.add(new User("jcarles","Jordi Carles",R.drawable.ic_account_circle_black_24dp));
        users.add(new User("rtremosa","Ramon Tremosa",R.drawable.ic_account_circle_black_24dp));
        users.add(new User("iGarcia","Irene Garcia",R.drawable.ic_account_circle_black_24dp));
        users.add(new User("slopez","Sergi López",R.drawable.ic_account_circle_black_24dp));
        users.add(new User("ibaque","Ivan Baqué",R.drawable.ic_account_circle_black_24dp));
        users.add(new User("jmiquel","Jordi Miquel",R.drawable.ic_account_circle_black_24dp));
        users.add(new User("mramon","Marta Ramon",R.drawable.ic_account_circle_black_24dp));
        users.add(new User("ivila","Iolanda Vila",R.drawable.ic_account_circle_black_24dp));
        users.add(new User("cdavila","Carme Dávila",R.drawable.ic_account_circle_black_24dp));
        users.add(new User("mmiquel","Miquel Miquel",R.drawable.ic_account_circle_black_24dp));

        UserAdapter itemsAdapter = new UserAdapter(this, users);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                User userClicked = (User) parent.getItemAtPosition(position);
                Intent intent = new Intent(getApplicationContext(), DetailActivity.class);
                intent.putExtra(EXTRA_USER, userClicked.getUserName());
                intent.putExtra(EXTRA_IMAGE, userClicked.getImageResourceId());
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.action_settings:
                Toast.makeText(getApplicationContext(), getResources().getString(R.string.title_settings),Toast.LENGTH_SHORT).show();
                return true;
            case R.id.action_search:
                Toast.makeText(getApplicationContext(), getResources().getString(R.string.title_search),Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
