package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<User> subscriptions;

    public User(String username) {
        this.username = username;
        this.subscriptions = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }
    public List<User> getSubscriptions() {
        return subscriptions;
    }

    @Override
    public String toString() {
        return "Имя пользователя " + username;
    }

    public void subscribe(User user) {
        this.subscriptions.add(user);
    }
    public boolean isSubscribed(User user) {
        for(User subscriber: subscriptions) {
            if (subscriber.equals(user)) {
                return true;
            }
        }
        return false;
    }

    public boolean isFriend(User user) {
        if( this.isSubscribed(user) && user.isSubscribed(this)  ) {
            return true;
        }
        return false;
    }

    public void sendMessage(User user, String text) {
        MessageDataBase.sendMessage(this, user, text);
    }

}
