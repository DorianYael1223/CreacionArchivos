import java.io.FileInputStream;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;

public class LeerWord {

    public static void main(String[] args) throws Exception {
        // Abrir el documento de Word
        FileInputStream in = new FileInputStream("documento.docx");
        try (XWPFDocument documento = new XWPFDocument(in)) {
            // Obtener el primer párrafo
            XWPFParagraph parrafo = documento.getParagraphs().get(0);

            // Imprimir el texto del párrafo
            System.out.println(parrafo.getText());
        }

        in.close();
    }
}
