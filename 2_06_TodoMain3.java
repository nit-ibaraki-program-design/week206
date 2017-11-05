
class TodoMain3 {
    public static void main(String[] args) {
        //Viewを作成する
        TodoView todoview = new TodoView();
        //Modelを作成する
        TodoList todolist = new TodoList();
        //Controllerを作成する
        TodoController todocontroller = new TodoController();
        
        //ViewとModelを相互に関係付ける
        todolist.setTodoView(todoview);
        todoview.setTodoList(todolist);
        
        //ViewとControllerを相互に参照する
        todoview.setTodoController(todocontroller);
        todocontroller.setTodoView(todoview);
        
        //ControllerからModelを参照する
        todocontroller.setTodoList(todolist);

        //最初にViewを更新しておく
        todoview.update();
    }
}
