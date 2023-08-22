package BasicExercises.Object_Oriented_Programming;

import java.util.ArrayList;
import java.util.Arrays;

public class Object_Oriented_Programming17 {

    public static void main(String[] args) {

        /*
        Напишите программу на Java для создания класса «Фильм» с атрибутами для названия, режиссера, актеров и
        рецензий, а также методами для добавления и извлечения рецензий.
         */

//        Movie movie1 = new Movie("The Shawshank Redemption", "Frank Darabont", new ArrayList< String >(Arrays.asList("Tim Robbins", "Morgan Freeman")));
//        Movie movie2 = new Movie("The Green Mile", "Frank Darabont", new ArrayList < String > (Arrays.asList("Tom Hanks", "David Morse")));
//
//        Review review1 = new Review("Cult film", "Andrey N.", 10.0);
//        Review review2 = new Review("Masterpiece", "Aleksandr", 10.0);
//        Review review3 = new Review("A wonderful American feature film-drama", "Aleksandr", 9.5);
//        Review review4 = new Review("One of the most popular films", "MS", 9.0);
//        Review review5 = new Review("A wonderful social drama", "Aleksey", 9.7);
//
//        movie1.addReview(review1);
//        movie1.addReview(review2);
//        movie1.addReview(review3);
//        movie1.addReview(review4);
//
//        movie2.addReview(review3);
//        movie2.addReview(review4);
//        movie2.addReview(review5);
//
//        System.out.println("Review of The Shawshank Redemption: ");
//        for (Review review : movie1.getReviews()) {
//            System.out.println(review.getReviewText() + ", by " + review.getReviewersName() + " - " + review.getRating());
//        }
//
//        System.out.println("\nReview of The Green Mile: ");
//        for (Review review : movie2.getReviews()) {
//            System.out.println(review.getReviewText() + ", by " + review.getReviewersName() + " - " + review.getRating());
//        }
    }
}

//class Movie {
//
//    private String title;
//    private String director;
//    private ArrayList <String> actors;
//    private ArrayList <Review> reviews;
//
//    public Movie(String title, String director, ArrayList <String> actors) {
//        this.title = title;
//        this.director = director;
//        this.actors = actors;
//        this.reviews = new ArrayList <Review>();
//    }
//
//    public void addReview(Review review) {
//        reviews.add(review);
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public String getDirector() {
//        return director;
//    }
//
//    public ArrayList <String> getActors() {
//        return actors;
//    }
//
//    public ArrayList <Review> getReviews() {
//        return reviews;
//    }
//}
//
//class Review {
//
//    private String reviewText;
//    private String reviewersName;
//    private double rating;
//
//    public Review(String reviewText, String reviewersName, double rating) {
//        this.reviewText = reviewText;
//        this.reviewersName = reviewersName;
//        this.rating = rating;
//    }
//
//    public String getReviewText() {
//        return reviewText;
//    }
//
//    public String getReviewersName() {
//        return reviewersName;
//    }
//
//    public double getRating() {
//        return rating;
//    }
//}