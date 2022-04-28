package sg.edu.np.mad.p03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView text;
    Boolean followed = false;
    User user = new User("Alfred", "Very cool", 1, false);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.textView9);
        text.setText(user.Name + "\n" + user.Description);

        if (user.Followed) {
            text = findViewById(R.id.button6);
            text.setText("Unfollow");
        }

    }

    public void Follow(View view){
        text = findViewById(R.id.button6);   //linked to the follow button
        followed = !followed;  //Switches between bool values when pressed
        if (followed){
            text.setText("Unfollow");
        }
        else {
            text.setText("Follow");
        }
    }
}