import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    @Test
    public void  test1(){
        User user1 = new User("Petar", "helo1234", "petar@yahoo.com");
        User user2 = new User(null, "helo12", "petar12@yahoo.com");
        ArrayList<User> users = new ArrayList<>();
        users.add(user1);
        RuntimeException ex;
        ex = assertThrows(RuntimeException.class,() -> SILab2.function(null, users));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));
        assertEquals(SILab2.function(user1, users),false);
        assertEquals(SILab2.function(user2, users),false);
        assertEquals(SILab2.function(new User("Pavle", "12212312@", "pavle11@yahoo.com"), users),true);
        assertEquals(SILab2.function(new User("Pavle", "1221 2312@", "pavle11@yahoo.com"), users),false);
    }


    @Test
    public void test2(){
        User user1 = new User("Petar", "helo1234", "petar@yahoo.com");
        User user2 = new User("Pavel", "helo12", "petar12@yahoo.com");
        ArrayList<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        //   T || T || T => user = null

        RuntimeException ex;
        ex = assertThrows(RuntimeException.class,() -> SILab2.function(null, users));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));

        //   neT || T || T => user(Petar, null, null)

        ex = assertThrows(RuntimeException.class,() -> SILab2.function(new User("Petar",null,null), users));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));

//        neT || T || neT => user(Petar, null, petar@gmail.com)

        ex = assertThrows(RuntimeException.class,() -> SILab2.function(new User("Petar",null,"petar@gmail.com"), users));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));

//        neT || neT || T => user(Petar, abv123@, null)

        ex = assertThrows(RuntimeException.class,() -> SILab2.function(new User("Petar","abv123@",null), users));
        assertTrue(ex.getMessage().contains("Mandatory information missing!"));

//        neT || neT || neT => user(Petar, abv123@, petar@gmail.com)

        assertEquals(SILab2.function(new User("Petar","abv123@","petar@gmail.com"), users), false);

    }
}