package Task_9.MyAnatation;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RunnerMyAnatation {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        val(MyService.class);

    }

    public static void val(Class<?> myConstructor) {
        if (myConstructor.isAnnotationPresent(Version.class)) {
            MyService myServ = null;
            Class clazz = null;
            try {
                clazz = Class.forName(MyService.class.getName());
                Class[] params = {double.class, String.class};
                myServ = (MyService) clazz.getConstructor(params).newInstance(4, " Black");


            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                e.printStackTrace();
            }

            try {
                thisClassInfo(myServ);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }

        } else
            System.out.println("Над классом нет анатации @Version");
    }

    public static void thisClassInfo(Object myServise) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method oneMethod = myServise.getClass().getDeclaredMethod("thisClassInfo");
        oneMethod.setAccessible(true);
        oneMethod.invoke(myServise);

    }

}


