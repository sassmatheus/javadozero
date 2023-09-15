package app;

import java.text.ParseException;

/**
 *
 * @author sass
 */

import java.text.SimpleDateFormat;

import ents.Comment;
import ents.Post;

public class Program {
    
    public static void main(String[] args) throws ParseException{
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        
        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow, that's awesome");
        Post p1 = new Post(sdf.parse("18/07/2023 16:35:42"), 
                        "Traveling to Australia",
                        "Going to visit this beautiful country!",
                        13);
        
        p1.addComment(c1);
        p1.addComment(c2);
        
        
        Post p2 = new Post(
        		sdf.parse("19/07/2023 14:00:40"),
        		"Good night guys",
        		"See you tomorrow!",
        		23);
        Comment c3 = new Comment("Good night!");
        Comment c4 = new Comment("May the force be with you!");
        
        p2.addComment(c3);
        p2.addComment(c4);
        
        
        System.out.println(p2);
    }
}