package classes;

import java.io.FileWriter;
import java.io.IOException;

public class User 
{
    private String name;
    private String username;
    private String age;
    private String gender;
    private String password;
    private String date,month,year;

    public User(String name, String username, String age, String gender, String password,String date,String month,String year) 
	{
        this.name = name;
        this.username = username;
        this.age = age;
        this.gender = gender;
        this.password = password;
        this.month=month;
        this.year=year;
        this.date=date;

    }

    public boolean signUp() 
	{
        try (FileWriter fileWriter = new FileWriter("data\\user.txt", true)) 
		{
            String userData ="Name:"+name +"\n" +"NId Number:" +username + "\n" + "Password:"+ password + "\n" +"Gender:" +gender + "\n" + "Age:"+age+"\n"+"Birth Date:" +date+"/"+month+"/"+year+"\n*\n"; 
            fileWriter.write(userData);
            
            return true; 
        } 
		catch (IOException e) 
		{
            return false; 
        }
    } 
}

