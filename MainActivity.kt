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

// Clase principal que maneja los eventos de clic y de presión táctil
class MainActivity : AppCompatActivity(), View.OnClickListener, View.OnTouchListener {

    // Definimos las variables para los elementos de la interfaz
    private lateinit var edittextMensaje: EditText
    private lateinit var buttonEnviar: Button
    private lateinit var textViewMensaje: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Cargamos el diseño XML de la actividad
        setContentView(R.layout.activity_main)

        // Vinculamos las variables con los componentes del XML
        edittextMensaje = findViewById(R.id.edittext_mensaje)
        buttonEnviar = findViewById(R.id.button_enviar)
        textViewMensaje = findViewById(R.id.textview_mensaje)

        // Configuramos los escuchadores para detectar clics y toques en el botón
        buttonEnviar.setOnClickListener(this)
        buttonEnviar.setOnTouchListener(this)
    }

    // Acción que ocurre al hacer clic (cuando se suelta el botón después de presionarlo)
    override fun onClick(view: View) {
        if (view == buttonEnviar) {
            // Obtenemos el texto del campo de edición
            val mensajerecibido = edittextMensaje.text.toString()
            // Lo mostramos en el TextView inferior
            textViewMensaje.text = mensajerecibido
            // Limpiamos el campo de entrada
            edittextMensaje.setText("")
        }
    }

    // Acción que detecta el momento exacto en que se presiona y se suelta el botón
    @SuppressLint("ClickableViewAccessibility")
    override fun onTouch(view: View, event: MotionEvent): Boolean {
        if (view == buttonEnviar) {
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    // CUANDO SE PRESIONA:
                    // Cambiamos el color de fondo del botón al azul solicitado
                    buttonEnviar.backgroundTintList = ColorStateList.valueOf("#0D7B8A".toColorInt())
                    // Cambiamos el color del texto del TextView al mismo azul
                    textViewMensaje.setTextColor("#0D7B8A".toColorInt())
                }
                MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL -> {
                    // CUANDO SE SUELTA O SE CANCELA EL TOQUE:
                    // Devolvemos el botón a su color original (gris oscuro)
                    buttonEnviar.backgroundTintList = ColorStateList.valueOf("#444444".toColorInt())
                    // Devolvemos el texto a su color original (negro)
                    textViewMensaje.setTextColor(Color.BLACK)
                    // Llamamos a performClick para cumplir con las guías de accesibilidad
                    view.performClick()
                }
            }
        }
        // Retornamos false para que el evento de clic (onClick) también se pueda ejecutar
        return false
    }
}