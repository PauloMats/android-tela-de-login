package com.betrybe.sociallogin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.Button
import androidx.core.widget.addTextChangedListener
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    private val loginBtn: Button by lazy { findViewById(R.id.login_button) }
    private val emailText: TextInputLayout by lazy { findViewById(R.id.email_text_input_layout) }
    private val passwordText: TextInputLayout by lazy { findViewById(R.id.password_text_input_layout) }
    private val main: View by lazy { findViewById(R.id.main) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        emailText.editText?.addTextChangedListener {
            val email = emailText.editText?.text.toString()
            val password = passwordText.editText?.text.toString()
            loginBtn.isEnabled = email.isNotEmpty() && password.isNotEmpty()
        }

        passwordText.editText?.addTextChangedListener {
            val email = emailText.editText?.text.toString()
            val password = passwordText.editText?.text.toString()
            loginBtn.isEnabled = email.isNotEmpty() && password.isNotEmpty()
        }
    }
}
