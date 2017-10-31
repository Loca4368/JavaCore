package superKeywordUsage;

public class Base {
	
	int i;
    Base(){
    	System.out.println("Base");
        add(1);
        System.out.println(i);
    }

    void add(int v){
        i+=v;
        System.out.println(i);
    }

}
