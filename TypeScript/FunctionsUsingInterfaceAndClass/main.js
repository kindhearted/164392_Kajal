"use strict";
exports.__esModule = true;
var TaskToDo = /** @class */ (function () {
    function TaskToDo() {
        this.todoTask = [];
    }
    TaskToDo.prototype.addTask = function (task) {
        this.todoTask[this.todoTask.length] = task;
        console.log(" =========== NEW TASK ===========\n" + "Task :'" + this.addTask[this.todoTask.length - 1] + "' inserted in the list\n" + "Number of items:" + this.todoTask.length + "\n");
    };
    TaskToDo.prototype.listAllTasks = function () {
        var _this = this;
        var index = 0;
        this.todoTask.forEach(function (element) {
            console.log(_this.todoTask[index]);
            index++;
        });
    };
    TaskToDo.prototype.deleteTask = function (task) {
        //todoList[todoList.length]=task
        for (var index = 0; index < this.todoTask.length; index++) {
            if (this.todoTask[index] == task) {
                console.log(" =========== DELETE TASK ===========\n" + "Task :'" + this.todoTask[index] + "' deleted in the list\n");
                this.todoTask.splice(index, 1);
                console.log("Number of items:" + this.todoTask.length + "\n");
                break;
            }
        }
    };
    return TaskToDo;
}());
var taskobject1 = new TaskToDo();
taskobject1.addTask("Packing Bags");
taskobject1.addTask("Booking tickets to GOA");
taskobject1.addTask("Reach to bus stop");
taskobject1.addTask("getting in ");
taskobject1.addTask("GO GOA GONE");
taskobject1.listAllTasks();
taskobject1.deleteTask("Reach to bus stop");
