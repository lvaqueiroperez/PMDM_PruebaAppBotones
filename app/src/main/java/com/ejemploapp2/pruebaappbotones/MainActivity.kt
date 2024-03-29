package com.ejemploapp2.pruebaappbotones

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*
import org.jetbrains.anko.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        //OJO!!! Tendremos que importar los elementos de la interfaz en el código kotlin si queremos trabajar con ellos (alt + Intro)
        //PODRÍAMOS CREAR UNA FUNCIÓN EN VEZ DE ACCEDER AL LISTENER PARA TRABAJAR DE FORMA MÁS CÓMODA (hacer)
        btnSaludo.setOnClickListener {
            //Para cambiar el texto no hace falta acceder a las variables declaradas
            btnSaludo.setText("HOLAA!")
            //PARA ACCEDER A LAS VARIABLES XML !!!
            toast(R.string.saludar)

        }
        //Función toast hecha gracias a las librerías "Anko"
        toast("Esto es un mensaje toast gracias a ANKO")


    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
