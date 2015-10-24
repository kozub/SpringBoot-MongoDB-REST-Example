package kozubg.aghacks.controller;

import com.google.common.base.MoreObjects;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 *
 *
 * Created by kozub on 24.10.15.
 */
public class UserDTO {

    private String id;

    @NotEmpty
    private String login;

    @NotNull
    private String token;

    private List<String> addedCard;

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getLogin() { return login; }
    public void setLogin(String login) { this.login = login; }

    public String getToken() { return token; }
    public void setToken(String tokken) { this.token = tokken; }

    public List<String> getAddedCard() { return addedCard; }
    public void setAddedCard(List<String> addedCard) { this.addedCard = addedCard; }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("login", login)
                .add("tokken", token)
                .add("addedCard", addedCard)
                .toString();
    }


    public static class Builder {
        private String id;
        private String login;
        private String token;
        private List<String> addedCard;

        public Builder() {
        }

        public static Builder userDTO() {
            return new Builder();
        }

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

        public UserDTO build() {
            UserDTO userDTO = new UserDTO();
            userDTO.setId(this.id);
            userDTO.setLogin(this.login);
            userDTO.setToken(this.token);
            userDTO.setAddedCard(this.addedCard);
            return userDTO;
        }
    }
}
