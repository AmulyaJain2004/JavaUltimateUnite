import java.util.Scanner;
import java.util.ArrayList;

class List {

    public ArrayList addTask(ArrayList<String> al){
        System.out.println("Current no. of tasks: " + al.size());
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter task index: ");
        int index = sc.nextInt();
        System.out.println("Enter task: ");
        String task = sc.next();
        al.add(index, task);
        return al;
    }
    public void doneTask(ArrayList<String> al){

        al.remove(index);
        return al;
    } // delete


    public void showList(){
        System.out.println("Current no. of tasks: " + al.size());
        for (int i = 0; i < al.size(); i++) {
            System.out.println(i + ". " + al.get(i));
        }
    }

    public void updateList(int index, String[] list){}
    public void clearList(){}
}

class ToDoList {
    public static void main(String[] args) {
        while (true){
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Enter operation: ");
            System.out.println("1. Add task");
            System.out.println("2. Delete/done task");
            System.out.println("3. Show list");
            System.out.println("4. Update task");
            System.out.println("5. Clear list");
            System.out.println("6. Exit");

            String operation = sc.next();
            List todolist = new List();

            System.out.println("Enter task: ");
            String task = sc.next();

            ArrayList<String> list = new ArrayList<String>();

            switch (operation) {
                // case "1":
                //     todolist.add(list);
                //     break;
            
                case "2":
                    todolist.doneTask(list);
                    break;

                case "3":
                
                    break;

                case "4":
                
                    break;

                case "5":
                
                    break;

                case "6":
                
                    break;

                default:
                    break;
            }
            }
        }
    }
}