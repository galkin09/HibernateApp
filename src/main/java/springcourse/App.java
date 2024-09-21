package springcourse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import springcourse.model.Director;
import springcourse.model.Movie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration configuration = new Configuration().addAnnotatedClass(Director.class).addAnnotatedClass(Movie.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        try {
            session.beginTransaction();

            //Получаем любой фильм, а затем его режиссера
//            Movie movie = session.get(Movie.class, 2);
//            System.out.println(movie.getOwner());

            //Добавьте еще один фильм для любого режиссера.
//            Director director = session.get(Director.class, 1);
//            Movie movie1 = new Movie("new Film", 2025, director);
//            director.getMovies().add(movie1);
//            session.save(movie1);

            //Создайте нового режиссера и новый фильм и свяжите эти сущности.
//            Director director1 = new Director("new Director", 55);
//            Movie movie2 = new Movie("new Film", 2025, director1);
//            director1.setMovies(new ArrayList<>(Collections.singletonList(movie2)));
//            session.save(director1);
//            session.save(movie2);

            //Смените режиссера у существующего фильма
//            Director director = session.get(Director.class, 7);
//            Movie movie = session.get(Movie.class, 13);
//            movie.getOwner().getMovies().remove(movie);
//            movie.setOwner(director);
//            director.getMovies().add(movie);

            //Удалите фильм у любого режиссера
//              Movie movie = session.get(Movie.class, 14);
//              session.remove(movie);
//              movie.getOwner().setMovies(null);


            session.getTransaction().commit();
        }finally {
            session.close();
        }
    }
}
