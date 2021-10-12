package ex43;

import java.io.*;

public class htmlCreator
{
    public static void boilerplateCreator (String name, String author, boolean js, boolean css) throws IOException {
        //Create root for website
        new File("src/main/java/ex43/website/" + name).mkdirs();
        System.out.println("Created /website/" + name);

        //Create Index.html
        File output = new File("src/main/java/ex43/website/" + name + "/index.html");
        System.out.println("Created /website/" + name + "/index.html");

        //Write index.html
        BufferedWriter outstream = new BufferedWriter(new FileWriter(output));

        outstream.write("<!DOCTYPE html>\n");
        outstream.write("<html>\n");

        outstream.write("<head>\n");
        outstream.write("\t<meta charset=\"utf-8)\">\n");
        outstream.write("\t<title></title>\n");
        outstream.write("\t<meta name = \"author\" content=\"" + author + "\">\n\n");

        //Create optional CSS folder and link
        if (css == true)
        {
            new File("src/main/java/ex43/website/" + name + "/resources/css");
            outstream.write("\t<link href=\"resources/css/style.css\" rel=\"stylesheet\">\n");
            System.out.println("Created /website/" + name + "/resources/css");
        }

        //Head and body
        outstream.write("</head>\n");
        outstream.write("<body>\n");

        //Optional JavaScript folder and link
        if (js == true)
        {
            new File("src/main/java/ex43/website/" + name + "/resources/script");
            outstream.write("\t<script src=\"resources/js/script.js\"></script>\n");
            System.out.println("Created /website/" + name + "/resources/script");
        }

        outstream.write("</body>\n\n");
        outstream.write("</html>");

        outstream.flush();
        outstream.close();
    }
}
