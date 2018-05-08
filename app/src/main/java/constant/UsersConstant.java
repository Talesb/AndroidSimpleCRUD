package constant;

import java.io.Serializable;
import java.util.ArrayList;

import model.User;

public class UsersConstant implements Serializable {

    private static ArrayList<User> USERS = new ArrayList<>();




    private static Integer AUTOI = 0;
    private static String useraux;

    public static ArrayList<User> getUSERS() {
        return USERS;
    }

    public static void setUSERS(ArrayList<User> USERS) {
        UsersConstant.USERS = USERS;
    }

    public static boolean save(User user){
        try {
            user.setId(AUTOI);
            USERS.add(user);
            AUTOI++;

            android.util.Log.d("MyApp","I am here"+user);
            return true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    public static boolean update(User user){
        //  User aux = new User();
        try{
            for(User u:USERS){
                if(user.getId().equals(u.getId())){
                    u.setName(user.getName());
                    u.setEmail(user.getEmail());
                    u.setCpf(user.getCpf());
                }
            }
            return true;
        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }


    public static  User find(Integer id){
        try{
            for(User u:USERS){
                if(u.getId().equals(id)){
                    return u;
                }
            }}
        catch (Exception e){
            e.printStackTrace();
        }
        return null;

    }

    public static User findByName(String name){
        try{
            for(User u:USERS){
                if(u.getName().equals(name)){
                    return u;
                }
            }}
        catch (Exception e){
            e.printStackTrace();
        }
        return null;

    }
    public static  boolean delete(User user){

        try{
            for(User u:USERS){
                if (u.getId().equals(user.getId())) {
                    USERS.remove(u);
                    return true;
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    public static  boolean deleteById(Integer id){

        try{
            for(User u:USERS){
                if (u.getId().equals(id)) {
                    USERS.remove(u);
                    return true;
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }


    public static String getUseraux() {
        return useraux;
    }

    public static void setUseraux(String useraux) {
        UsersConstant.useraux = useraux;
    }


}
