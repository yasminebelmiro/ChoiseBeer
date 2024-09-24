package ifgoiano.urt.choisebeer
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity


class BuscarCervejaActivity : AppCompatActivity() {

    private lateinit var cervejaExpert: ExpertCerveja
    private lateinit var tipoCervejaSpinner: Spinner
    private lateinit var mostrarMarcas: TextView
    private lateinit var buscarMarcasButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buscar_cerveja)
        cervejaExpert = ExpertCerveja()
        tipoCervejaSpinner = findViewById(R.id.tipo_cerveja_spinner)
        mostrarMarcas = findViewById(R.id.marcas_text_view)
        buscarMarcasButton = findViewById(R.id.buscar_button)
        buscarMarcasButton.setOnClickListener {
            buscarMarcas()
        }
    }

    private fun buscarMarcas() {
        val tipoSelecionado = tipoCervejaSpinner.selectedItem.toString()
        val marcas = cervejaExpert.getMarcas(tipoSelecionado)
        mostrarMarcas.text = marcas.joinToString(separator = "\n")
    }
}
