var Circle = /** @class */ (function () {
    function Circle(color, radious) {
        this.color = color;
        this.radious = radious;
    }
    Circle.prototype.calculateArea = function () {
        this.area = 3.14 * this.radious * this.radious;
    };
    Circle.prototype.toString = function () {
        console.log("Circle :" + this.color + ": " + this.area);
    };
    return Circle;
}());
var Rectangle = /** @class */ (function () {
    function Rectangle(color, length, width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }
    Rectangle.prototype.calculateArea = function () {
        this.area = 2 * this.length * this.width;
    };
    Rectangle.prototype.toString = function () {
        console.log("Rectangle :" + this.color + ": " + this.area);
    };
    return Rectangle;
}());
var circle = new Circle('Red', 10);
circle.calculateArea();
circle.toString();
var rectangle = new Rectangle("Blue", 10, 10);
rectangle.calculateArea();
rectangle.toString();
