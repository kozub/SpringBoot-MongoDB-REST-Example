package kozubg.example.entity;

import org.springframework.data.annotation.Id;

import java.util.List;

/**
 * Created by kozub on 23.10.15.
 */
public class User {

    @Id
    private String id;

    private String login;
    private String token;
    private List<String> addedCard;

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getLogin() { return login; }
    public void setLogin(String login) { this.login = login; }

    public String getToken() { return token; }
    public void setToken(String token) { this.token = token; }

    public List<String> getAddedCard() { return addedCard; }
    public void setAddedCard(List<String> addedCard) { this.addedCard = addedCard; }


    public static class Builder {
        private String id;
        private String login;
        private String token;
        private List<String> addedCard;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder login(String login) {
            this.login = login;
            return this;
        }

        public Builder token(String token) {
            this.token = token;
            return this;
        }

        public Builder addedCard(List<String> addedCard) {
            this.addedCard = addedCard;
            return this;
        }

        public User build() {
            User user = new User();
            user.setId(this.id);
            user.setAddedCard(this.addedCard);
            user.setLogin(this.login);
            user.setToken(this.token);
            return user;
        }
    }
}
