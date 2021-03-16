import java.util.HashMap;

public class Genre {

    public static void main(String[] args) {

        HashMap<String, Integer> genres = new HashMap<String, Integer>();

        genres.put ("Fiction", 40);
        genres.put ("Non Fiction",60);
        genres.put ("Period", 70);
        genres.put ("Parody", 30);

        Integer fictionGenre = genres.get("Fiction");

        String output = "The genres in fhe library are the following:" + genres.keySet();
        System.out.println(output);

        String out = "The number of books in fhe library  according to different genres are the following:" + genres.values();
        System.out.println(out);

        String go = "The number of fiction books in fhe library are:" + fictionGenre.toString();
        System.out.println(go);





    }


}
