
import javax.swing.JOptionPane

class Masaxista(nome: String, apelidos: String, id: Int, edad: Int, var anosExperiencia: Int, var titulacion: String?) :
    Plantilla(nome, apelidos, id, edad) {//hereda de plantilla, los parametros que hereda de plantilla no llevan var los demas si

    override fun viaxar() {
        JOptionPane.showMessageDialog(null, "Viaxa o masaxista:" + super.nome!!)//sobreescribir
    }

    fun darMasaxes() {}

    override fun toString(): String {
        return "O masaxistata é:\n" + super.toString() + "\nAnosExperiencia=" + anosExperiencia + "\nTitulacion=" + titulacion//sobreescribir
    }


}
