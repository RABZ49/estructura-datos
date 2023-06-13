package enlacecompleto;

/**
 *
 * @author UTPL
 */
public class EnlaceCompleto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Metodos mt = new Metodos();
        int op;
        op = mt.menu();
        switch (op) {
            case 1:
                mt.insertar();
                break;
            default:
            case 2:
                mt.eliminar();
                break;
            case 3:
                mt.reporte("x");
                break;
            case 4:
                mt.reporte("x");
                break;
            case 5:
                mt.lista("x");
                break;
        }
        while (op != 0) {

        }
    }

}
