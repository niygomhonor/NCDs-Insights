package comment;

import com.Comments;

import java.util.List;

public interface CommentDao {

    void add(Comments comments);
    List<Comments>getAll();

}
