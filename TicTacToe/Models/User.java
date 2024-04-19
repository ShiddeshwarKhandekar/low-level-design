package LLD6.TicTacToe.Models;


public class User {
    private String Name;
    private String emailId;
    public static Builder getBulider(){
        return new Builder();
    }
    public static class Builder{
        User user;
        Builder(){
            user = new User();
        }

        public Builder setName(String Name) {
            this.user.Name = Name;
            return this;
        }

        public Builder setEmailId(String emailId) {
            this.user.emailId = emailId;
            return this;
        }
        public User build(){
            return this.user;
        }
    }
}
