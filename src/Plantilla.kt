
import javax.swing.JOptionPane

open class Plantilla(var nome: String?, var apelidos: String?, var id: Int, var edad: Int) {//clase plantilla con sus parametros
//hay q usar open para poder heredar de ella despues
    fun concentrarse() {
        JOptionPane.showMessageDialog(null, "Concentrase a seleccion.")//metodo concentrase muestra por pantalla un mensaje
    }

    open fun viaxar() {
        JOptionPane.showMessageDialog(null, "Viaxa a seleccion")//metodo viaxa muestra por pantalla un mensaje
    }

    override fun toString(): String {
        return "Nome=$nome\nApelidos=$apelidos\nId=$id\nEdad=$edad"//sobreescribir metodo tostring
    }

}
