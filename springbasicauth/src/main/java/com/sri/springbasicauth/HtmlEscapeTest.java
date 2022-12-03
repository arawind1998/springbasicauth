import java.io.File;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringEscapeUtils;
//import org.apache.commons.text.StringEscapeUtils;
//import org.springframework.util.StringUtils;



public class HtmlEscapeTest {

    public static void main(String[] args) throws Exception {

        String str = FileUtils.readFileToString(new File("input.txt"));
        String results = StringEscapeUtils.escapeHtml(str);
        System.out.println(results);

    }

}

