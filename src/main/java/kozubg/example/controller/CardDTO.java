package kozubg.example.controller;

import java.util.List;

/**
 * Created by kozub on 24.10.15.
 */
public class CardDTO {

    private String id;

    private String name;
    private String lastName;
    private String position;
    private String address;
    private String phone;
    private String mail;
    private String site;
    private List<String> tags;

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getPosition() { return position; }
    public void setPosition(String position) { this.position = position; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getSite() { return site; }
    public void setSite(String site) { this.site = site; }

    public List<String> getTags() { return tags; }
    public void setTags(List<String> tags) { this.tags = tags; }

    public String getMail() { return mail; }
    public void setMail(String mail) { this.mail = mail; }

    public static class Builder {
        private String id;
        private String name;
        private String lastName;
        private String possition;
        private String address;
        private String phone;
        private String mail;
        private String site;
        private List<String> tags;

        public Builder() {
        }

        public static Builder card() {
            return new Builder();
        }

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder possition(String possition) {
            this.possition = possition;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder mail(String mail) {
            this.mail = mail;
            return this;
        }


        public Builder site(String site) {
            this.site = site;
            return this;
        }

        public Builder tags(List<String> tags) {
            this.tags = tags;
            return this;
        }

        public CardDTO build() {
            CardDTO card = new CardDTO();
            card.setId(this.id);
            card.setName(this.name);
            card.setLastName(this.lastName);
            card.setPosition(this.possition);
            card.setAddress(this.address);
            card.setPhone(this.phone);
            card.setSite(this.site);
            card.setMail(this.mail);
            card.setTags(this.tags);
            return card;
        }
    }
}
