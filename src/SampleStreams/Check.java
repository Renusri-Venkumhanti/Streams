package SampleStreams;

public class Check {
int k ;
public Check(int k) {
	this.k=k;
}
@Override
public boolean equals(Object o) {
	Check c = (Check)o;
	if(c.k==this.k)
			return true;
	else 
		return false;
}
}
