package cat.eps.jgervas.myadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;


/**
 * Created by jgervas on 24/10/2017.
 */

public class UserAdapter extends ArrayAdapter {

    public UserAdapter(Context context, ArrayList<User> users) {
        super(context, 0, users);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;

        if(listItemView == null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        User currentUser = (User) getItem(position);

        TextView loginTextView = (TextView) listItemView.findViewById(R.id.user_login);
        loginTextView.setText(currentUser.getUserLogin());

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.user_name);
        nameTextView.setText(currentUser.getUserName());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentUser.getImageResourceId());

        return listItemView;
    }
}
