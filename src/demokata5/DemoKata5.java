package demokata5;

import static demokata5.CrearBD.createNewDatabase;
import static demokata5.CrearTabla.createNewTable;

public class DemoKata5 {
    public static void main(String[] args) {
        InsertarDatosTabla idt = new InsertarDatosTabla();
// Se insertar 3 nuevas líneas
        idt.insert("abc@ulpgc.es");
        idt.insert("xyz@ull.es");
        idt.insert("def123@gmail.com");
    }
}
