interface Shape {
    color: string;
    calculateArea();
    toString();

}

class Circle implements Shape{

    color: string;
    area : number;
    radious : number;

    constructor(color:string,radious:number){
        this.color=color;
        this.radious=radious;
    }

    calculateArea(){
        this.area= 3.14*this.radious*this.radious;
    }

    toString() {
        console.log(`Circle :${this.color}: ${this.area}`);
       }

}

class Rectangle implements Shape{

    color: string;
    area: number;
    length: number;
    width:number;

    constructor(color:string, length:number,width:number){
        this.color=color;
        this.length=length;
        this.width=width;
    }

    calculateArea(){
        this.area=2*this.length*this.width;
    }

    toString() {
        console.log(`Rectangle :${this.color}: ${this.area}`);
       }

}


let circle:Shape=new Circle('Red',10);
circle.calculateArea();
circle.toString();

let rectangle:Shape=new Rectangle("Blue",10,10);
rectangle.calculateArea();
rectangle.toString();