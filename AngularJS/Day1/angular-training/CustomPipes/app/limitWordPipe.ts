import { Pipe, PipeTransform } from '@angular/core';

@Pipe({name: 'limitword'})

export class LimitWordPipe implements PipeTransform {
  transform(value: string, limit: string, trail: string): any {
    let limitChar =  limit !=null  ? parseInt(limit) : 10;
    let trailString = (trail !=null) ? trail : '...';

    return value.length > limitChar ? value.substring(0, limitChar) + trailString : value;
  }
}