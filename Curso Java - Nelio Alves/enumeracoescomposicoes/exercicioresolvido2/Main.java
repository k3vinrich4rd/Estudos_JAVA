package enumeracoescomposicoes.exercicioresolvido2;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment firstComment = new Comment("Have a nice trip!");
        Comment secondComment = new Comment("Wow that's awesome!");
        Post firstPost = new Post(sdf.parse("21/06/2018 13:05:44"),
                "Traveling to New Zealand ",
                "I'm going to visit this wonderful country! ",
                12);
        firstPost.addComment(firstComment);
        firstPost.addComment(secondComment);

        Comment thirdComment = new Comment("Good night");
        Comment fourthComment = new Comment("May the Force be with you");
        Post secondPost = new Post(sdf.parse("28/07/2018 23:14:19"),
                "Good night guys",
                "See you tomorrow",
                5);

        secondPost.addComment(thirdComment);
        secondPost.addComment(fourthComment);

        System.out.println(firstPost);
        System.out.println(secondPost);


    }
}
