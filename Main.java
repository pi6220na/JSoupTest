package com.wolfe;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {


   //     File input = new File("C:/Users/myrlin/Desktop/Java/JavaDocs/docs/api/java/util/Collections.html");
        File input = new File("C:/Users/myrlin/Desktop/Java/JavaDocs/docs/api/java/util/Collection.html");
        Document doc = Jsoup.parse(input, "UTF-8");


        /*
        //get meta keyword content
        String keywords = doc.select("meta[name=keywords]").first().attr("content");
        System.out.println("Meta keyword : " + keywords);
        */





            // get page title
//            String title = doc.title();
//            System.out.println("title : " + title);

            // get all links
            // Elements links = doc.select("div[class=block]"); // this works well but only gets first group


            //Elements links = doc.select("h[4]").select("div[class=block]");


        /*
        Elements h4tags = doc.select("h4").select("div[class=block]");
        Elements more = doc.select("div[class=block]");

        for (Element test : h4tags) {
            System.out.println(test.text());
        }

        for (Element test2 : more) {
            System.out.println(test2.text());
        }
        */


 //       Elements h4tags = doc.select("h1,h2,h3,h4");
       // doc.select("div[class=block]");

/*
        Elements h4tags = doc.select("h4, div[class=block]");  //// woohoo it works - two items printed together!!!!
        for (Element test : h4tags) {
            System.out.println(test.text());
        }
*/

            // div[class=block]

        Elements h4tags = doc.select("li[class=blocklist] > div[class=block]");
        for (Element test : h4tags) {
            System.out.println(test.firstElementSibling().html());
            System.out.println(test.text());
            System.out.println();
        }




        //System.out.println(h4tags.text());
        //System.out.println(more.text());




//        String description = doc.select("meta[name=description]").get(0).attr("content");
//        System.out.println("Meta description : " + description);

        //String keywords = doc.select("meta[name=keywords]").first().attr("content");
        //System.out.println("Meta keyword : " + keywords);

        /*

        Elements keywords = doc.select("meta[name=keywords]");
        for (Element keyword : keywords)
        {

            System.out.println("meta : " + keyword.attr("content"));
            System.out.println("text : " + keyword.text());

        }

        */

    }

}
