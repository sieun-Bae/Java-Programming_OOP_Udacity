public class Main {
    public static void main(String [] args){
        //Create a ContactsManager object called myContactsManager using default constructor
        ContactsManager myContactManager = new ContactsManager();

        //Create a new Contact variable 4 times
        Contact friend_1 = new Contact();
        friend_1.name = "friend_1";
        friend_1.phoneNumber = "01000000001";

        myContactManager.addContact(friend_1);

        Contact friend_2 = new Contact();
        friend_2.name = "friend_2";
        friend_2.phoneNumber = "01000000002";

        myContactManager.addContact(friend_2);

        Contact friend_3 = new Contact();
        friend_3.name = "friend_3";
        friend_3.phoneNumber = "01000000003";

        myContactManager.addContact(friend_3);

        Contact friend_4 = new Contact();
        friend_4.name = "friend_4";
        friend_4.phoneNumber = "01000000004";

        myContactManager.addContact(friend_4);


        Contact friend = myContactManager.searchContact("friend_4");
        System.out.println(friend.phoneNumber);
    }
}
