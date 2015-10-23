package kozubg.aghacks;

import org.springframework.data.annotation.Id;

/**
 * Created by kozub on 23.10.15.
 */
public class User {

    @Id
    private String id;

    private String mycard;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMycard() {
        return mycard;
    }

    public void setMycard(String mycard) {
        this.mycard = mycard;
    }
}
