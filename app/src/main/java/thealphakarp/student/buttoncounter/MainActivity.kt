package thealphakarp.student.buttoncounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

private const val TAG = "MainActivity"
private const val TITLE = "username"

class MainActivity : AppCompatActivity() {
    private var textView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "OnCreate: called")

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userName = findViewById<EditText>(R.id.editText)
        val button = findViewById<Button>(R.id.button)
        textView = findViewById<TextView>(R.id.textView)

        userName.hint = "Type something"

        textView?.text = ""
        textView?.movementMethod = ScrollingMovementMethod()

        button.setOnClickListener {
            Log.d(TAG, "OnCLick: called")
            textView?.append(userName.text)
            textView?.append("\n")

            userName.text.clear()
        }
    }

    override fun onStart() {
        super.onStart()

        Log.d(TAG, "OnStart: called")
    }

    override fun onResume() {
        super.onResume()

        Log.d(TAG, "onResume: called")
    }

    override fun onPause() {
        super.onPause()

        Log.d(TAG, "onPause: called")
    }

    override fun onStop() {
        super.onStop()

        Log.d(TAG, "onStop: called")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d(TAG, "onDestroy: called")
    }

    override fun onRestart() {
        super.onRestart()

        Log.d(TAG, "onRestart: called")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        Log.d(TAG, "onSaveInstanceState: called")

        super.onSaveInstanceState(outState)
        outState.putString(TITLE, textView?.text.toString())
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        Log.d(TAG, "onRestoreInstanceState: called")

        super.onRestoreInstanceState(savedInstanceState)
        textView?.text = savedInstanceState.getString(TITLE, "")
    }
}
