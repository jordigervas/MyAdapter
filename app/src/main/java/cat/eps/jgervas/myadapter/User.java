package cat.eps.jgervas.myadapter;

/**
 * Created by jgervas on 24/10/2017.
 */

public class User {

    /** User login **/
    private String mUserLogin;
    /** User name **/
    private String mUserName;
    /** Image resource ID for the user **/
    private int mImageResourceId;

    /**
     * Create a new User object.
     *
     * @param login is the user's login
     * @param name is the user's name
     * @param imageResourceId is the drawable resource ID for the image associated with the word
     *
     */

    public User(String login, String name, int imageResourceId) {
        mUserLogin = login;
        mUserName = name;
        mImageResourceId = imageResourceId;
    }


    /**
     * Get the user's login.
     */
    public String getUserLogin() {
        return mUserLogin;
    }

    /**
     * Get the user's name.
     */
    public String getUserName() {
        return mUserName;
    }

    /**
     * Return the image resource ID of the user.
     */
    public int getImageResourceId() { return mImageResourceId; }

}
