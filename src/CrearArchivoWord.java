import java.io.File;
import java.io.FileOutputStream;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

public class CrearArchivoWord {

    public static void main(String[] args) throws Exception {
        try (// Crear un documento de Word en blanco
        XWPFDocument documento = new XWPFDocument()) {
            // Crear un párrafo y agregar texto
            XWPFParagraph parrafo = documento.createParagraph();
            XWPFRun run = parrafo.createRun();
            run.setText("Este es un documento de Word creado en Java");

            // Guardar el documento
            File archivo = new File("documento.docx");
            FileOutputStream out = new FileOutputStream(archivo);
            documento.write(out);
            out.close();
        }

        System.out.println("Documento creado correctamente");
    }
}
