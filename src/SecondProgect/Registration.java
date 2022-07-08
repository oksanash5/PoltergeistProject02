package SecondProgect;
//Create Registration Class in which you would have variables as email,
// userName and password that have an access scope only within its own class.
//After creating an object of the class user should be able to call methods
// and in each method separately pass values to set users email, username and password.
class Registration {
    private String email;
    private String userName;
    private String password;

    void setEmail(String email) {
        // Valid email consider to be only yahoo
        if (email.endsWith("@yahoo.com")) {
            this.email = email;
            System.out.println("Email is correct");
        } else {
            System.out.println("Only yahoo email could be accepted");
        }
    }

    void setUserName(String userName) {
        //Valid userName cannot be empty and should be of length larger than 6 characters.
        if (!userName.isEmpty()) {
            if (userName.length() > 6) {
                this.userName = userName;
                System.out.println("The user name is correct");
            } else {
                System.out.println("The user name should be larger then 6 characters");
            }
        } else {
            System.out.println("The user name is empty");
        }
    }

    void setPassword(String password) {
        //Valid password cannot be empty and cannot contain userName.
        if (!password.isEmpty()) {
            if (password.length() > 6) {
                if (!password.contains(userName)) {
                    this.password = password;
                    System.out.println("You password is correct");
                } else {
                    System.out.println("The password can not contains the username");
                }
                } else{
                    System.out.println("The password should be larger then 6 characters");
                }


            } else {
                System.out.println("The password is empty");
            }
        }
    }

class Tester{
    public static void main(String[] args) {
    Registration client=new Registration();
    client.setEmail("oksana55@yahoo.com");
    client.setUserName("kmnokkk");
    client.setPassword("1234567");
  }
}