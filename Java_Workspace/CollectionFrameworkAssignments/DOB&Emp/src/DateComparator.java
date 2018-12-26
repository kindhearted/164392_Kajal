import java.util.Comparator;

class DateComparator implements Comparator<MyDate>{  
public int compare(MyDate d1,MyDate d2){  
if((d1.getDd()==d2.getDd())&&((d1.getMm()==d2.getMm())))
	return 0;  
else if((d1.getDd()>d2.getDd())||((d1.getMm()>d2.getMm())))
	return 1;  
else  
	return -1;  
}  
}  