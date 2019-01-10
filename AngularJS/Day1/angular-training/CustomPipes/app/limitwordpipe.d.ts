import { PipeTransform } from '@angular/core';
export declare class LimitWordPipe implements PipeTransform {
    transform(value: string, limit: string, trail: string): any;
}
