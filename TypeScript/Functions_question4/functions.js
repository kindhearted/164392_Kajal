var todoList = [];
function addTask(task) {
    todoList[todoList.length] = task;
    console.log(" =========== NEW TASK ===========\n" + "Task :'" + todoList[todoList.length - 1] + "' inserted in the list\n" + "Number of items:" + todoList.length + "\n");
}
function listAllTasks() {
    var index = 0;
    todoList.forEach(function (element) {
        console.log(todoList[index]);
        index++;
    });
}
function deleteTask(task) {
    //todoList[todoList.length]=task
    for (var index = 0; index < todoList.length; index++) {
        if (todoList[index] == task) {
            //console.log(todoList[index]==task)
            console.log(" =========== DELETE TASK ===========\n" + "Task :'" + todoList[index] + "' deleted in the list\n");
            todoList.splice(index, 1);
            console.log("Number of items:" + todoList.length + "\n");
            break;
        }
    }
}
addTask("go to temple");
addTask("Start working with TypeScript");
addTask("take water bottle");
addTask("collect money");
deleteTask("collect money");
listAllTasks();
