import java.util.*;

class List {
    private ArrayList<String> list = new ArrayList<String>();

    public void setList(ArrayList<String> list) {
        this.list = list;
        System.out.println("List set");
    }

}

public class ToDoList {
    public static void main(String[] args) {;
        List list = new List();
        list.setList(new ArrayList<String>());
    }
}