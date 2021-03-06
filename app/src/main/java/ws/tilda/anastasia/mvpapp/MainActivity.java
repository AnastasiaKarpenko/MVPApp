package ws.tilda.anastasia.mvpapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements MainContractor.MainView {
    EditText mEditText;
    Button mButton;

    MainPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditText = findViewById(R.id.editText);
        mButton = findViewById(R.id.button);

        mPresenter = new MainPresenter(this);

    }

    public void onButtonClick(View view) {
        mPresenter.onButtonClick(mEditText.getText().toString());
    }
}
