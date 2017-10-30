package cat.eps.jgervas.myadapter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        String userName = intent.getStringExtra(MainActivity.EXTRA_USER);
        int userImage = intent.getIntExtra(MainActivity.EXTRA_IMAGE, 0);

        TextView nameTextView = (TextView) findViewById(R.id.user_name);
        nameTextView.setText(userName);

        ImageView imageView = (ImageView) findViewById(R.id.image);
        imageView.setImageResource(userImage);
    }
}
