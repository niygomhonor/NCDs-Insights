package comment;


import com.Comments;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import org.sql2o.Sql2oException;

import java.util.List;

public class SqlComment implements CommentDao {
    private Sql2o sql2o;
    public SqlComment(Sql2o sql2o){
        this.sql2o=sql2o;

    }
    @Override
    public void add(Comments comments) {
        String comment="INSERT INTO comments(name,email,subject,message) VALUES(:name,:email,:subject,:message);";
        try (Connection con = sql2o.open()) {
            int id = (int) con.createQuery(comment, true)
                    .bind(comments)
                    .executeUpdate()
                    .getKey();
            comments.setId(id);
        } catch (Sql2oException ex) {
            System.out.println(ex);
        }
    }

    @Override
    public List<Comments> getAll() {
        try (Connection con = sql2o.open()) {
            return con.createQuery("SELECT * FROM comments")
                    .executeAndFetch(Comments.class);
        }

    }
}
