package com.mgh.pmdm.contador

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.mgh.pmdm.contador.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var contador=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        val miDialogo = MiDialogFragment()

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //Comentario commit

        // Referencia al TextView

        // Inicializamos el TextView con el contador a 0
        binding.textViewContador.setText(contador.toString())

        // Referencia al botón

        // Asociaciamos una expresióin lambda como
        // respuesta (callback) al evento Clic sobre
        // el botón
        binding.btAdd.setOnClickListener {
            contador++
            binding.textViewContador.setText(contador.toString())
        }

        binding.botonMenos.setOnClickListener {
            contador--
            binding.textViewContador.setText(contador.toString())
        }

        binding.reset.setOnClickListener {
            contador = 0
            binding.textViewContador.setText(contador.toString())
            miDialogo.show(supportFragmentManager, "MiDialogo")
        }



    }
}