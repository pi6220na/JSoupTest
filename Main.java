package com.wolfe;

import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) throws IOException {




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


        //*************************
        /*
        Elements h4tags = doc.select("li[class=blocklist] > div[class=block]");
        for (Element test : h4tags) {
            System.out.println(test.firstElementSibling().html());
            System.out.println(test.text());
            System.out.println();
        }
        */
        //*************************



        /*
        //****************              Keeper         example of package summary scrape    ************************
        //    File input = new File("C:/Users/myrlin/Desktop/Java/JavaDocs/docs/api/java/util/Collections.html");
        //    File input = new File("C:/Users/myrlin/Desktop/Java/JavaDocs/docs/api/java/util/Collection.html");
        File input = new File("/C:/Users/myrlin/Desktop/Java/JavaDocs/docs/api/java/util/package-summary.html");
        Document doc = Jsoup.parse(input, "UTF-8");


        Element table = doc.select("table[summary=Interface Summary table, listing interfaces, and an explanation]").first();
        Iterator<Element> iterator = table.select("td").iterator();
        int count = 1;
        while(iterator.hasNext()) {
            System.out.println(count + " text : " + iterator.next().text());
            System.out.println(count + " text : " + iterator.next().text());
            count++;
        }
        //****************              Keeper         example of package summary scrape    ************************
        */


        //*************************

        // Elements h4tags = doc.select("li[class=blocklist] > div[class=block]");

        //[goodbye="Columbus"]

        //Elements h4tags = doc.select("h4 ~ pre");

        //Elements colfirst = doc.select("td[class=colfirst]");
        //Elements collast = doc.select("td[class=collast]");

        // DOM selections
        //Elements colfirst = doc.getElementsByAttributeValue("class", "colfirst");
        //Elements selected = doc.getElementsByTag("td");


        // Elements colfirst = doc.getElementsByAttributeValue("class", "colfirst");
        // Elements selected = doc.getElementsByTag("td");

        //  Elements content = doc.select("tr > td"); //sort of works at a table level

        //       Elements content = doc.getElementsByClass("colfirst");
        //  Elements content2 = doc.select("table[summary=method summary table, listing methods, and an explanation]");  //:has(code) //, td[class=collast]

        /*
        for (Element table : doc.select("table")) {
            for (Element row : table.select("tr")) {
                Elements tds = row.select("td");
                System.out.println(tds.get(0).text());
            }
        }
        */

        // Elements table = doc.getElementsByAttributeValue("summary", "Method Summary table, listing methods, and an explanation");


        /*
        //    File input = new File("C:/Users/myrlin/Desktop/Java/JavaDocs/docs/api/java/util/Collections.html");
        //    File input = new File("C:/Users/myrlin/Desktop/Java/JavaDocs/docs/api/java/util/Collection.html");
        File input = new File("/C:/Users/myrlin/Desktop/Java/JavaDocs/docs/api/java/util/package-summary.html");
        Document doc = Jsoup.parse(input, "UTF-8");


        Elements items = doc.select("div[class=header]");
        for (Element test : items) {
            //System.out.println(test.firstElementSibling().html());
            System.out.println(test.text());
            System.out.println();
        }

        Elements items = doc.select("div[class=header]");
        Iterator<Element> iterator = items.select("h1").iterator();
        int count = 1;
        String title = null;
            title = iterator.next().text();
            System.out.println(count + " text : " + title);
        title = title.replace("Package", "");
            System.out.println("title = " + title);

        items = doc.select("div[class=docSummary]");
        String description = null;
        iterator = items.select("div[class=block]").iterator();
        description = iterator.next().text();
        System.out.println(count + " text : " + description);
      //  title = title.replace("Package", "");
        System.out.println("description = " + description);
        */




/*
//*******************  keeper - gets details from class type file ****************************
        //    File input = new File("C:/Users/myrlin/Desktop/Java/JavaDocs/docs/api/java/util/Collections.html");
        //    File input = new File("C:/Users/myrlin/Desktop/Java/JavaDocs/docs/api/java/util/Collection.html");
        //    File input = new File("/C:/Users/myrlin/Desktop/Java/JavaDocs/docs/api/java/util/package-summary.html");
        File input = new File("C:/Users/myrlin/Desktop/Java/JavaDocs/docs/api/java/util/Arrays.html");
        Document doc = Jsoup.parse(input, "UTF-8");


        Elements details = doc.select("div[class=details]");
        //Iterator<Element> iterator = table.select("td[class=colLast]").iterator();
        Iterator<Element> iter = details.select("pre, div, dl").iterator();
        int count = 1;
        iter.next().text();
        String string1 = null;
        String string2 = null;
        String string3 = null;
        while(iter.hasNext()) {
            string1 = iter.next().text();
            string2 = iter.next().text();
            string3 = iter.next().text();

            System.out.println(string1);
            System.out.println(string2);
            System.out.println(string3);

            //System.out.println(count + " text : " + iter.next().text());
            //System.out.println(count + " text : " + iter.next().text());
            //System.out.println(count + " text : " + iter.next().text());
            count++;
        }

        System.out.println("string2 as array = " );
        System.out.println("length = " + string2.length());
        // String string2a = string2.split(". ");
        System.out.println(string2.getClass().getName());

        System.out.println("iter length = " + iter);

//*******************  keeper - gets details from class type file ****************************
*/







/*
        Elements keywords = doc.select("meta[name=keywords]");
        for (Element keyword : keywords)
        {

            System.out.println("meta : " + keyword.attr("content"));
            System.out.println("text : " + keyword.text());

        }

*/


//*************** keeper - gets the modifier and type and method name ***********************
        //    File input = new File("C:/Users/myrlin/Desktop/Java/JavaDocs/docs/api/java/util/Collections.html");
        //    File input = new File("C:/Users/myrlin/Desktop/Java/JavaDocs/docs/api/java/util/Collection.html");
        //    File input = new File("/C:/Users/myrlin/Desktop/Java/JavaDocs/docs/api/java/util/package-summary.html");
//        File input = new File("C:/Users/myrlin/Desktop/Java/JavaDocs/docs/api/java/util/Arrays.html");
        File input = new File("C:/Users/myrlin/Desktop/Java/JavaDocs/docs/api/java/util/Arraylist.html");
        Document doc = Jsoup.parse(input, "UTF-8");


        Element table = doc.select("table[summary=Method Summary table, listing methods, and an explanation]").first();
//        Iterator<Element> iterator = table.select("code, div[class=block]").iterator(); //, div[class=block]
//        Iterator<Element> iterator = table.select("td[class=colFirst], td[class=colLast], div[class=block]").iterator(); //, div[class=block]
        Iterator<Element> iterator = table.select("td[class=colFirst], td[class=colLast]").iterator(); //, div[class=block]
        int count = 1;
        String name = null;
        String trimmed = null;
        while (iterator.hasNext()) {
            System.out.println(count + " text : " + iterator.next().text());
            if (iterator.hasNext()) {
                name = iterator.next().text();
                trimmed = name.split("\\)", 2)[0];   // concept from:http://stackoverflow.com/questions/18220022/how-to-trim-a-string-after-a-specific-character-in-java
                trimmed = trimmed + ")";
                System.out.println(count + " text : " + trimmed);
                System.out.println(count + " text : " + name);
            }
//            if (iterator.hasNext()) {
//                System.out.println(count + " text : " + iterator.next().text());
//            }
            System.out.println();
            count++;
        }


        /*
        System.out.println();
        System.out.println();
        System.out.println();

        Elements details = doc.select("div[class=details]");
        Iterator<Element> iter = details.select("pre, div[class=block]").iterator();   // , div, dl
        count = 1;
        while (iter.hasNext()) {
            System.out.println(count + " test : " + iter.next().text());
            count++;
        }
        */




//*************** keeper - gets the modifier and type and method name ***********************



        /*
        // ************  KEEPER **************
        // *** gets table summary from base class html file
//        File input = new File("C:/Users/myrlin/Desktop/Java/JavaDocs/docs/api/java/util/Collections.html");
        //    File input = new File("C:/Users/myrlin/Desktop/Java/JavaDocs/docs/api/java/util/Collection.html");
        //    File input = new File("/C:/Users/myrlin/Desktop/Java/JavaDocs/docs/api/java/util/package-summary.html");
//        Document doc = Jsoup.parse(input, "UTF-8");

        Element table = doc.select("table[summary=method summary table, listing methods, and an explanation]").first();
        Iterator<Element> iterator = table.select("td").iterator();
        while(iterator.hasNext()) {
            System.out.println("text : " + iterator.next().text());
            System.out.println("text : " + iterator.next().text());
        }
        // ************  KEEPER **************
        // *** gets table summary from base class html file
        */


        /*
        for (Element tableElement: table) {
            System.out.println("\n" + tableElement.text());
        }
        for (int i = 0; i < table.size(); i++) {
            System.out.println("i = " + i + ": " + table.get(i).text());
        }
        */


        //*************************




        /*
        // ***** package summary page ******

        Elements results = doc.select("table[class=typeSummary] td[class]");   //  use with package-summary.html
        for (Element item : results) {
            System.out.println();
            System.out.println(item.text());
        }

        for (int i = 0; i < results.size(); i++) {
            System.out.println("i = " + i + ": " + results.get(i).text());
        }

        // ***** package summary page ******
        */


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


