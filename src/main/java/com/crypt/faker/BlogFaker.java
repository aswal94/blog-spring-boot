package com.crypt.faker;

import java.util.Random;

public class BlogFaker implements Faker {

    private static String[] titles = {
            "10 Ways to make yourself secure from Phishing",
            "Top 10 tips to make a project run faster",
            "How to write clean and effective code in less time"
    };

    private static String[] body = {
            "Top 10 tips to make a project run faster, Top 10 tips to make a" +
                    " project run faster, Top 10 tips to make a project run " +
                    "faster, Top 10 tips to make a project run faster, Top 10" +
                    " tips to make a project run faster,Top 10 tips to make" +
                    " a project run faster, Top 10 tips to make a project" +
                    " run faster, Top 10 tips to make a project run faster," +
                    "Top 10 tips to make a project run faster,Top 10 tips to " +
                    "make a project run faster,Top 10 tips to make a project run faster," +
                    " Top 10 tips to make a project run faster, Top " +
                    "10 tips to make a project run faster",
    };

    /**
     * Returns a unique title for the post
     *
     * @return String
     * @author aswal94
     */
    public static String getTitle() {
        int randomIndex = new Random().nextInt(titles.length);
        return titles[randomIndex];
    }

    /**
     * Returns post body
     *
     * @return String
     * @author aswal94
     */
    public static String getBody() {
        int randomIndex = new Random().nextInt(titles.length);
        return body[randomIndex];
    }

}
