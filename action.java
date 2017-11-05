public void actionPerformed(ActionEvent e) {
    int p, y, m, d;
    String n;
    //押されたボタンがどれなのかを調べる
    if(e.getActionCommand().equals("add")) {
        //テキストフィールドから情報を取得する
        //メソッドparseIntは取得した文字列をint型に変換する
        //name, priority, year, month, dayは、
        //TextFieldの変数であり、それぞれ「名前「優先順位」「年」「月」「日」が入力されているとする
        p = Integer.parseInt(priority.getText());
        y = Integer.parseInt(year.getText());
        m = Integer.parseInt(month.getText());
        d = Integer.parseInt(day.getText());
        n = name.getText();
        //Controllerの「Todoを追加する」メソッドを呼び出す
        todocontroller.add(p, n, y, m, d);
    }        
}
