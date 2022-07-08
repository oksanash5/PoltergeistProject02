package SecondProgect;

public class Reg {
    private String email;private  String userName;private String password;
    public void setEmail(String email){
        if(email.contains("yahoo")){
            System.out.println("It is correct");
        }else{
            System.out.println("You must Choose yahoo");
        }}
    public void setUserNameandPassword(String userName,String password){
        if(userName.isEmpty() || password.isEmpty()){
            System.out.println("Username and password must not be empty");
        }else if (userName.length()<=6 || password.length()<=6){
            System.out.println("Username and password must be larger then 6");
        }else if (password.contains(userName)){
            System.out.println("Password cannot contains userName");
        }else{
            System.out.println("All fields are correct");
        }}}
class TesterRegistration1 {
    public static void main(String[] args) {
        Reg registration=new Reg();
        registration.setEmail("gmail");
        registration.setUserNameandPassword("Khr3457","Khr3457123");
    }
}


