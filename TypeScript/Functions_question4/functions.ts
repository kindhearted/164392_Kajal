let  todoList: string[]=[]


function addTask(task:string){
    todoList[todoList.length]=task
    console.log(" =========== NEW TASK ===========\n"+"Task :'"+todoList[todoList.length-1]+"' inserted in the list\n"+"Number of items:"+todoList.length+"\n")
}


function listAllTasks(){
    let index:number=0
    todoList.forEach(element => {
        
        console.log(todoList[index])
        index++
    });
}


function deleteTask(task:string){
    //todoList[todoList.length]=task
    
    for (let index = 0; index < todoList.length; index++) {
    
        if(todoList[index]==task){
            //console.log(todoList[index]==task)
            console.log(" =========== DELETE TASK ===========\n"+"Task :'"+todoList[index]+"' deleted in the list\n")
            todoList.splice(index,1)
            
            console.log("Number of items:"+todoList.length+"\n")
            break 
        }        
    }
}


addTask("go to temple")
addTask("Start working with TypeScript")
addTask("take water bottle")
addTask("collect money")

deleteTask("collect money")
listAllTasks()