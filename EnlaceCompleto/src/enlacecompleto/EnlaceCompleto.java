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
        
         do{
            op = mt.menu();
            switch(op){
                case 1 -> mt.insertar();
                case 2 -> mt.eliminar();
                case 3 -> mt.reporte('M');
                case 4 -> mt.reporte('F');
                case 5 -> mt.listar();
                default -> {}
            }
        }
        while (op != 0);
    }
    
}
