package com.example.courseproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    enum class  LoginSuccess
        constructor(val intValue: Int){
        login(intValue = 1),
        password(intValue = 2),
        success(intValue = 0)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtLogin = findViewById<TextView>(R.id.Login)
        val txtPassword = findViewById<TextView>(R.id.Password)
        val btnLogin = findViewById<TextView>(R.id.LoginBtn)

        btnLogin.setOnClickListener{when ()

        }

    }
fun CheckLogin(txtLogin: String, txtPassword: String): LoginSuccess {

    val holdLogin = "Steffen"
    val holdPassword = "Password"

    if(holdLogin != txtLogin){
        return LoginSuccess.login
    }

    return if(holdPassword != txtPassword){
        return LoginSuccess.password
    } else LoginSuccess.success
}

}


