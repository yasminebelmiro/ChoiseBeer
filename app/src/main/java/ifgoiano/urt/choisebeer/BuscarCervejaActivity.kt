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

        // Inicializando a classe ExpertCerveja
        cervejaExpert = ExpertCerveja()

        // Ligando os componentes da UI
        tipoCervejaSpinner = findViewById(R.id.tipo_cerveja_spinner)
        mostrarMarcas = findViewById(R.id.marcas_text_view)
        buscarMarcasButton = findViewById(R.id.buscar_button)

        // Definindo o comportamento do botão
        buscarMarcasButton.setOnClickListener {
            buscarMarcas()
        }
    }

    // Método para buscar e mostrar as marcas
    private fun buscarMarcas() {
        // Obtendo o tipo de cerveja selecionado
        val tipoSelecionado = tipoCervejaSpinner.selectedItem.toString()

        // Buscando as marcas para o tipo de cerveja
        val marcas = cervejaExpert.getMarcas(tipoSelecionado)

        // Mostrando as marcas no campo de texto
        mostrarMarcas.text = marcas.joinToString(separator = "\n")
    }
}
