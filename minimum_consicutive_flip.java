package geeks.array;
import java.util.*;
public class minimum_consicutive_flip {
    static void prinfgroups(int arr[],int n ){
        for (int i=1;i<n;i++){
            if(arr[i]!=arr[i-1]){
                if(arr[i]!=arr[0])
                System.out.println("from " +i +" to");
            }else{
                System.out.println(i-1);
            }}
            if(arr[n-1]!=arr[0]);
            System.out.println(n-1);
        }

    public static void main (String args[]){
        int arr[]={0,0,1,1,0,0,1,1,0} ;
        int n=9;
        prinfgroups(arr, n);
}}