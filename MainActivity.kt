package es.travelworld.traveling

import android.annotation.SuppressLint
import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.graphics.toColorInt

class MainActivity : AppCompatActivity(), View.OnClickListener, View.OnTouchListener {

    private lateinit var edittextMensaje: EditText
    private lateinit var buttonEnviar: Button
    private lateinit var textViewMensaje: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edittextMensaje = findViewById(R.id.edittext_mensaje)
        buttonEnviar = findViewById(R.id.button_enviar)
        textViewMensaje = findViewById(R.id.textview_mensaje)

        // Configuramos los escuchadores
        buttonEnviar.setOnClickListener(this)
        buttonEnviar.setOnTouchListener(this)
    }

    override fun onClick(view: View) {
        if (view == buttonEnviar) {
            val mensaje = edittextMensaje.text.toString().trim()
            // Solo actualizamos el TextView si el usuario ha escrito algo.
            // Esto garantiza que "HelloWorld" no desaparezca si el campo está vacío.
            if (mensaje.isNotEmpty()) {
                textViewMensaje.text = mensaje
                edittextMensaje.setText("")
            }
        }
    }

    @SuppressLint("ClickableViewAccessibility")
    override fun onTouch(view: View, event: MotionEvent): Boolean {
        if (view == buttonEnviar) {
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    // AL PRESIONAR: Ambos cambian al Azul solicitado (#0E79A2)
                    buttonEnviar.backgroundTintList = ColorStateList.valueOf("#0E79A2".toColorInt())
                    textViewMensaje.setTextColor("#0E79A2".toColorInt())
                }
                MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL -> {
                    // AL SOLTAR: Ambos vuelven al Gris por defecto (#444444)
                    buttonEnviar.backgroundTintList = ColorStateList.valueOf("#444444".toColorInt())
                    textViewMensaje.setTextColor("#444444".toColorInt())
                    
                    if (event.action == MotionEvent.ACTION_UP) {
                        view.performClick()
                    }
                }
            }
            return true // Consumimos el evento para que el control visual sea perfecto
        }
        return false
    }
}
