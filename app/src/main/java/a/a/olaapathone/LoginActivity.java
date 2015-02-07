package a.a.olaapathone;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.parse.Parse;


public class LoginActivity extends ActionBarActivity {

    protected EditText mMobnum;
    protected EditText mPassword;
    protected Button mLogin;
    protected Button mSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "mesmAxuMihpWNrKPAPSVR6IwWBFB0txHJBvRcQdr", "sjZoYa17SfdRIivf29UtSoCj6w5JsSfdBShkyvyJ");

        mMobnum = (EditText) findViewById(R.id.mob_login);
        mPassword = (EditText) findViewById(R.id.pwd_login);
        mLogin = (Button) findViewById(R.id.login1);
        mSignup = (Button) findViewById(R.id.sgnbttn);

        mSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this,SignupActivity.class);

                startActivity(intent);
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
