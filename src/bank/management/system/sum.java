package bank.management.system;

public class sum {
public static void main(String [] args){
    int n=10,t1=0,t2=1;
    for(int i=0;i<=n;i++){
        System.out.print(t1+", ");
        int t3=t1+t2;
        t1=t2;
        t2=t3;
    }
}}
