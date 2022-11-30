package jp.sio.testapp.savesetting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnSettingSave;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSettingSave = (Button)findViewById(R.id.buttonSave);
        tvResult = (TextView)findViewById(R.id.tvResult);
        SaveSettingLog savelog = new SaveSettingLog(this);
        final SaveSettingUsecase usecase = new SaveSettingUsecase();

        btnSettingSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usecase.getSetting();
            }
        });

    }

    protected void setText(String str){
        tvResult.setText(str);
    }

    protected void clearText(){
        tvResult.setText("");
    }

    public void showToast(String str){
        Toast.makeText(this,str,Toast.LENGTH_LONG).show();
    }


}
