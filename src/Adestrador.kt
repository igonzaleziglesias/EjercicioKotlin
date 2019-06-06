
import javax.swing.JOptionPane

class Adestrador(nome: String, apelidos: String, id: Int, edad: Int, var idFederacion: String?) :
    Plantilla(nome, apelidos, id, edad) {//hereda de plantilla, los parametros que hereda no llevan var, los demas si

    private fun dirixirPartido() {}
    private fun dirixirAdestramento() {}
    override fun viaxar() {
        JOptionPane.showMessageDialog(null, "Viaxa o entrenador:" + super.nome)
    }//sobreescribir

    override fun toString(): String {
        return "O adestrador é:\n" + super.toString() + "\nIdFederacion=" + idFederacion//sobreescribir
    }

}
