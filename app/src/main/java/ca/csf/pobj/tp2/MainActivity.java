package ca.csf.pobj.tp2;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

import java.security.InvalidParameterException;

public class MainActivity extends AppCompatActivity {

    private EditText inputEditText;
    private TextView outputTextView;

    private final String SAVED_ROMAN_NUMBER = "SAVED_ROMAN_NUMBER";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputEditText = findViewById(R.id.edittext);
        outputTextView = findViewById(R.id.textview);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(SAVED_ROMAN_NUMBER, outputTextView.getText().toString());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        outputTextView.setText(savedInstanceState.getString(SAVED_ROMAN_NUMBER));
    }

    public void onClickedConvertNumber(View view) {
        if (isValidInputNumber()) {
            try {
                RomanNumber r = new RomanNumber(Integer.parseInt(inputEditText.getText().toString()));
                outputTextView.setText(r.toString());
            }
            catch (NumberFormatException e) {
                outputTextView.setText("");
                Snackbar.make(view, R.string.error_parsing_number, Snackbar.LENGTH_SHORT).show();
            }
        }
        else {
            outputTextView.setText("");
            Snackbar.make(view, R.string.error_not_a_valid_number, Snackbar.LENGTH_SHORT).show();
        }
        hideKeyboard();
    }

    public boolean isValidInputNumber() {
        try {
            int x = Integer.parseInt(inputEditText.getText().toString());
            if (x < 1 || x > 4999) {
                return false;
            }
            return true;
        }
        catch (Exception NumberFormatException) {
            return false;
        }
    }

    public void hideKeyboard() {
        InputMethodManager imm = (InputMethodManager) this.getSystemService(Activity.INPUT_METHOD_SERVICE);
        //Find the currently focused view, so we can grab the correct window token from it.
        View view = this.getCurrentFocus();
        //If no view currently has focus, create a new one, just so we can grab a window token from it
        if (view == null) {
            view = new View(this);
        }
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
}
