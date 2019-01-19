package com.example.j6450.inputoutputtextenter;

import android.app.Activity;
import android.os.Bundle;
import android.text.InputType;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity
{
    TextView outputText;
    EditText inputText;
    CharSequence textBuffer;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        outputText = (TextView) findViewById(R.id.textView);
        inputText = (EditText) findViewById(R.id.editText);
        inputText.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_FLAG_MULTI_LINE | InputType.TYPE_TEXT_FLAG_NO_SUGGESTIONS);

        inputText.setOnKeyListener(new View.OnKeyListener()
        {
            public boolean onKey(View v, int keyCode, KeyEvent event)
            {
                if (keyCode == KeyEvent.KEYCODE_ENTER)
                {
                    enterIO();
                    return true;
                }

                return false;
            }
        });

    }

    // when enter is pressed, enter input to ouput field
    public void enterIO ()
    {
        textBuffer = inputText.getText();
        outputText.setText(textBuffer);
    }

}
