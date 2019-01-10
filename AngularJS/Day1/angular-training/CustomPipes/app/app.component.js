System.register(['@angular/core', './titlecasepipe', './textboldpipe', './limitwordpipe'], function(exports_1, context_1) {
    "use strict";
    var __moduleName = context_1 && context_1.id;
    var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
        var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
        if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
        else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
        return c > 3 && r && Object.defineProperty(target, key, r), r;
    };
    var __metadata = (this && this.__metadata) || function (k, v) {
        if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
    };
    var core_1, titlecasepipe_1, textboldpipe_1, limitwordpipe_1;
    var AppComponent;
    return {
        setters:[
            function (core_1_1) {
                core_1 = core_1_1;
            },
            function (titlecasepipe_1_1) {
                titlecasepipe_1 = titlecasepipe_1_1;
            },
            function (textboldpipe_1_1) {
                textboldpipe_1 = textboldpipe_1_1;
            },
            function (limitwordpipe_1_1) {
                limitwordpipe_1 = limitwordpipe_1_1;
            }],
        execute: function() {
            AppComponent = (function () {
                function AppComponent() {
                    this.name = "jignesh trivedi";
                    this.myText = "This is my test string.";
                }
                AppComponent = __decorate([
                    core_1.Component({
                        selector: 'test-app',
                        pipes: [titlecasepipe_1.TitleCasePipe, textboldpipe_1.BoldPipe, limitwordpipe_1.LimitWordPipe],
                        templateUrl: './app/example.html'
                    }), 
                    __metadata('design:paramtypes', [])
                ], AppComponent);
                return AppComponent;
            }());
            exports_1("AppComponent", AppComponent);
        }
    }
});
//# sourceMappingURL=app.component.js.map