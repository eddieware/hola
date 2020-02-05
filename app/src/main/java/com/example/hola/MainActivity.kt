package com.example.hola

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var mCount:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    //funcion Hola
    public fun hola(view: View){ // sobrecargar el constructor con view ws para poder visualizar la funcion en la vista y llamarla con un boton o elemento grafico
        Toast.makeText( this, "Hola", Toast.LENGTH_LONG).show()

    }
    public fun contadorClicks(view: View){
        mCount++
        contador.text = mCount.toString()

    }
}
