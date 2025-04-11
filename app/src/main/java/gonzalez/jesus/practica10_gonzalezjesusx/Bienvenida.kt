package gonzalez.jesus.practica10_gonzalezjesusx

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Bienvenida : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_bienvenida)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val correo = intent.getStringExtra("correo")
        val proveedor = intent.getStringExtra("proveedor")

        val correoTextView = findViewById<TextView>(R.id.evCorreo)
        val proveedorTextView = findViewById<TextView>(R.id.evProveedor)

        correoTextView.text = "Correo: $correo"
        proveedorTextView.text = "Proveedor: $proveedor"

    }
}