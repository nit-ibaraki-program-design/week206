public void add(int p, String n, int y, int m, int d) {
    //Todoを作る（TodoMain1のmainでのTodo追加処理を、仮引数を使うように変更しただけ）
    //Dateインスタンスを作る
    Date d1 = new Date();
    d1.setYear(y);
    d1.setMonth(m);
    d1.setDay(d);
    //Todoインスタンスを作る
    Todo t1 = new Todo();
    t1.setName(n);
    t1.setPriority(p);
    t1.setDeadline(d1);
    //作ったTodoをリストに追加する
    todolist.addTodo(t1);
}
