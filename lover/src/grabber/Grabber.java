package grabber;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class Grabber {

    static void test0() throws IOException {
        File html = new File("/Users/mrsong/Desktop/a.htm");
        Document document = Jsoup.parse(html, "UTF-8");
        Elements elements = document.select(".n1-home");
        for (Element element: elements)
            System.out.println(element.text());
    }

    public static void main(String[] args) throws Exception {
        test0();
    }

}
