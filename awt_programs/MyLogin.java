import java.awt.*;
class MyLogin{
    Frame f;
    TextField usr, pass;
    Label u,p;
    
    Button login;
    MyLogin(){
        f=new Frame("login");
        usr=new TextField();
        pass=new TextField();
        u=new Label("Username:");
        p=new Label("Password");
        login=new Button("Login");
        u.setBounds(50, 100, 50, 30);
        usr.setBounds(150,100, 100, 30);

        p.setBounds(50, 150, 50, 30);
        pass.setBounds(150, 150, 100, 30);
        login.setBounds(150, 200, 70, 30);
        f.setSize(500,500);//inheritance
        f.setLayout(null);
        f.add(usr);f.add(pass);f.add(login);
        f.add(u);f.add(p);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new MyLogin();
    }
}