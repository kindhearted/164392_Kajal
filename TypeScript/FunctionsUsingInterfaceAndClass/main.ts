import todointerface from './todointerface';


class TaskToDo{
    todoTask:string[]=[];

      addTask(task:string){
        this.todoTask[this.todoTask.length]=task
        console.log(" =========== NEW TASK ===========\n"+"Task :'"+this.addTask[this.todoTask.length-1]+"' inserted in the list\n"+"Number of items:"+this.todoTask.length+"\n")
    }

    listAllTasks(){
        let index:number=0
        this.todoTask.forEach(element => {
            
            console.log(this.todoTask[index])
            index++
        });
    }

    deleteTask(task:string){
        //todoList[todoList.length]=task
        
        for (let index = 0; index < this.todoTask.length; index++) {
        
            if(this.todoTask[index]==task){
                console.log(" =========== DELETE TASK ===========\n"+"Task :'"+this.todoTask[index]+"' deleted in the list\n")
                this.todoTask.splice(index,1)
                
                console.log("Number of items:"+this.todoTask.length+"\n")
                break 
            }        
        }
    }

}

let taskobject1=new TaskToDo();
taskobject1.addTask("Packing Bags");
taskobject1.addTask("Booking tickets to GOA");
taskobject1.addTask("Reach to bus stop");
taskobject1.addTask("getting in ");
taskobject1.addTask("GO GOA GONE");

taskobject1.listAllTasks();

taskobject1.deleteTask("Reach to bus stop");
