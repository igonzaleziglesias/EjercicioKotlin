
import javax.swing.JOptionPane

class Xogador(nome: String, apelidos: String, id: Int, edad: Int, var dorsal: Int, var demarcacion: String?) :
    Plantilla(nome, apelidos, id, edad) {//clase xogador hereda de plantilla, los parametros de plantilla no llevan var en el constructor los dema si

    private fun xogarPartido() {}
    private fun entrenar() {}
    override fun viaxar() {
        JOptionPane.showMessageDialog(null, "Viaxan os xogadores:" + super.nome!!)//metodo viaxar sobreeescrito
    }

    override fun toString(): String {
        return "O xogador é:\n" + super.toString() + "\nDorsal=" + dorsal + "\nDemarcacion=" + demarcacion//metodo tostring sobreescrito
    }

}
