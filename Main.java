package com.wolfe;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {



        File input = new File("C:/Users/myrlin/Desktop/Java/JavaDocs/docs/api/java/util/Collection.html");
        Document doc = Jsoup.parse(input, "UTF-8");


        /*
        //get meta keyword content
        String keywords = doc.select("meta[name=keywords]").first().attr("content");
        System.out.println("Meta keyword : " + keywords);
        */





            // get page title
            String title = doc.title();
            System.out.println("title : " + title);

            // get all links
            Elements links = doc.select("a[href]");
            for (Element link : links) {

                // get the value from href attribute
                System.out.println("\nlink : " + link.attr("href"));
                System.out.println("text : " + link.text());

            }




//        String description = doc.select("meta[name=description]").get(0).attr("content");
//        System.out.println("Meta description : " + description);

        //String keywords = doc.select("meta[name=keywords]").first().attr("content");
        //System.out.println("Meta keyword : " + keywords);

        Elements keywords = doc.select("meta[name=keywords]");
        for (Element keyword : keywords)
        {

            System.out.println("link : " + keyword.attr("keywords"));
            System.out.println("text : " + keyword.text());

        }



    }

}
