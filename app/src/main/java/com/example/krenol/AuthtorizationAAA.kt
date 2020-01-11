package com.example.krenol

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase


class AuthtorizationAAA : AppCompatActivity() {

    lateinit var Button1 : Button
    lateinit var Button2 : Button
    private var mAuth: FirebaseAuth? = null
    private var db : FirebaseDatabase? = null
    private var users : DatabaseReference? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_authtorization_aa)
        Button1 = findViewById(R.id.button1)
        Button2 = findViewById(R.id.button2)
        mAuth = FirebaseAuth.getInstance()
        db = FirebaseDatabase.getInstance()
        users = db?.getReference("users")
        Button2.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                showRegisterWindow()
            }
        })
    }

    private fun showRegisterWindow() {
        var dialog = AlertDialog.Builder(this)
        dialog.setTitle("Register")
        dialog.setMessage("Enter all registration data")

        //layoutInflater in


    }
}
