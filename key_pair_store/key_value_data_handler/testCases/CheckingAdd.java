import com.key.value.dataHandler.interfaces.*;
import com.key.value.dataHandler.exceptions.*;
import com.key.value.dataHandler.dao.*;
import java.util.*;
import java.io.*;
public class CheckingAdd
{
public static void main(String gg[])
{
try
{
KeyValueDataHandlerInterface kvd;
kvd=new KeyValueDataHandler();
String key,value;
key=gg[0];
value=gg[1];
System.out.println(kvd.add(key,value,"977c7f42-c584-481f-a041-c1319cea428a.data"));
//System.out.println("key : "+key+" value "+value);
}catch(KeyValueException daoException)
{
System.out.println(daoException.getMessage());
}
}//main Ends
}//class Ends