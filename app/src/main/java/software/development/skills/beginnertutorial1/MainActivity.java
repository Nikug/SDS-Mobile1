package software.development.skills.beginnertutorial1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addButton = (Button) findViewById(R.id.addButton);
        addButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               EditText firstNumEditText = (EditText) findViewById(R.id.firstNumEditText);
               EditText secondNumEditText = (EditText) findViewById(R.id.secondNumEditText);
               TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

               int num1 = Integer.parseInt(firstNumEditText.getText().toString());
               int num2 = Integer.parseInt(secondNumEditText.getText().toString());
               int result = num1 + num2;
               resultTextView.setText(result + "");
           }
        });
    }
}
