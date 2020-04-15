package thealphakarp.student.buttoncounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var userName: EditText? = null
    private var button: Button? = null
    private var textView: TextView? = null
    private var numClickCounter: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        userName = findViewById<EditText>(R.id.editText)
        button = findViewById<Button>(R.id.button)
        textView = findViewById<TextView>(R.id.textView)

        button?.setOnClickListener {
            numClickCounter += 1
            textView?.append("\nclicked $numClickCounter times")
        }
    }
}
